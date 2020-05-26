package String;

/**
 * @author Donald
 * @data 26/05/2020 13:24
 */
public class StrStr {
    public static void main(String[] args) {
        System.out.println(strStr("hello","ll"));
    }
    public static int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }else{
            return -1;
        }
    }
}
