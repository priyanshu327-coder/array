public class Ascii{
	public static void main(String ...s){
		String str="1.Python & 2.Java";
		String res=" ";
		str=str.toLowerCase();
		
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch>='a' && ch<='z' ){
				res+=str.charAt(i);
			}else{
				continue;
			}
		}
		System.out.print(res);
	}
}