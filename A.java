class A{
	public static void main(String ...s){
		for (int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
			if(i==1||i==5||j==1||j==5||(i==j && i>=3)){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
		}
		System.out.println();
		}
	}
}
		