class ThrowException{
	int age;
	void getAge(int age){
		if(age<18){
			try{
				throw new ArithmeticException("invalid age");
			}
			catch(ArithmeticException e){
				System.out.print(e.getMessage());
				System.out.print(e);
			}
		}
		else{
			this.age=age;
		}
	}
	public static void main(String ...s){
	new ThrowException().getAge(10);
}
}