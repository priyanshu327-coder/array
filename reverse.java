public class reverse{
	public static void main(String ...s){
		String str="a+((b-c)+d)";
		String res=" ";
		for(int i=0;i<str.length();i++){
		if(str.charAt(i)=='(' || str.charAt(i)==')'){
			continue;
		}else{
			res+=str.charAt(i);
		}
		}
		System.out.print(res);
	}
}