class FunOver{
	static void show(){
		System.out.println("zero Arguments");
	}
	static void show(int x){
		System.out.println("one Arguments");
	}
	static void show(int x,int y){
		System.out.println("two Arguments");
	}
	static void show(int x,int y,int z){
		System.out.println("three Arguments");
	}public static void main(String ...s){
		show();
		show(10);
		show(10,10);
	show(10,10,10);}
}