class quicksort{
	public static int partition(int arr[],int s,int e){
		int pivot=arr[s];
		int cnt=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<pivot){
				cnt++;
		}}
		//place pivot at right posititon
		int pivotindex=s+cnt;
		swap(arr[pivotindex],arr[start]);
		//left and right wale part
		int i=s,j=e;
		while(i<pivotindex && j>pivotindex){
			while(arr[i]<pivot){
				i++;
			}
			while(arr[i]>pivot){
			j--;}
			if(i<pivotindex && j>pivotindex){
			swap(arr[i++],arr[j--]);
			}
		}
		return pivotindex;
	}
	
	
	
	
	
	
	
	
	public static void quicksort(int arr[],int s,int e){
	//base case
if(s>=e){
return;
}
//partititon
int p=partition(arr,s,e);
//left part sort
quicksort(arr,s,p-1);
//right part sort
quicksort(arr,p+1,e);
	}
	
		
		
		
		
		
		
	}
	public static void main(String ...s){
		int arr[]={2,4,1,6,9};
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
	}
		