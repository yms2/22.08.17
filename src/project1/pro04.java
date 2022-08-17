package project1;

class CalcThread extends Thread{
	public CalcThread(String name) {
		this.setName(name);
	}
	
	public void run() {
		for(int i =0;i<2000000000;i++ ) {
			
		}
		try {
			
		Thread.sleep(2000);
		}catch(InterruptedException e) {
			
		}
		System.out.println(this.getName());
	}
}


public class pro04 {

	public static void main(String[] args) {
		for(int i =1;i<=10;i++) {
				Thread thread = new CalcThread("thread"+i);
				if(i!=10) {
					thread.setPriority(Thread.MIN_PRIORITY);
				}else {
					thread.setPriority(Thread.MAX_PRIORITY);
				}
				thread.start();
			}
		}
	}
