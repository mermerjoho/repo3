package com.itguigu.linkedlist.DoubleLinkList;

public class DoubleListDemo {
    public static void main(String[] args) {
        DoubleLinkedList dl = new DoubleLinkedList();
        DoubleHeroNode dh1 = new DoubleHeroNode(1,"宋江","及时雨");
        DoubleHeroNode dh2 = new DoubleHeroNode(2,"卢俊义","玉麒麟");
        DoubleHeroNode dh3 = new DoubleHeroNode(3,"吴用","智多星");
        DoubleHeroNode dh4 = new DoubleHeroNode(4,"林冲","豹子头");
        dl.addDoubleHeroNode(dh1);
        dl.addDoubleHeroNode(dh2);
        dl.addDoubleHeroNode(dh3);
        dl.addDoubleHeroNode(dh4);
        dl.showLinkedList();
        DoubleHeroNode dh = new DoubleHeroNode(3,"小吴子","智多星");
        dl.updateDoubleList(dh);
        System.out.println("修改后的双向链表为：");
        dl.showLinkedList();

        dl.deleteNode(3);
        System.out.println("删除三号节点后的结果为：");
        dl.showLinkedList();
    }
}
