## 345. Reverse Vowels of a String

### solution

```
class Solution {
    public String reverseVowels(String s) {
        
        if("".equals(s)||s==null||s.length()==0){
            return s;
        }
        String vowels = "aeiouAEIOU";
        char[] a = s.toCharArray();
        int start = 0;
        int end = s.length()-1;
        int len = s.length();
        while(start<end){
            while(start<end && !vowels.contains(String.valueOf(a[start]))){
                start++;
            }
            while(start<end && !vowels.contains(String.valueOf(a[end]))){
                end--;
            }
            char temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            
            
            start++;
            end--;
        }
        
        return new String(a);
    }
}
```
---

###  solution2
```
 public static String reverseVowels(String s) {
        if("".equals(s)||null==s||s.length()==0){
            return s;
        }

        char[] a = s.toCharArray();
        int len = a.length;
        String vowels = "aeiouAEIOU";
        for(int i=0,j=len-1;i<j;){
            if(!vowels.contains(String.valueOf(a[i]))){
                i++;
                continue;
            }
            if(!vowels.contains(String.valueOf(a[j]))){
                j--;
                continue;
            }

            char temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        return String.valueOf(a);
    }
```
