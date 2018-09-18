import org.junit.Test;

//https://leetcode-cn.com/problems/jewels-and-stones/description/


public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    @Test
    public void test() {
        String a = "aA";
        String b = "aAAbbbb";
        System.out.println(checkSum(a, b));
    }


    public Integer checkSum(String a, String b) {
        char[] charA = a.toCharArray();
        char[] charB = b.toCharArray();
        int count = 0;
        for (int i = 0; i < charA.length; i++) {
            for (int j = 0; j < charB.length; j++) {
                if (charA[i] == charB[j]) {
                    count++;
                } else {
                    continue;
                }
            }
        }
        return count;
    }
}
