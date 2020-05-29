## 459. Repeated Substring Pattern

### Solution

```java
   public static boolean repeatedSubstringPattern(String s) {
        if("".equals(s)||null==s||s.length()==0){
            return false;
        }
        if(s.length()==1){
            return false;
        }

        int len  = s.length();
        for(int i=len/2;i>=1;i--){
            if(len%i==0){
                String sub  = s.substring(0,i);
                int m = len/i;
                StringBuffer sb = new StringBuffer();
                for(int j=0;j<m;j++){
                    sb.append(sub);
                }
                if(sb.toString().equals(s)){
                    return true;
                }
            }
        }
        return false;

    }
```

---

### Solution2

```java
 public static boolean repeatedSubstringPattern2(String s) {
        String ss = s+s;
        return ss.substring(1,ss.length()-1).contains(s);
    }
```
