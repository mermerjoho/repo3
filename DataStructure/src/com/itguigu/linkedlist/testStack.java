package com.itguigu.linkedlist;

import javax.lang.model.element.NestingKind;
import java.util.Stack;

//演示栈的基本使用
public class testStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.add("jack");
        stack.add("tom");
        stack.add("smith");
        while (stack.size()>0){
            //取出栈顶数据
            System.out.println(stack.pop());
        }
    }
}
