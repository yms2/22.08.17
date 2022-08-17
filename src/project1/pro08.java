package project1;

class A1Thread extends Thread{
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("A1Thread 작업 내용");
			}else {
				Thread.yield();
			}
		}
		System.out.println("A1Thread 종료");
	}
}

class A2Thread extends Thread{
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("A2Thread 작업 내용");
			}else {
				Thread.yield();
			}
		}
		System.out.println("A2Thread 종료");
	}

}
public class pro08 {

	public static void main(String[] args) {
		
		A1Thread a1thread = new A1Thread();
		A2Thread a2thread = new A2Thread();
		a1thread.start();
		a2thread.start();
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {}
		a1thread.work = false;
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {}
		a2thread.work = true;
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {}
		a1thread.stop = true;
		a2thread.stop = true;
	}

}
