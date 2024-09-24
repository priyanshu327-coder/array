class count{
	public static void cnt(int arr[],int n){
		boolean visited[]=new boolean[n];
		for(int i=0;i<n;i++){
			if(visited[i]==true)
			continue;
			int count=1;
			for(int j=i+1;j<n;j++){
			if(arr[i]==arr[j]){
				visited[j]=true;
				count++;
			}
			}
			System.out.println(arr[i]+" "+count);
			
		}
	}
		
		public static void main(String ...s){
		int arr[]={10,5,10,5,15,15};
	int n=6;
	cnt(arr,n);}
	}