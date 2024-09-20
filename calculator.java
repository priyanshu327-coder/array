import java.util.*;
class calculator{
	public static void main(String ...s){
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
char c=scan.next().charAt(0);
switch(c){
	case '+' :System.out.println(a+b);
	break;
	case '-' :System.out.println(a-b);
	break;
	case '*' :System.out.println(a*b);
	break;
}
	}
}
		