import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	
	 public static long CountUsingMergeSort(int arr[],int start,int end){
	 	long count=0;
		 if(start<end){
 		
			int mid = start +(end-start)/2;
	 		count +=CountUsingMergeSort(arr,start,mid);
			count +=CountUsingMergeSort(arr,mid+1,end);
			count += countMerge(arr,start,mid,end);
		 }
	 		return count;
	 }
	public static long countMerge(int arr[],int start,int mid,int end){
		 int[] left = Arrays.copyOfRange(arr, start, mid + 1);
        int[] right = Arrays.copyOfRange(arr, mid + 1, end + 1);
		
		int i = 0, j = 0, k = start;
		long swaps = 0;
 
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j])
                arr[k++] = left[i++];
            else {
                arr[k++] = right[j++];
                swaps += (mid + 1) - (start + i);
            }
        }
        while (i < left.length)
            arr[k++] = left[i++];
        while (j < right.length)
            arr[k++] = right[j++];
        return swaps;

	}
	
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i =0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		long total = CountUsingMergeSort(arr,0,size-1);
		System.out.print(total);
	}
}
