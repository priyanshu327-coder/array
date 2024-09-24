import java.util.Arrays;
class Median{
	public static void Median(int arr[],int n){
	Arrays.sort(arr);

		if(n%2==0){
			int ind1=(n/2)-1;
			int ind2=n/2;
			System.out.print((double)(arr[ind1]+arr[ind2])/2);
		}
		else{
			System.out.print(arr[n/2]);
		}
}
	
public static void main(String ...s){
		int arr[]={2,5,6,7,8};
		int n=5;
		Median(arr,n);
	}
}