class ReverseString {
	public static void main(String args[]) {
		String name = "shivam";
		String reverse = "";
		for(int i = name.length()-1;i>=0;i--) {
			char c = name.charAt(i);
			reverse = reverse+c;
		}

		System.out.println(reverse);

	}
}