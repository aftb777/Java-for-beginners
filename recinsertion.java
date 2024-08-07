public class recinsertion {
    static void insertion(int arr[], int i, int n){
        if(i==n) return;
        int j=i;
        while(j>0 && arr[j-1]>arr[j]){
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
            j--;
        }
        insertion(arr, i+1, n);
    }   
    public static void main(String[] args) {
        int arr[] = {4,1,7,9,0};
        int n = arr.length;
        System.out.print("Before Sorting : ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        insertion(arr, 0, n);
        System.out.print("After Sorting : ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}