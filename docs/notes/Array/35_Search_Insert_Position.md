## 35. Search Insert Position
### Solution
```java
class Solution {
    public int searchInsert(int[] nums, int target) {
    
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        
        for(int i=0;i<nums.length;i++){
            if(i==0&&target<nums[i]){
                return 0;
            }
            if(i==nums.length-1&&nums[nums.length-1]<target){
                return nums.length;
            }
            if(nums[i]<target&&nums[i+1]>target){
                return i+1;
            }
        }
        return 0;
    }
}
```
