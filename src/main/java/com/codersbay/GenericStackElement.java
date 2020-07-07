package com.codersbay;

public class GenericStackElement<E> {

    E value;
    GenericStackElement<E> next;

    public GenericStackElement(E value, GenericStackElement<E> next){
        this.value = value;
        this.next = next;
    }

    public E getValue() {
        return value;
    }

    public GenericStackElement<E> getNext() {
        return next;
    }
}
