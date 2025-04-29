class Solution {
    public long countSubarrays(int[] nums, long k){
        long result = 0; 
        for (int c = 0; c < nums.length; c++){
            long sum = 0;
            int i = c + 1;
            while (sum < k && i <= nums.length) {
                int[] subArray = Arrays.copyOfRange(nums, c, i);
                sum = Arrays.stream(subArray).sum() * subArray.length;
                if (sum < k) {
                    i++;
                    result++;
                }
            }
        }
        return result;
    }
}