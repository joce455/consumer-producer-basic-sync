package deadlock;

public class A {

	synchronized void foo(B b) {
		String name= Thread.currentThread().getName();
		System.out.println(name+" inside A.foo ");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println(name+" Tying to call B.last ");
		b.last();
	}

	synchronized void last() {
		System.out.println(" inside B.last ");
	}
	}

