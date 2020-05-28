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
