package project1;

 class SumThread extends Thread{
	 private long sum;
	 public long getSum() {
		 return sum;
	 }
	 public void setSum(long sum) {
		 this.sum = sum;
	 }
	 
	 @Override
	public void run() {
		 for(int i =1;i<=100;i++) {
			 sum = sum+i;
		 }
		 
	}
 }

public class pro09 {

	public static void main(String[] args) {

		SumThread sumThread = new SumThread();
		sumThread.start();
		
		try {
			sumThread.join();
		}catch(InterruptedException e) {
		}
		System.out.println("1~100합:"+sumThread.getSum());
	}

}
