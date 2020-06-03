package com.itguigu.Stack;

public class ArrayStackDemo {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.showStack();
        int pop = stack.pop();
        System.out.println(pop);
    }
}
