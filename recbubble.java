public class recbubble{
    public static void bubble_sort(int[] arr, int n){
        if(n == 1) return;
        for(int i=0; i<=n-2; i++){
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }   
        }
        bubble_sort(arr, n-1);
    }
    public static void main(String[] args) {
        int arr[] = {6,2,4,7,0,1};
        int n = arr.length;
        System.out.print("Before Sorting : ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("After Sorting : ");
        bubble_sort(arr, n);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}