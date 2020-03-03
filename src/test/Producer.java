package test;

public class Producer implements Runnable{
	Q q;
	Thread t;
	public Producer(Q q) {
		this.q=q;
		t= new Thread(this, "Producer");
	}
	
	@Override
	public void run() {
		int i=0;
		while(true) {
			q.put(i++);
			
		}
	}

}
