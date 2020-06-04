## 53. MaxiMum Subarray
### Solution

```java
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        if(nums==null){
            return 0;
        }

        int max= nums[0];
        int sum = nums[0];
        for(int i=1;i<nums.length;i++){
            sum=Math.max(sum+=nums[i],nums[i]);
            max= Math.max(max,sum);
        }
        return max;
    }

}
```
