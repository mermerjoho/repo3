package com.itguigu.ArrayQueue;

public class ArrayQueue {
    private int maxSize;//表示数组的最大容量
    private int front;//队列头
    private int rear;//队列尾
    private int[] arr;

    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        //初始化数组，只想队列头部
        arr = new int[this.maxSize];
        front = -1;
        rear = -1;
    }
    //判断队列是否满
    public boolean isFull() {
        return rear == maxSize - 1;
    }

    //判断是否为空
    public boolean isEmpty() {
        return rear == front;
    }
    //添加数据到队列
    public void addQueue(int n){
        if(isFull()){
            System.out.println("队列满了不能加入");
            return;
        }
        rear++;
        arr[rear] = n;
    }
    //获取队列的数据，出队列
    public int getQueue(){
        //判断队列是否空
        if(isEmpty()){
            throw  new RuntimeException("队列空，不能取数据");
        }
        front++;
        return arr[front];
    }
    //显示队列的所有数据
    public void showQueue(){
        if(isEmpty()){
            System.out.println("队列空");
            return;
        }
        for(int i = front;i<rear;i++){
            System.out.println(arr[i]);
        }
    }
}
