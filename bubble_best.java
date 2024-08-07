//bubble sort best case scenario

public class bubble_best {
    static void bubble_sort(int arr[], int n){
        for(int i=n-1; i>=0; i--){
            int didSwap = 0;
            for(int j=0; j<=i-1; j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if(didSwap == 0){
                break;
            }
        }
        System.out.println("After Sorting");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,1,5,7,2,8,10};
        int n = arr.length;
        System.out.println("Before sort");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        bubble_sort(arr, n);
    }    
}