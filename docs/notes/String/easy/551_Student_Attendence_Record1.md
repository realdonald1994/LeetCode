## 551. Student Attendance Record I
### Solution1
```java
 public boolean checkRecord(String s) {
        s+="##";
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'){
                count++;
            }
            if(count>1||s.charAt(i)=='L'&&s.charAt(i+1)=='L'&&s.charAt(i+2)=='L'){
                return false;
            }
        }
        return true;
    }
```
***
### Solution2
```java
 public boolean checkRecord(String s) {
  return s.indexOf("A") == s.lastIndexOf("A") && !s.contains("LLL");
 }
```
