import java.util.*;
class sort{
	public static void sort2(int x[][]){
		for(int i=0;i<x.length;i++){
			for(int j=0 ;j<x[i].length-1;j++){
				for(int k=0;k<x[i].length-j-1;k++){
				if(x[k][i]>x[k+1][i]){
	int temp=x[k+1][i];
	x[k+1][i]=x[k][i];
x[k][i]=temp;}
			}
		}
		}
	
	for(int i=0;i<x.length;i++){
		for(int j=0;j<x[i].length;j++){
			System.out.print(x[i][j]+" ");
		}
		System.out.println();
	}
	}
		
		
	
	
	public static void main(String ...s){
	int i,j;
	Scanner sc=new Scanner(System.in);
			System.out.println(" enter the size of rows");
			i=sc.nextInt();
			System.out.println("enter the size of column");
			j=sc.nextInt();
			int x[][]=new int[i][j];
			for( i=0;i<x.length;i++){
				for( j=0;j<x[i].length;j++){
					x[i][j]=sc.nextInt();
				}
		System.out.println();
			}
			
		
		for(  i=0;i<x.length;i++){
			for(  j=0;j<x[i].length;j++){
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
		
		sort2(x);
}
}
				