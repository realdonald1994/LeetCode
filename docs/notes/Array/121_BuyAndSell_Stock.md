## 121. Best Time to Buy and Sell Stock

*Brute Force X*

### Solution
```java
class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0){
            return 0;
        }
        int max =0;
        int min = prices[0];
        for(int i=1;i<prices.length;i++){
            max = Math.max(max,prices[i]-min);
            min = Math.min(min,prices[i]);
        }
        return max;
    }
}
```

---

### Solution2
```java

```
