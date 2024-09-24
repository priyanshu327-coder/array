class sort2d{
public static void sort(int x[]){
	int temp=0;
for(int i=0;i<x.length;i++){
	for(int j=i+1;j<x.length;j++){
		if(x[i]>x[j]){
			temp=x[i];
			x[i]=x[j];
			x[j]=temp;
		}
	}
}
for(int i=0;i<x.length;i++){
	System.out.print(x[i]+" ");
}
}








public static void main(String ...s){
int arr[]={68,110,02,1,5};
sort(arr);
}
}