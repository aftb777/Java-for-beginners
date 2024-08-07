import java.util.*;
class book {
    public static void intersection(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> intersectionList = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int j = 0; j < arr2.length; j++) {
            if (set.contains(arr2[j])) {
                intersectionList.add(arr2[j]);
                set.remove(arr2[j]);
            }
        }
        System.out.print("Intersection numbers: ");
        for (int num : intersectionList) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5}; 
        int[] arr2 = {1, 3, 5, 6}; 
        intersection(arr1, arr2);
    }
} 