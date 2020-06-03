package com.itguigu.linkedlist;
/*
定义单链表存储英雄
 */
//@SuppressWarnings("all")
public class SingleLinkedList {
    //头结点为空
    private HeroNode head = new HeroNode(0,"","");

    public HeroNode getHead() {
        return head;
    }

    //添加方法
    public void add(HeroNode h){
        //直接添加
        //借助一个临时指针遍历链表
        HeroNode temp = head;
        while (true){
            //找到链表的最后
            if(temp.next==null){
                break;
            }
            //如果没有找到最后，temp后移一位
            temp = temp.next;

        }
        //当退出while循环时，temp指向了链表的最后
        temp.next = h;

    }

    public void showLinkedList(){
        //判断链表是否为空
        if(head.next==null){
            System.out.println("链表为空");
            return;
        }
        //头结点不能动，借助temp来指向链表中元素
        HeroNode temp = head.next;
        //至少有一个数据，开始遍历
        while (true){
            if(temp == null){
                break;
            }
            System.out.println(temp);
            temp = temp.next;
        }

    }

    //修改节点信息
    public void update(HeroNode h){
        if(head.next==null){
            //链表为空
            return;
        }
        HeroNode temp = head.next;
        boolean flag = false;
        while(true){
            //链表遍历完毕
            if (temp==null){
                break;
            }
            if(temp.no==h.no){
                //找到了
//                temp.name = h.name;
//                temp.nickName = h.nickName;
                flag = true;
                break;
            }
            temp = temp.next;
        }
        //判断flag的值，得知是否找到了要找的节点
        if(flag){
            temp.name = h.name;
            temp.nickName = h.nickName;
        }else {
            System.out.printf("没有找到编号%d的节点\n",h.no);
        }
    }

    /**
     *
     * @param head 链表的头结点
     * @return 返回的就是节点的有效个数
     */
    public static int getNodeNum(HeroNode head){
        if(head.next==null){
            return 0;
        }
        int length = 0;
        HeroNode cur =head.next;
        while (cur!=null){
            length++;
            cur = cur.next;
        }
        return length;
    }

    //删除节点  因为head不能动，因此需要一个临时指针temp找到待删除节点的前一个节点
    public  void del(int no){
        HeroNode temp = head;
        boolean flag = false;
        while(true){
            if(temp.next==null){
                break;
            }
            if(temp.next.no==no){
                flag =true;
                break;
            }
            temp = temp.next;

        }
        if(flag){
            //表明找到了节点
            temp.next=temp.next.next;
        }else{
            System.out.println("没有找到该编号的节点");
        }
    }

    //根据编号添加节点
    public void addByOrder(HeroNode heroNode){
        HeroNode temp = head;
        //标志是否能插入
        boolean flag = false;
        while(true){
            //表示temp已经指向最后一个节点
            if(temp.next==null){
                break;
            }if(temp.next.no>heroNode.no){
                //位置找到了，就在temp的后面插入
                break;
            }else if(temp.next.no==heroNode.no){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag){
            System.out.println("准备插入的英雄编号已经存在");
        }else{
            heroNode.next = temp.next;
            temp.next = heroNode;

        }


    }

    public HeroNode getLastNode(HeroNode head){
        while (head.next==null){
            return null;
        }
        HeroNode temp = head.next;
        while(temp.next!=null){
            temp = temp.next;
        }
        return  temp;
    }

}
