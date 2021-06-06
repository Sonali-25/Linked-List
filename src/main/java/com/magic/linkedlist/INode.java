package com.magic.linkedlist;

public class INode<T>{
    private T key;
    private INode next;

    public INode (T key){
        this.key = key;
        this.next = null;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public INode getNext() {
        return next;
    }

    public void setNext(INode next) {
        this.next = next;
    }
}
