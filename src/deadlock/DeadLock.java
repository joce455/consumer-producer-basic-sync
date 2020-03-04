package deadlock;

public class DeadLock implements Runnable{
	A a= new A();
	B b= new B();
	Thread t;
	
	DeadLock(){
		Thread.currentThread().setName("Main thread");
		t = new Thread(this, "Racing thread");
		
	}
	void deadLockStart() {
		t.start();
		a.foo(b);
		System.out.println(" Bacc inside MAIN thread ");
	}
public static void main (String args[]) {
	DeadLock d= new DeadLock();
	d.deadLockStart();
}

@Override
public void run() {
	b.foo(a);
	System.out.println(" Back inside other thread ");
	
}
}
