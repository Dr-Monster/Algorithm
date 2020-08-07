import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/longest-palindromic-substring/comments/
 * 最长回文子串
 */
public class Demo1 {

    public static void main(String[] args) {
        String s = "apqjpwedlhmvvpexxnntxheeynxmgzwxhnhfdvziuxnuusymklgcacndoyhqkoahnkyaikohwkmnuphipftmzmihvmoetskioeypwjujvvusaxynzxxdugnebsisrtgeujkqkgwjuplijhluumqcdurovyjsbowmnqndejwkihzbbdyxjunkduyqeihektaknbmkzgnnmgywylulxwyywrvieqfenjeljofkqqqisdjsbfkvqgahxwkfkcucvrbbpyhwkfztjdboavtfynrudneieelwlcezqsuhmllcsadcnoyemsfdlrijoyj";
        System.out.println(new Demo1().longestPalindrome(s));
    }



    public String longestPalindrome(String s) {
        if(s.length() == 0 || s.length() == 1){
            return s;
        }
        String result = "";
        int currentLength = 0;
        String tempStr = "";
        char[] chars = s.toCharArray();
        for(int i = 0 ; i < chars.length ; i++){
            char start = chars[i];
            tempStr = String.valueOf(start);
            for(int j = i + 1 ; j < chars.length ; j++){
                char tempChar = chars[j];
                tempStr += String.valueOf(tempChar);
                if(checkResStr(tempStr)){
                    if(tempStr.length() > currentLength){
                        currentLength = tempStr.length();
                        result = tempStr;
                    }
                }
            }
        }
        if("".equals(result)){
            result = String.valueOf(s.toCharArray()[0]);
        }
        return result;
    }


    public boolean checkResStr(String currentStr){
        return  currentStr.equals(new StringBuffer(currentStr).reverse().toString());
    }
}
