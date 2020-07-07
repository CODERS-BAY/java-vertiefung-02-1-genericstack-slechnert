package com.codersbay;

public class Main {

    public static void main(String[] args) {
        GenericStack<String> MyStringStack = new GenericStack<>();

        MyStringStack.push("EY, MONGO JUUUNGEE!");
        MyStringStack.push("PATRICIAA!! GET YOUR FUCKING SHIT TOGETHER!!");
        MyStringStack.push("Survival of the fee test");

        System.out.println("Peeking:");
        System.out.println(MyStringStack.peek());
        System.out.println("Popping:");
        System.out.println(MyStringStack.pop());
        System.out.println("Peeking:");
        System.out.println(MyStringStack.peek());

        System.out.println(MyStringStack.length());

    }

}
