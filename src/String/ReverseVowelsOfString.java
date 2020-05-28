package String;

/**
 * @author Donald
 * @data 28/05/2020 15:42
 */
public class ReverseVowelsOfString {
    public static void main(String[] args) {
        System.out.println(reverseVowels("leetcode"));
    }

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
}
