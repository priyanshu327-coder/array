import java.util.*;
class max2d{
public static int max(int x[][]){
	int min=Integer.MAX_VALUE;
	for(int i=0;i<x.length;i++){
		for(int j=0;j<x[i].length;j++){
			if(min>x[i][j]){
				min=x[i][j];
			}
		}
	}
		return min;


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
		
		System.out.println("max: "+max(x));
}
}
				