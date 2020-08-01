package java8.v1.lambda;

public class RunableWithLambda extends Thread{
	
	public RunableWithLambda(Runnable r){
		super(r);
	}

	public static void main(String[] args) {
		Runnable r = () -> {
			for (int i = 0; i < 10; i++) {
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Thread :- " + Thread.currentThread().getName() + " :: Counter :- " + i);
			}
		};
		
		Thread t = new RunableWithLambda(r);
		t.start();
		
		
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread :- " + Thread.currentThread().getName() + " :: Counter :- " + i);
		}
	}
}
