## 88. Merge Sorted Array

### Solution
```java
import java.util.*;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] newarry = new int[nums1.length];
        
        int i=0,j=0,k=0;
        while(i<m&&j<n){
            if(nums1[i]<=nums2[j]){
                newarry[k]=nums1[i];
                k++;
                i++;
            }else{
                newarry[k]=nums2[j];
                k++;
                j++;
            }
        }
        
        while(i<m){
            newarry[k]=nums1[i];
            k++;
            i++;
        }
                
        while(j<n){
            newarry[k]=nums2[j];
            k++;
            j++;
        }
        
        System.arraycopy(newarry,0,nums1,0,newarry.length);
    }
}
```


---

Auxiliary space + merge thought(辅助空间加归并思想)
