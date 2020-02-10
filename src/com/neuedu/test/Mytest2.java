package com.neuedu.test;

import static java.lang.Math.max;

public class Mytest2 {
    public static void main(String[] args) {
        /*练习1：四个数中取三个数组成每个位置都不同的三位数*/
//        int[] array = {1,2,3,4};
//        for (int i:array){
//            //先拿出百位数
//            for (int j:array){
//                //再拿出十位数
//                if (i!=j){
//                    for (int k:array){
//                        //拿出个位数
//                        if (k!=i&&k!=j){
//                            System.out.println(i*100 +j*10 +k);
//                        }
//                    }
//                }
//            }
//        }
//
///*练习2：1-100之间的偶数和*/
//        int sum = 0;
//        for (int i=2;i<=100;i++){
//            if (i%2==0){
//               sum=sum+i;
//
//           }
//        }
//        System.out.println(sum);
//
///*练习3：定义两个int变量m和n 计算m的n次方*/
//        int sum = 1;
//        int m = 5;
//        int n = 3;
//        int i = 1;
//        while(i<=n){
//            sum = m*sum;
//            i++;
//        }
//        System.out.println(sum);
///*练习4：100~99之间的水仙花数 例如：153 1^3+5^3+3^3=153*/
//        for(int m=100;m<1000;m++) {
//           int a = m / 100;
//           int b = m % 100 / 10;
//           int c = m % 10;
//           int sum=1;
//           int sum2=1;
//           int sum3=1;
//           for (int i=1;i<=3;i++){
//               sum=sum*a;
//               sum2=sum2*b;
//               sum3=sum3*c;
//          }
//           if(sum+sum2+sum3==m){
//               System.out.println(m);
//            }
//       }
        /*练习：两个正整数计算最大公约数和最小公倍数*/
//        int x = 14;
//        int y = 7;
//        int max = 1;
//        int min = max(x, y);
//        for (int i = 1; i <= x && i <= y; i++) {
//            if (x % i == 0 && y % i == 0) {
//                max = i;
//            }
//        }
//        for (int i = min; i <= x * y; i++) {
//            if (i % x == 0 && i % y == 0) {
//                min = i;
//                break;
//            }
//        }
//        System.out.println(min);
//        System.out.println(max);
    }
}

