package com.company;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NodeDemo {

    @Test
    public void test1(){
        List<Integer> valueList = new LinkedList<>();
        valueList.add(0);
        valueList.add(0);
        valueList.add(1);
        valueList.add(-1);
        valueList.add(-3);
        valueList.add(-5);
        valueList.add(4);

        valueList.sort(Integer::compareTo);
        List<Node> nodeList = new ArrayList<>();
        Node curNode = null;
        //构建初始的链表
        for(int item : valueList){
            curNode = new Node(String.valueOf(item) , item , item);
            nodeList.add(curNode);
        }


        List<Node> children = new ArrayList<>();
        Node nextNode = null;
        int i = 0 ;
        while(i < nodeList.size()){
            curNode = nodeList.get(i);
            if(curNode != null){
                if (i + 1 < nodeList.size()){
                    nextNode = nodeList.get(i + 1);
                    children.add(nextNode);
                    curNode.setChilds(children);
                    nextNode.setParent(curNode);
                }else{
                    curNode.setChilds(null);
                }
                i++;
                children.clear();
            }
        }
        System.out.println(nodeList.toString());
    }
}
