package com.neuedu.test;

public class Mytest1 {
    public static void main(String[] args){
//        System.out.println("123");
//        System.out.println("456");

//        int a = 10 ;
//        int b = 20 ;
//        int c = a+b;
//        System.out.println(c);


//        Person p1 = new Person();
//        p1.age = 1222;
//        p1.no = 1000;
//        System.out.println(p1.age);

//        Dog d1 = new Dog();
//        d1.setAge(10);
//        int age = d1.getAge();
//        System.out.print(age);

        /*判断是不是闰年*/
//        int year = 2000;
//        if((year%4==0&&year%100!=0)||year%400==0) {
//            System.out.println("是闰年");
//        }
//        else{
//            System.out.println("不是闰年");
//        }

        /*while 循环*/
//        int a = 11;
//        while(a<10){
//            System.out.println("跑");
//            a++;
//        }
        /*do while 循环
        * do while 无论条件满不满足都会做一次，再看判断条件
        * */
//        int a = 11;
//        do{
//            System.out.println("跑");
//            a++;
//        }while(a<10);
//        /*for循环*/
//        for(int i=0;i<10;i++){
//            System.out.println("跑");
//        }
/*练习：1到100的和*/
//        int sum = 0;
//        for(int i=1;i<=100;i++){
//            sum = sum + i;
//        }
//        System.out.println(sum);

/*练习：1到100的质数和*/
//        int sum = 2;
//        for(int i=2;i<=100;i++){
//            for(int a=2;a<=i-1;a++){
//                if(i%a==0){
//                    System.out.println(i);
//                    sum = sum + i;
//                }
//            }
//        }

//        Person p1 = new Person();
//        int c = p1.add(1,2);
//        System.out.println(c);

//        int[] arr = new int[]{1,2,3,4};
//        for (int i=1;i<=3;i++){
//
//        }


//        int sum = 0;
////        for (int i=2;i<=100;i++){
////            if (i%2==0){
////                sum=sum+i;
////
////            }
////        }
////        System.out.println(sum);

//        int sum = 1;
//        int m = 5;
//        int n = 3;
//        int i = 1;
//        while(i<=n){
//            sum = m*sum;
//            i++;
//        }
//        System.out.println(sum);


//        for(int m=100;m<1000;m++) {
//            int a = m / 100;
//            int b = m % 100 / 10;
//            int c = m % 10;
//            int sum=1;
//            int sum2=1;
//            int sum3=1;
//            for (int i=1;i<=3;i++){
//                sum=sum*a;
//                sum2=sum2*b;
//                sum3=sum3*c;
//            }
//            if(sum+sum2+sum3==m){
//                System.out.println(m);
//            }
//
//        }


//        int m = 2;
//        int n = 7;
//        int max=1;
//        int min=1;
//        if (n%m==0){
//            max=n;
//            System.out.println(max);
//        }
//        else{
//
//        }

        /*冒泡排序*/
//        int[] array = {32,10,3,56,90,40};
//        for(int i=0;i<array.length-1;i++){
//            int flag = 0;
//            for (int j=0;j<array.length-1-i;j++){
//                if (array[j]>array[j+1]){
//                    int temp=array[j];
//                    array[j]=array[j+1];
//                    array[j+1]=temp;
//                    flag++;
//                }
//            }
//            if (flag==0){
//                break;
//            }
//        }
//        for (int a:array){
//            System.out.println(a);
//        }

//        /*选择排序*/
        int[] array = {32,10,3,56,90,40};
            for (int i=0;i<array.length-1;i++){
                for(int j=i+1;j<=array.length;j++)
                    if (array[i]>array[j]) {
                        int temp = array[j];
                        array[j] = array[i];
                        array[i] = temp;
                    }
            }
            for (int a:array){
                System.out.println(a);
            }


//        int[] array = new int[100000];
//        for(int i=0;i<array.length;i++){
//            array[i]=i+1;
//        }
//        int a=6000;
//        int index = search(array,a);
//        System.out.println(index);
//    }
//    /*二分搜索查询*/
//    public static int search(int[] array,int value){
//       int min = 0;
//       int max =array.length-1;
//       int mid;
//       int count = 0;
//       while(min<=max){
//           count++;
//           mid = (min+max)/2;
//           if (value==array[mid]){
//               System.out.println("查找了"+count+"次");
//               return mid;
//           }else if (value<array[mid]){
//               max = mid-1;
//           }else{
//               min = mid +1;
//           }
//       }
//       return -1;
    }
}