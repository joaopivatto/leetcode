public long countSubarrays(int[] nums, int k) {
    int max = Arrays.stream(nums).max().orElse(Integer.MIN_VALUE);
    int count = 0;
    long result = 0;
    int left = 0;

    for (int right = 0; right < nums.length; right++) {             
        if (nums[right] == max) {
            count++;                                                
        }

        while (count >= k) {                                        
            result += nums.length - right;                          
            if (nums[left] == max) {
                count--;                                           
            }
            left++;                                                 
        }
    }

    return result;                                                  
