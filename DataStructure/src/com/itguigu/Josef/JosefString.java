package com.itguigu.Josef;

public class JosefString {
    public static void main(String[] args) {
        //人数
        int m = 10;
        //步长
        int n = 3;
        Boolean[] a = new Boolean[m];

        //初始化数组
        for (int i = 0; i < a.length; i++) {
            a[i] = false;
        }
        //记录出队列人数
        int sum = 0;
        //记录报数的位置
        int location = 0;
        //记录报数的序号
        int count = 0;
        while (sum != m) {
            //从第一个开始报数
            location++;
            if (location == m + 1) {
                //使得数组成环状
                location = 1;
            }
            if (!a[location - 1]) {
                //只有没出局的参与报数
                count++;
            }
            if (count == n) {
                System.out.println(location);
                a[location - 1] = true;
                count = 0;
                sum++;
            }


        }

    }
}
