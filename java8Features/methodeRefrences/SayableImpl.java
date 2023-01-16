class SayableImpl {
	public void saySomething() {
		System.out.println("Hello i am instance methode ");
	}

	public static void main(String args[]) {
		Sayable s = new SayableImpl()::saySomething;
		s.say();

	}
}