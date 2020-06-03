package com.itguigu.linkedlist.DoubleLinkList;

import com.itguigu.linkedlist.HeroNode;

/**
 * 双向链表节点类
 */
public class DoubleHeroNode {
    public int no;
    public String name;
    public String nickName;
    public DoubleHeroNode next;//指向下一个节点
    public DoubleHeroNode pre; //指向上一个节点



    public DoubleHeroNode(int no, String name, String nickName) {
        this.no = no;
        this.name = name;
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "DoubleHeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
