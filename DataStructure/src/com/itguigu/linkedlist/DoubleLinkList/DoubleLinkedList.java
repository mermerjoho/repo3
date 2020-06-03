package com.itguigu.linkedlist.DoubleLinkList;

import com.itguigu.linkedlist.HeroNode;

/**
 * 创建双向链表类
 */
public class DoubleLinkedList {
    private DoubleHeroNode head = new DoubleHeroNode(0, "", "");

    //返回头结点
    public DoubleHeroNode getHead() {
        return head;
    }

    //显示链表
    public void showLinkedList() {
        //判断链表是否为空
        if (head.next == null) {
            System.out.println("链表为空");
            return;
        }
        //头结点不能动，借助temp来指向链表中元素
        DoubleHeroNode temp = head.next;
        //至少有一个数据，开始遍历
        while (true) {
            if (temp == null) {
                break;
            }
            System.out.println(temp);
            temp = temp.next;
        }
    }

    //将双向链表节点加到链表最后
    public void addDoubleHeroNode(DoubleHeroNode h) {
        DoubleHeroNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        //已经到达链表最后
        temp.next = h;
        h.pre = temp;

    }

    //    修改方法(根据no值修改)
    public void updateDoubleList(DoubleHeroNode dh) {
        if (head.next == null) {
            return;
        }
        DoubleHeroNode temp = head.next;
        while (true) {
            if (temp == null) {
                //遍历完链表
                break;
            }
            if (temp.no == dh.no) {
                //找到了要修改的节点
                temp.name = dh.name;
                temp.nickName = dh.nickName;
                break;
            }
            temp = temp.next;
        }
    }

    //    删除方法(根据no值删除)
    public void deleteNode(int no) {
        if ((head.next == null)) {
            System.out.println("链表为空，不能删除");
            return;
        }
        //遍历链表找到需要删除的节点
        DoubleHeroNode temp = head.next;
        boolean flag = false;
        while (true) {
            if(temp ==null){
                break;
            }
            if(no == temp.no){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if(flag){
            temp.pre.next = temp.next;
            if(temp.next!=null) {
                temp.next.pre = temp.pre;
            }
            return;
        }
        System.out.println("要删除的节点不存在");
    }




}
