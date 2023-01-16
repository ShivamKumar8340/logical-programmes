class ThreadDemoBYLambda {
	public static void main(String args[]) {
		Runnable r = ()->{
			System.out.println("Thread is running");
		};
		Thread t1 = new Thread(r);
		t1.start();
	}
}