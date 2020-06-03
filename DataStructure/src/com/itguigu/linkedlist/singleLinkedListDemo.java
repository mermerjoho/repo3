package com.itguigu.linkedlist;

import java.util.Stack;

public class singleLinkedListDemo {

    public static void main(String[] args) {
        HeroNode h1 = new HeroNode(1, "宋江", "及时雨");
        HeroNode h2 = new HeroNode(2, "卢俊义", "玉麒麟");
        HeroNode h3 = new HeroNode(3, "吴用", "智多星");
        HeroNode h4 = new HeroNode(4, "林冲", "豹子头");
        //创建链表
        SingleLinkedList s = new SingleLinkedList();
//        s.add(h2);
//        s.add(h1);
//        s.add(h4);
//        s.add(h3);
        //按照编号添加节点

        s.add(h1);
        s.add(h3);
        s.showLinkedList();
        System.out.println("---------------------");
        SingleLinkedList s2 = new SingleLinkedList();
        s2.add(h2);
        s2.add(h4);
        s2.showLinkedList();
        System.out.println("打印合并后的链表");

        HeroNode heroNode = mergeList(s.getHead(), s2.getHead());
        printSinglelist(heroNode);



        //测试修改节点的代码
//        HeroNode h = new HeroNode(5, "小卢", "麒麟王");
//        s.update(h);
//        s.showLinkedList();
//        System.out.println(SingleLinkedList.getNodeNum(s.getHead()));

        //测试删除方法
//        s.del(2);
//        s.showLinkedList();
//
//        s.del(5);
//        s.showLinkedList();
//        System.out.println(s.getHead());

//        s.addByOrder(h3);
//
//        System.out.println("----------------");
//        HeroNode lastIndexNode = getLastIndexNode(s, 3);
//        System.out.println(lastIndexNode);
//        reverseList(s.getHead());
//        System.out.println("反转后的单链表为：");
//        s.showLinkedList();
//
//
//        //倒序打印
//        System.out.println("倒序打印的单链表为:");
//        reversePrint(s.getHead());

    }

    public static HeroNode getLastIndexNode(SingleLinkedList s, int index) {
        HeroNode head = s.getHead();
        int length = SingleLinkedList.getNodeNum(head);
        //判断链表是否为空
        if (head.next == null) {
            return null;
        }
        if(index<=0 ||index >length){
            return null;
        }
        HeroNode temp = head.next;
        for (int c =0; c<length-index;c++){
            temp = temp.next;
        }
        return temp;

    }

    //将单链表进行反转
    public static void reverseList(HeroNode head){
        if(head.next==null||head.next.next==null){
            return;
        }
        HeroNode cur = head.next;
        //用于临时存放cur的下个一地址
        HeroNode next = null;
        HeroNode newHeadNode = new HeroNode(0,"","");
        while (cur!=null){
            //开始反转
            next = cur.next;
            cur.next = newHeadNode.next;
            newHeadNode.next = cur;
            cur = next;
        }
        head.next=newHeadNode.next;
    }


    //使用栈这个数据结构的特点，将节点压入栈中，再从栈中取出
    public static  void reversePrint(HeroNode head){
        if(head.next==null){
            return;//空链表，无法打印
        }
        //创建一个栈
        Stack<HeroNode> stack = new Stack<HeroNode>();
        HeroNode  cur = head.next;
        while (cur != null){
            stack.add(cur);
            cur = cur.next;
        }
        while (stack.size()>0){
            System.out.println(stack.pop());
        }
    }


//    合并两个有序单链表
    public static HeroNode mergeList(HeroNode head1,HeroNode head2) {
        if (head1.next == null || head2.next == null) {
            return head1 == null ? head2 : head1;
        }
        //开始从两个链表中取数据
        HeroNode cur1 = head1.next;
        HeroNode cur2 = head2.next;
        //创建一个新的链表
        SingleLinkedList s = new SingleLinkedList();
        //得到新链表的头结点
        HeroNode newHeroNode = s.getHead();
        while (cur1 != null && cur2 != null) {
            if (cur1.no < cur2.no) {
//                newHeroNode.next = cur1;
                //临时存放下一个节点
                HeroNode temp1 =cur1.next;
                cur1.next = null;
                s.add(cur1);
                cur1 = temp1;

            } else if (cur1.no > cur2.no) {
//                newHeroNode.next = cur2;
                HeroNode temp2 =cur2.next;
                cur1.next = null;
                s.add(cur2);
                cur2 = temp2;
            }
        }
        //运行到此处有某一个链表为空
        //得到目标链表的尾节点
        HeroNode lastNode = s.getLastNode(newHeroNode);
        if (cur1 == null) lastNode.next = cur2 = cur1;
        else lastNode.next = cur1;

        return newHeroNode;

    }

    public  static void printSinglelist(HeroNode head){
        if(head.next==null){
            return;
        }
        HeroNode temp = head.next;
        while (temp!=null){
            System.out.println(temp);
            temp = temp.next;
        }
    }
}
