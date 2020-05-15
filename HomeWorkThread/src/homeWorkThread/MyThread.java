package homeWorkThread;

public class MyThread implements Runnable {
	private String message;
	
	public MyThread(String message) {
		this.message = message;
	}

	@Override
	public void run() {
		System.out.println(message);
	}
}
