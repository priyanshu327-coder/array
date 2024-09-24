class matrixsum{
	public static int matrixsum(int x[][]){
	int max=-9999;
		for(int i=0;i<x.length;i++){
			
			for(int j=i;j<x[i].length;j++){
		if(max<x[i][j]){
			max=x[i][j];
			
			}
		}
		}
			return max;
	}
			
		
		
		
		
		
		
		
		
		public static void main(String ...s){
			int x[][]={{1,2,3},{4,5,6},{7,8,9}};
			int a=matrixsum(x);
		System.out.print(a);
		}
	}