package com.codersbay;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GenericStackTest {


    @Test
    @DisplayName("Peek on an empty stack throws an EmptyStackException")
    public void testPeekOnEmptyStack(){
        GenericStack<String> testStack = new GenericStack<>();
        assertThrows(EmptyStackException.class, testStack::peek);
    }


    @Test
    @DisplayName("The GenericStack-method push() adds an element onto a String Stack")
    public void testStringStackLength(){
        GenericStack<String> testStack = new GenericStack<>();
        testStack.push("testString1");
        assertEquals(1, testStack.length());
    }


    @Test
    @DisplayName("The GenericStack-method push() adds an element onto a Boolean Stack")
    public void testBooleanStackLength(){
        GenericStack<Boolean> testStack = new GenericStack<>();
        testStack.push(true);
        assertEquals(1, testStack.length());
    }

    @Test
    @DisplayName("The GenericStack-method push() adds an element onto am Integer Stack")
    public void testIntegerStackLength(){
        GenericStack<Integer> testStack = new GenericStack<>();
        testStack.push(69);
        assertEquals(1, testStack.length());
    }

    @Test
    @DisplayName("The peek() method used from an Integer Stack returns the element added last")
    public void testIntegerStackPeek(){
        GenericStack<Integer> testStack = new GenericStack<>();
        testStack.push(69);
        assertEquals(69, testStack.peek());
    }

    @Test
    @DisplayName("The peek() method used from an Integer Stack returns the element added last")
    public void testStringStackPeek(){
        GenericStack<String> testStack = new GenericStack<>();
        testStack.push("BOOO");
        assertEquals("BOOO", testStack.peek());
    }

    @Test
    @DisplayName("The peek() method used from an String Stack returns the element added last")
    public void testStringPop(){
        GenericStack<String> testStack = new GenericStack<>();
        testStack.push("BOOO");
        testStack.push("BOOO TWOOO");

        assertEquals(2, testStack.length());
        assertEquals("BOOO TWOOO", testStack.pop());
        assertEquals(1, testStack.length());
        assertEquals("BOOO", testStack.peek());
    }

    @Test
    @DisplayName("The peek() method used from an Integer Stack returns the element added last")
    public void testIntegerPop(){
        GenericStack<Integer> testStack = new GenericStack<>();
        testStack.push(1);
        testStack.push(2);

        assertEquals(2, testStack.length());
        assertEquals(2, testStack.pop());
        assertEquals(1, testStack.length());
        assertEquals(1, testStack.peek());
    }
}
