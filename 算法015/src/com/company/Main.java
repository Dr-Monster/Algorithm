package com.company;

import org.junit.Test;

import java.util.*;

/**
 *  https://leetcode-cn.com/problems/3sum/
 */
public class Main {

    public static void main(String[] args) {
        int nums[] = new int[]{-1, 0, 1, 2, -1, -4};
    }


    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> interList = new ArrayList<>();

        List<Integer> numList = new ArrayList<>();
        for(int item : nums){
            numList.add(item);
        }

        Set<List<Integer>> tempResult = new HashSet<>();


        return interList;
    }


    public Node splitNodeByValue(List<Integer> valueList){

        valueList.sort(Integer::compareTo);

//        Node root = new Node(String.valueOf(valueList.get(valueList.size() / 2)) , valueList.get(valueList.size() / 2) , 0);



        return null;
    }


}
