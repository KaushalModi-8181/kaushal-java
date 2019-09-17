/*class MyTask {
	void executeTask() {
		
		for(int doc=1; doc<10;doc++)
			System.out.println(" @@ Printing Document==" +doc+ "- Printer2");
		*/

		// MyTask IS-A thread
	/*	class MyTask extends Thread{
			@Override 
			public void run() {
				
				for(int doc=1; doc<10;doc++)
					System.out.println(" @@ Printing Document==" +doc+ "- Printer2");
	}}
*/
class CA{
	
}

class MyTask extends CA implements Runnable{
			@Override 
			public void run() {
				
				for(int doc=1; doc<10;doc++)
					System.out.println(" @@ Printing Document==" +doc+ "- Printer2");

			}
public  class App {

	// main method represent main thread 
	public void main(String[] args) {
		
		// whatever we write in here executed by main thread
        // threads always execute the job in sequence
		// execution context
		
		// job1
		System.out.println("==Application Started==");
		
		//job2
		//MyTask task =new MyTask(); // child thread or worker thread
		//task.executeTask();
		//task.start();
		
		Runnable r = new MyTask();
		Thread task = new Thread(r);
		task.start();
			//job3
			// some code to print document 
			for(int doc=1;doc<=10;doc++) {
			System.out.println("^^Printing Document #" +doc+ "-  Printer1");
			}}}}


