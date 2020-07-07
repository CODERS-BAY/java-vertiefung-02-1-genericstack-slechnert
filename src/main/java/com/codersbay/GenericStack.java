package com.codersbay;

import java.util.EmptyStackException;

public class GenericStack<E> {

    int size = 0;
    GenericStackElement<E> top = null;

    public GenericStack(){
    }

    public void push(E newValue){
        GenericStackElement<E> newElement = new GenericStackElement<E>(newValue, top);
        top = newElement;
        size++;
    }

    public E pop() {
        GenericStackElement<E> oldTop = top;
        if(size == 0) {
            throw new EmptyStackException();
        }
        top = top.getNext();
        size--;
        return oldTop.getValue();
    }

    public E peek() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        return top.getValue();
    }

    public int length(){
        return size;
    }

    @Override
    public String toString() {
        return "GenericStack{" +
                "size=" + size +
                ", top=" + top +
                '}';
    }
}
