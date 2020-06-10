## 520. Detect Capital

### Solution

```java
class Solution {
    public boolean detectCapitalUse(String word) {
        char[] a = word.toCharArray();
        int upper = 0;
        int lower = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]-'a'<0){
                upper++;
            }else{
                lower++;
            }
        }
        if(upper == a.length || lower == a.length){
            return true;
        }else if(a[0]-'a'<0 && upper ==1){
            return true;
        }else{
            return false;
        }
    }
}
```

---

**A-Z:65-90 a-z:97-122**
