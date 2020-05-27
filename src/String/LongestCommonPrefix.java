package String;

/**
 * @author Donald
 * @data 27/05/2020 12:50
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"aba","cca"}));
    }
    public static String longestCommonPrefix(String[] strs) {

        StringBuffer sb = new StringBuffer("");
        if(strs==null || strs.length==0){
            return sb.toString();
        }
        int max =strs[0].length();

        for(int i=0;i<max;i++){
            for(int j=1;j<strs.length;j++){
                if(i<strs[j].length()){
                    if(strs[j].charAt(i)!=strs[0].charAt(i)){
                        return sb.toString();
                    }
                }else{
                    return sb.toString();
                }
            }
            sb.append(strs[0].charAt(i));

        }

        return sb.toString();
    }
}
