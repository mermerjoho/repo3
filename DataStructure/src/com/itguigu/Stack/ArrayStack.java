package com.itguigu.Stack;

//栈类
public class ArrayStack {
    private int maxSize;
    private int[] stack;
    private int top = -1;//栈顶

    //构造器
    public ArrayStack(int maxSize) {
        this.maxSize = maxSize;
        stack = new int[this.maxSize];
    }

    //判断栈满
    public boolean isFull() {
        return top == maxSize - 1;
    }

    //判空
    public boolean isEmpty() {
        return top == -1;
    }

    //入栈
    public void push(int value) {
        if (isFull()) {
            System.out.println("栈满了，无法添加");
            return;
        }
        top++;
        stack[top] = value;
    }

    //出栈
    public int pop() {
        //先判空
        if (isEmpty()) {
            throw new RuntimeException("栈为空");
        }
        int value = stack[top];
        top--;
        return value;
    }

    //遍历栈
    public void showStack() {
        if (isEmpty()) {
            System.out.println("栈空");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }

    }


}
