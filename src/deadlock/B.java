package deadlock;



public class B {
synchronized void foo(A a) {
	String name= Thread.currentThread().getName();
	System.out.println(name+" inside B.foo ");
	
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println(name+" Tying to call A.last ");
	a.last();
}

synchronized void last() {
	System.out.println(" inside B.last ");
}
}
