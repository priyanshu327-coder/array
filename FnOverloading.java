import java.util.*;
class FnOverlaoading{
	static void show(int x,long f){
		System.out.println("int long arguments");
	}
	static void show(long x,int z){
		System.out.println("long int argument");
	}
	public static void main(String ...s){
		show(10,10l);//int long arguments;
		show(10l,10);//long int arguments;
	show(10,10);//error}
}
}