public static int[] implementMergeSort(int arr[], int start, int end)
    {
        // Your code here
       // You can have your own function where you will use 
      // start and end position for divide purpose 
        if(start < end){ //base case
            int mid = start + (end-start)/2;
            //recursive calls
            implementMergeSort(arr, start, mid); //sort left half
            implementMergeSort(arr, mid+1, end); //sort right half

            //merge both the sorted parts
            merge(arr, start, mid, end);
        }
        return arr;
    }
public static void merge(int arr[],int start, int mid, int end){
        int[] temp = new int[end - start + 1];
        // start - 6
        // end - 10
        // 6, 7, 8, 9,10 -> 5 elements
        // end - start => 10-6 = 4 //wrong answer
        // end - start + 1 => 10-6+1 = 5 //correct answer
        int i = start;
        int j = mid+1;
        int k=0;
        
        // 6, 7, 8, 9, 1, 2
        // 0, 1, 2, 3, 4, 5
        // start =0, mid = 3, end = 5
        // i =0, j =6, k=2
        while(i <= mid && j <= end){
            if(arr[i] <= arr[j]){
                temp[k] = arr[i];
                i++;
                k++;
            }
            else{
                temp[k] = arr[j];
                j++;
                k++;
            }
        }
        // 1, 2,6, 7, 8, 9
        //   i =0, j =6, k=2
        //copy remaining elements of first part
        while(i <= mid){
            temp[k] = arr[i];
            i++;
            k++;
        }
        //copy remaining elements of second part
        while(j <= end){
            temp[k] = arr[j];
            j++;
            k++;
        }

        //copy elements from temp[] to arr[]
        k =0;
        for(int m = start; m<= end; m++){
            arr[m] = temp[k];
            k++;
        }
}
