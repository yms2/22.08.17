package project1;

//비동기
class Calculator {
	private int memory;
	public int   getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			
		}
		System.out.println(Thread.currentThread().getName()+":"+this.memory);
	}
}

class AThread extends Thread{

	public void setCalculator(Calculator calculator) {
		// TODO Auto-generated method stub
		
	}
	
}

class AThread extends Thread{
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("AThread");
		this.calculator = calculator;
	}
}

class BThread extends Thread{
	private Calculator calculator;
	public void setCalculator(Calculator calculator) {
		this.setName("BThread");
		this.calculator = calculator;
	}
	@Override
	public void run() {
		calculator.setMemory(50);
	}
}

public class pro05 {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();;
		
		AThread ath1 = new AThread();
		ath1.setCalculator(calculator);
		ath1.start();
		
		BThread

		
		
	}

}
