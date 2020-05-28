## 383. Ransom Note

*I use brute force to sovle it*
The better solution use map API:<br/>

> map.getOrDefault(key,0);

'''java
public Object getOrDefault(Object key, Object defaultValue)
'''

### Solution

```java
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> magM = new HashMap<>();
        for (char c:magazine.toCharArray()){
            int newCount = magM.getOrDefault(c, 0)+1;
            magM.put(c, newCount);
        }
        for (char c:ransomNote.toCharArray()){
            int newCount = magM.getOrDefault(c,0)-1;
            if (newCount<0)
                return false;
            magM.put(c, newCount);
        }
        return true;
    }
}
```
