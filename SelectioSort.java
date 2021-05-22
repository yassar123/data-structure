import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			int size = sc.nextInt();
			int arr[]=new int[size];
			for(int i=0;i<size;i++)
			{
				arr[i]=sc.nextInt();
			}
			selection(arr,size);
			for(int i=0;i<size;i++)
			{
		
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		
	}
	static void selection(int a[],int n)
	{
		for(int i=0;i<n-1;i++)
		{
			int min=i;
			for(int j=i+1;j<n;j++){
				if(a[j]<a[min]){
					min = j;
				}
			}
			if(min!=i){
				int temp = a[min];
				a[min] = a[i];
				a[i] = temp;
			}
				
		}
	}
}
