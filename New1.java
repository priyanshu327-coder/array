class New1{
	public static void main(String ...s){
		try{
			int x=10/s.length;
			System.out.print(x);
			int z[]=new int[s.length];
			z[10]=400;
		}
		catch(Exception e){
			if(e instanceof ArithmeticException){
				System.out.print(e+"Ae");
			}
			if(e instanceof ArrayIndexOutOfBoundsException){
				System.out.print(e+"Aiobe");
			}
		}
	}
}