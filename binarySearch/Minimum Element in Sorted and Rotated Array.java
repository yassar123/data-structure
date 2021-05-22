import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {	
	public static int findMin(int arr[], int low, int high)  
	{  
    while(low < high) 
    { 
        int mid = low + (high - low) / 2; 
        if (arr[mid] == arr[high]) 
            high--; 
              
        else if(arr[mid] > arr[high]) 
            low = mid + 1; 
        else
            high = mid; 
    } 
    return arr[high]; 
	}
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine()); // t is number of test cases
		while(t-- > 0){
			
			int n = Integer.parseInt(br.readLine());
			String[] str = br.readLine().split(" ");
			int a[] = new int[n];

			for(int i = 0; i<n; i++){
				a[i] = Integer.parseInt(str[i]);
			}
			System.out.println(findMin(a,0,n-1));
		}
	}
