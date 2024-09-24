class pt{
	public static void main(String ...s){
		int n=7;
		for(int i=1;i<=7;i++){
			for(int j=1;j<=7;j++){
				if(i==1||j==7||i==7||j==1){
					System.out.print("#");
				}
		else if((i==j || i+j==8)){
					System.out.print("#");
				}
				else{
					System.out.print(" ");
				}
			}
				System.out.println();
			
		}
	}
}