package homeWorkThread;

public class ThreadExample {

	public static void main(String[] args) throws InterruptedException {
		var thread1 = new Thread(new MyThread("Работа первого потока"));
		var thread2 = new Thread(new MyThread("Работа второго потока"));
		var thread3 = new Thread(new MyThread("Работа третьего потока"));
		var thread4 = new Thread(new MyThread("Работа четвёртого потока"));
		var thread5 = new Thread(new MyThread("Работа пятого потока"));
		var thread6 = new Thread(new MyThread("Работа шестого потока"));
		
		thread1.start();
		thread2.start();
		thread1.join();
		thread2.join();
		
		thread3.start();
		thread3.join();
		
		thread4.start();
		thread5.start();
		thread4.join();
		thread5.join();
		
		thread6.start();
	}

}
