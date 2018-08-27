import org.junit.Test;

import java.util.Arrays;
import java.util.List;
//https://leetcode-cn.com/problems/add-two-numbers/description/
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Solution1 {

    @Test
    public void Test1(){
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(3);
        l1.next = l2 ;
        l2.next = l3 ;

        ListNode l4 = new ListNode(5);
        ListNode l5 = new ListNode(6);
        ListNode l6 = new ListNode(4);
        l4.next = l5 ;
        l5.next = l6 ;


        ListNode re = addTwoNumbers(l1 , l4);
        while(re != null){
            System.out.println(re.val);
            if (re != null){
                re = re.next;
            }
        }

    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        while(l1 != null){
            sb1.append(l1.val);
            if (l1 != null){
                l1 = l1.next;
            }
        }


        while (l2 != null) {
            sb2.append(l2.val);
            if (l2 != null){
                l2 = l2.next;
            }
        }
        System.out.println(sb1.toString());
        System.out.println(sb2.toString());
        int sum1 = Integer.valueOf(sb1.toString());
        int sum2 = Integer.valueOf(sb2.toString());
        int count = sum1 + sum2;
        System.out.println(count);
        char[] tranString = String.valueOf(count).toCharArray();

        ListNode l3 = null ;
        for(int i = 0 ; i < tranString.length ; i++){
            l3 = new ListNode(tranString[i]);
            if (i+1 < tranString.length){
                l3.next = new ListNode(tranString[i+1]);

            }
            l3 = l3.next;
        }
        return l3;
    }
}