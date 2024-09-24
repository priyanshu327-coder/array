import java.util.Arrays;
class nonrepeating{
	public static void nonrepeating(int arr[]){
	Arrays.sort(arr);
	}
	public static void main(String ...s){
		
		int arr[]={1,2,-1,1,3,1};
		nonrepeating(arr);
		int ans=0;
		for(int i=0;i<arr.length;i++){
			if((ans^arr[i])==0){
			continue;}
			else{
				System.out.print(arr[i+1]+" ");
			}
		}
	}
}