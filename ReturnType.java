class ReturnType{
	static void show(char x){
		System.out.println("no return type");
	}
	static int show(int z){
		System.out.println("with return type");
		return z;
	}
	public static void main(String ...s){
		show('a');//no return type
		show(200);//with return type
		int a=show(10);//with return type
		System.out.println(a);//10
	}
}