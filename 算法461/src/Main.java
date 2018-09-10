import org.junit.Test;

//https://leetcode-cn.com/problems/hamming-distance/description/
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    @Test
    public void test() {
        System.out.println("Count:" + hammingDistance(93, 73));
    }

    public int hammingDistance(int x, int y) {
        String a = Integer.toBinaryString(x);
        String b = Integer.toBinaryString(y);
        char[] checkA = a.toCharArray();
        char[] checkB = b.toCharArray();
        int count = 0;
        if (checkA.length >= checkB.length) {
            char[] temp = new char[checkA.length];
            int j = checkB.length - 1;
            for (int i = checkA.length - 1; i > -1; i--) {
                if (j >= checkB.length - checkA.length) {
                    if ( j >= 0){
                        temp[i] = checkB[j];
                        j--;
                    }else{
                        temp[i] = '0' ;
                    }
                } else {
                    temp[i] = '0' ;
                }

            }
            for (int i = 0; i < checkA.length; i++) {
                if (temp[i] != checkA[i]) {
                    count++;
                }
            }
        } else {
            char[] temp = new char[checkB.length];
            int j = checkA.length - 1;
            for (int i = checkB.length - 1; i > -1; i--) {
                if (j >= checkA.length - checkB.length) {
                    if (j >= 0){
                        temp[i] = checkA[j];
                        j--;
                    }else{
                        temp[i] = '0' ;
                    }
                } else {
                    temp[i] = '0';
                }

            }
            for (int i = 0; i < checkB.length; i++) {
                if (temp[i] != checkB[i]) {
                    count++;
                }
            }
        }
        return count;
    }
}
