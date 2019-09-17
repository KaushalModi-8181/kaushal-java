 package co.edureka;

import javax.jws.WebParam.Mode;

import co.edureka.product.Mobile;

// Texual representation how an object will look like in the memory
 // Whatever we write in class is an actual property of object as we describing the object.
 // If you want anything belong to class make it static!!
 class product{
	 // Attributes 
	// private int pid;
	 int pid;
	 String name;
	 int price;
	 
	 // constructor
	 product(){
		 System.out.println(" >> Product Object Constructed");
	 }
	 
	 // Methods
	 // To write data in object we have this Method
	 void setProductDetails(int pid, String name, int price) {
		 
		 this.pid= pid;
		 this.name = name;
		 this.price = price;
		 System.out.println(">> Data written in product Object");
	 }
	 
	 // To read data from product Object.
	 void showProductDetails() {
		 System.out.println("---------Product ID:" +pid+"-------");
		 System.out.println("Name:\t"+name);
		 System.out.println("Price:\t"+price);
		 System.out.println("--------------");
		 }
	 //setter
	 void setPid(int pid) {
		 this.pid =pid; // this means  refrence to currunt object
		 // LHS belongs to object and RHS belongs to method
	 }
	 //getter
	 int getPid() {
		 return pid;
		 
	 }
	 
	 class Mobile extends product{ // IS-A relationa, Mobile IS-A product ,Mobile is product , Product is parent
		
		 // Additional Attributes of Mobile other than product
		 
		 String os;
		 int ram;
		 int sdCardSize;
		 
		Mobile(){
			System.out.println(">>Mobile Object Constructed");
		}
		 void setProductDetails(int pid, String name, int price, String os, int ram, int sdCardSize) {
			 
			 this.pid= pid;
			 this.name = name;
			 this.price = price;
			 this.os= os;
			 this.ram= ram;
			 this.sdCardSize= sdCardSize;
			 System.out.println(">> Data written in product Object");
	 }
 }
public class InheritanceApp {

	// main is executed by JVM when my program will run !!
	public void main(String[] args) {
	
		/*
		// Create an object : Product
		product product1 = new product();
		
		// product is not an object its a reference variable which holds hashCode of the object in hexadecimal notation
		System.out.println("product is:" + product1);
// writing data in the object
		
	product1.setProductDetails(101,"iPhoneX",70000);
	
	product1.showProductDetails();
	
	System.out.println();
	// lets write data directly
	product product2 = new product();
	//product2.pid = 201; because its private with id
	product2.setPid(201);
	product2.name = "Nike Shoes";
	product2.price = 5000;
	product2.showProductDetails();
	
	*/
		//Requesting to get Mobile Object Constructed !!
		
		Mobile mobile = new Mobile();
		mobile.setProductDetails(303," iphonex", 70000);
	}
