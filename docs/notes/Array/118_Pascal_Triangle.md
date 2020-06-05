## 118. Pascal's Triangle
### Solution
```java
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list =  new ArrayList<List<Integer>>();
        List<Integer> sublist = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            sublist.add(0,1);
            for(int j =1;j<sublist.size()-1;j++){
                sublist.set(j,sublist.get(j)+sublist.get(j+1));   
            }
            list.add(new ArrayList<>(sublist));
        }
        return list;
    }
}
```
