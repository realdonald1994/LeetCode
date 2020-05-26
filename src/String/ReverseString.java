package String;

/**
 * @author Donald
 * @data 26/05/2020 14:06
 */
public class ReverseString {
    public static void main(String[] args) {
        char[] a = new char[]{'h','e','l','l','o'};
        reverseString(a);
        System.out.println(a);
    }
    public static void reverseString(char[] s) {
        for(int i=0;i<s.length/2;i++){
            char a = s[i];
            s[i] = s[s.length-i-1];
            s[s.length-i-1] = a;
        }
    }
}
