class checksort{
        public static boolean check(int[] nums) {
            int count = 0;
            int n = nums.length;
            for(int i=0; i<n; i++){
                if(nums[i] > nums[i+1]%n){
                    count++;
                }
            }
            return (count <= 1);
        }
    public static void main(String[] args) {
        int arr[] = {2,3,4};
        System.out.println(check(arr));
    }
}