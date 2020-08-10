import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/zigzag-conversion/
 * not finish
 */
public class Demo {
    public static void main(String[] args) {
        String test = "Apalindromeisaword,phrase,number,orothersequenceofunitsthatcanbereadthesamewayineitherdirection,withgeneralallowancesforadjustmentstopunctuationandworddividers.";
        //Aiosrhem,tseoihartaaeeriwgrlasasnoctaoieplnrmiaodprs,ubroohreunefnttacneedhsmwynihrieto,iheeaalwnefrdutettpntainnwrdvdr.adew,anereqcustbaeeitdcntnlocojmsuuoddis
        int row = 3;
        System.out.println(new Demo().convert(test , row));
    }

    public String convert(String s, int numRows) {

        if(s.length() == 1 || numRows == 1){
            return s;
        }

        char[] chars = s.toCharArray();

        int xIndexSize = s.length() / numRows + s.length() % numRows + numRows - 1;
        String[][] threeDStrings = new String[numRows][xIndexSize];

        //列
        for(int i = 0 ; i < xIndexSize ; i++){
            //行
            for(int j = 0 ; j < numRows ; j++){
                // 1/3 = 0
                // 1%3 = 1
                int yushu = i % (numRows-1);
                if(yushu == 0){
                    int charAt = i * numRows - (i / (numRows - 1)) * (numRows - 2)*(numRows - 1) + j;
                    if(charAt >= chars.length){
                        threeDStrings[j][i] = "";
                    }else{
                        threeDStrings[j][i] = String.valueOf(chars[charAt]);
                    }
                }else{
                    int charAt = (i + 1) * numRows - ((i + 1) - (i / (numRows - 1) + 1)) * (numRows - 1) - 1;
                    if(charAt >= chars.length){
                        threeDStrings[numRows - 1 - yushu][i] = "";
                    }else{
                        threeDStrings[numRows - 1 - yushu][i] = String.valueOf(chars[charAt]);
                    }
                    break;
                }
            }
        }

        StringBuffer stringBuffer = new StringBuffer();
        for(int i = 0 ; i < numRows ; i++){
            for(int j = 0 ; j < xIndexSize ; j++){
                if(threeDStrings[i][j] != null){
                    stringBuffer.append(threeDStrings[i][j].equals("") ? "" : threeDStrings[i][j]);
                }else{
                    stringBuffer.append("");
                }

            }
        }
        return stringBuffer.toString();
    }
}
