package com.neuedu.test;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyBookMain {
    public static MyBook[] array= new MyBook[200];
    public static List<MyBook> list = new ArrayList<>();
    public static void main(String[] args) {
        inputData(list);
        menu();
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch (i){
            case 1:
                addBook(list);
                break;
            case 2:
                System.out.println("请输入要删除的图书名");
                String name = scanner.next();
                deleteName(list,name);
                break;
            case 3:
                System.out.println("请输入要查看的图书名");
                String searchName = scanner.next();
                searchName(list,searchName);
                break;
            case 4:
                print(list);
                break;
            default:
                System.exit(1);
                break;
        }
//        print(list);
//        searchName(list,"书名9");
//        deleteName(list,"书名9");
//        addBook(list);
//        print(list);
    }
    public  static void menu(){
        System.out.println("输出菜单选项请选择你要进行的操作（请输入1-4中的任一个数字）：");
        System.out.println("1：添加图书");
        System.out.println("2：删除图书");
        System.out.println("3：查找图书（根据书名）");
        System.out.println("4：输出所有图书");
        System.out.println("5：退出");
    }
    public static void inputData(List<MyBook> books){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1;i<=n;i++){
            MyBook myBook = new MyBook("书名"+i,Double.parseDouble(String.valueOf(i)),"出版社"+i,"作者"+i,"ISBN"+i);
            books.add(myBook);
        }
    }
    public static void print(List<MyBook> books){
        for (MyBook book : books) {
            System.out.println(book);
        }
    }
    public static void searchName(List<MyBook> books,String name){
        for (MyBook myBook : books) {
            if (myBook.getName().equals(name)) {
                System.out.println(myBook);
                return;
            }
        }
        System.out.println("此书不存在");
    }
    public static void deleteName(List<MyBook> books,String name){
        for (int i=0;i<books.size();i++){
            MyBook myBook = books.get(i);
            if (myBook.getName().equals(name)){
                books.remove(i);
                System.out.println("删除成功");
                return;
            }
        }
        System.out.println("没有此书，删除失败");
    }
    public static void addBook(List<MyBook> books){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入图书名");
        String name =scanner.next();
        System.out.println("请输入价格");
        double price = scanner.nextDouble();
        System.out.println("请输入出版社");
        String press =scanner.next();
        System.out.println("请输入作者");
        String author =scanner.next();
        System.out.println("请输入图书ISBN编号");
        String bookISBN  =scanner.next();
        MyBook myBook = new MyBook(name,price,press,author,bookISBN);
        books.add(myBook);
    }
}


