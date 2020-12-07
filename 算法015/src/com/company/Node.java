package com.company;

import java.util.List;

public class Node {
    public List<Node> childs;
    public Node parent;
    public int index;
    public int value;
    public String name;


    public Node(){

    }

    public Node(String name , int value , int index){
        this.name = name;
        this.value = value;
        this.index = index;
    }


    public List<Node> getChilds() {
        return childs;
    }

    public void setChilds(List<Node> childs) {
        this.childs = childs;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Node{" +
                "childs=" + childs +
                ", parent=" + parent +
                ", index=" + index +
                ", value=" + value +
                ", name='" + name + '\'' +
                '}';
    }
}
