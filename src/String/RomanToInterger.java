package String;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Donald
 * @data 26/05/2020 14:47
 */
public class RomanToInterger {

    public static void main(String[] args) {
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt2("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        if(null == s || s.length()==0){
            return 0;
        }
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);


        char[] a = s.toCharArray();
        if(a.length==1){
            return map.get(a[0]);
        }
        int result = map.get(a[a.length-1]);
        System.out.println(result);
        for(int i=a.length-2;i>=0;i--){
            System.out.println(a[i]);
            if(map.get(a[i+1])<=map.get(a[i])){
                result+=map.get(a[i]);
            }else{
                result-=map.get(a[i]);
            }
            System.out.println(result);
        }
        return result;

    }

    public static int romanToInt2(String s){
        if(null == s || s.length()==0){
            return 0;
        }

        char[] chars = s.toCharArray();
        int result = toInt(chars[0]);

        for(int i=1;i<chars.length;i++){
            result+=toInt(chars[i]);
            if(toInt(chars[i-1])<toInt(chars[i])){
                result-=toInt(chars[i-1])*2;
            }
        }
        return result;

    }

    static int toInt(char s){
        switch (s){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
