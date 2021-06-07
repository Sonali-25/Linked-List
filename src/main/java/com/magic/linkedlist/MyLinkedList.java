package com.magic.linkedlist;

public class MyLinkedList<K> {
    public INode<K> head;
    public INode<K> tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null ;
    }

    public void add(INode<K> newNode) {
        if (this.head == null)
            this.head = newNode;
        if (this.tail == null)
            this.tail = newNode;
        else {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    public void append(MyNode newNode) {
        if(this.head == null )
            this.head = newNode;
        if(this.tail == null)
            this.tail = newNode;
        else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }
    public INode delete() {
        INode tempNode =  this.head ;
        this.head = this.head.getNext();
        return tempNode;
    }
    public void printNodes(){
        StringBuffer myNodes = new StringBuffer();
        INode tempNode = head ;
        while (tempNode.getNext()!= null ) {
            myNodes.append(tempNode.getKey());
            if(!tempNode.equals(tail)) myNodes.append("  ->  ");
            tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);

    }

    public static void main(String[] args) {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.delete();
        myLinkedList.printNodes();
    }


}