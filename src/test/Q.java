package test;

public class Q {
 int n;
 boolean valueSet = false;
 
 synchronized int get() {
	 while(!valueSet) 
		 try {
			 wait();
		 }
		 catch (Exception e) {
		 }
	     System.out.println("GET: "+ n);
		 valueSet=false;
		 notify();
	 return n;
 }


synchronized void put(int n) {
	 while(valueSet)  
		 try {
			 wait();
		 }
		 catch (Exception e) {

		 }
	    System.out.println("PUT: "+ n);
		 this.n=n;
		 valueSet=true;
		 notify();
		 }
	
}
