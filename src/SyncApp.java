
class Printer{
	synchronized void printDocuments(int numOfCopies, String docName) {
		for (int i=1;i<numOfCopies;i++) {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			System.out.println(">> Printing " +docName +" "+i);
		}
	}
}


class MyThread extends Thread{
	
	Printer pRef;
	MyThread(Printer p){
		pRef =p;
		
	}
	
	@Override
	public void run() {
		
		
		pRef.printDocuments(10, "johnsprofile.pdf");
	}
}
class YourThread extends Thread{
	
	Printer pRef;
	YourThread(Printer p){
		pRef =p;
		
	}
	
	@Override
	public void run() {
		pRef.printDocuments(10, "Fionasprofile.pdf");
	}
}



public class SyncApp {

	public static void main(String[] args) {

		System.out.println("== Application Started==");
		
		Printer printer = new Printer();
		printer.printDocuments(10, "Ishants.pdf");
		
		MyThread mRef = new MyThread(printer);
		YourThread yRef = new YourThread(printer);
		mRef.start();
		try {
			mRef.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		yRef.start();
		
		System.out.println("==Application Finished");
	}

	private static MyThread MyThread(Printer printer) {
		// TODO Auto-generated method stub
		return null;
	}

}
