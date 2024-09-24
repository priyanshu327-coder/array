import java.util.Arrays;
class reaarange{
	public static void main(String ...s){
		int arr[]={1,4,2,5,8,7};
		int n=6;
		Arrays.sort(arr);
		for(int i=0;i<n/2;i++){
			System.out.print(arr[i]+" ");
		}
		for(int i=n-1;i>=n/2;i--){
			System.out.print(arr[i]+" ");
		}
	}
}