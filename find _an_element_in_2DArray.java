import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	
	public static void main (String[] args) throws IOException {
    	BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		String[] rowcol = rd.readLine().split(" ");
		int rows = Integer.parseInt(rowcol[0]);
		int cols = Integer.parseInt(rowcol[1]);
		int queries = Integer.parseInt(rowcol[2]);
		int[][]arr = new int[rows][cols];
		for(int r=0;r<rows;r++){
			String[] rowStr = rd.readLine().split(" ");
				for(int c=0; c<cols; c++){
					arr[r][c] = Integer.parseInt(rowStr[c]);
				}
		}
		for(int i=0;i<rows;i++)
		{
			Arrays.sort(arr[i]);
		}
		while(queries-->0){
			int key = Integer.parseInt(rd.readLine());
			System.out.println(binarySearch(arr,rows,cols,key));
		}
	}
	static String binarySearch(int a[][], int row, int n,int x){
		
		while(row-->0){
			int l=0;
			int h=n-1;
			if(x >= a[row][0] && x <= a[row][n-1])
			{
				while(l<=h){
				
					int mid = l + (h-l)/2;
					if(a[row][mid] == x){
						return "Yes";
					}
					else if(a[row][mid] > x){
						h = mid - 1;
					}
					else{
						l = mid + 1;
					}
				}
			}
			
		}
		
		return "No";
	}
}
