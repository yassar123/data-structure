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
			bubble(arr,size);
			for(int i=0;i<size;i++)
			{
		
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		
	}
	static void bubble(int a[],int n)
	{
		for(int i=0;i<n-1;i++)
		{
			boolean flag = false;
			for(int j=0;j<n-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					//int k;
					int k=a[j+1];
					a[j+1]=a[j];
					a[j]=k;
					flag = true;
				}
			}
			if(flag==false){
				break;
			}
		}
	}
}
