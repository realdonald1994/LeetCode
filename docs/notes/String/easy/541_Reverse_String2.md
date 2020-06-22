## 541. Reverse String II
### Solution
```java
class Solution {
    public String reverseStr(String s, int k) {
        
   char[] a = s.toCharArray();
        StringBuilder result = new StringBuilder();
        if (s.length() < k) {
            return new StringBuilder(s).reverse().toString();
        }
        for (int i = 0; i < a.length; i = i + 2 * k) {

            if (i + 2 * k <=a.length) {
                String sub = s.substring(i, i + k * 2);
                swap(sub,result,i,k);
            } else {
                String sub = s.substring(i);
                if (sub.length() < k) {
                    StringBuilder sb = new StringBuilder(sub);
                    sub = sb.reverse().toString();
                    result.append(sub);
                }
                if (sub.length() >= k && sub.length() < 2 * k) {
                    swap(sub,result,i,k);
                }
            }

        }
        return result.toString();
    }
    
    public void swap(String sub,StringBuilder result,int i,int k){
        char[] subs = sub.toCharArray();
        for (int j = 0; j < k / 2; j++) {
            char temp = subs[j];
            subs[j] = subs[k - 1 - j];
            subs[k - 1 - j] = temp;
        }
        result.append(subs);
    }
}
```
