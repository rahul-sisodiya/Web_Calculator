public class sorting {


/////    Bubble sort   asending order 
//     7 8 3 1 2   
///    7 3 1 2 8
//     3 1 2 7 8
//     1 2 3 7 8

public static void printarr(int arr[],int n){
  
    for ( int i = 0; i < n ; i++){
        System.out.print(arr[i]+" ");

    }


}



public static void main(String[] args) {
    int arr[] = {7,8,3,1,2};

    // bubble sort
    int n = arr.length;
    for (int i = 0;i< n-1 ; i++ ){
        for (int j = 0 ; j < n-i-1; j ++){
            if(arr[i] > arr[i+1]){
                // swap
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
    printarr(arr, n);


}










































    
}
