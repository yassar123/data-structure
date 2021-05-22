import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
 class Main {  
    public static void insertionSort(int arr[],int n) {    
        for(int i=1;i<n;i++){
			int temp = arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>temp){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
    }  
       
    public static void main(String a[]){    
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			int n = sc.nextInt();
			int[] arr1 = new int[n];
			for(int i=0;i<n;i++){
				arr1[i] = sc.nextInt();
			}    
            
        	insertionSort(arr1,n);//sorting array using insertion sort    
               
     		
			 for(int i=0;i<n;i++){
				 System.out.print(arr1[i]+" ");
			 }
			System.out.println();
		}
           
    }    
}