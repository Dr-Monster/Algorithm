//https://leetcode-cn.com/problems/judge-route-circle/description/

import org.junit.Test;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    @Test
    public void test() {
        System.out.println(judgeCircle("URDL"));
    }


    public boolean judgeCircle(String moves) {

        char[] cmd = moves.toCharArray();
        int x = 0;
        int y = 0;
        for (char item : cmd) {
            String check = String.valueOf(item);
            switch (check) {
                case "L": {
                    x = x - 1;
                    break;
                }
                case "R": {
                    x = x + 1;
                    break;
                }
                case "U": {
                    y = y + 1;
                    break;
                }
                case "D": {
                    y = y - 1;
                    break;
                }
                default: {

                }
            }
        }

        if (x == 0 && y == 0) {
            return true;
        } else {
            return false;
        }
    }
}
