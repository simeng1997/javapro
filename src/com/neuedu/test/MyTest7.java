package com.neuedu.test;

import java.io.*;

public class MyTest7 {

    public static void main(String[] args) {
//        Student student = new Student();
//        student.setId(10);
//        student.setName("张三");
//        student.setAge(18);
//        student.setGrade("卓越1班");
//        File file = new File("E:\\student");
//        OutputStream outputStream = null;
//        ObjectOutputStream objectOutputStream = null;
//        try {
//            outputStream = new FileOutputStream(file);
//            objectOutputStream = new ObjectOutputStream(outputStream); //用这个写入到student文件中
//            objectOutputStream.writeObject(student);
//            objectOutputStream.flush();
//            System.out.println("保存完成");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                if (outputStream!=null)
//                    outputStream.close();
//                if (outputStream!=null)
//                    objectOutputStream.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }


        File file = new File("E:\\student");
        InputStream inputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            inputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(inputStream); //用这个写入到student文件中
            Student student =(Student) objectInputStream.readObject();
            System.out.println(student);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        } finally {
            try {
                if (inputStream!=null)
                    inputStream.close();
                if (inputStream!=null)
                    objectInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    if (objectInputStream!=null)
                        objectInputStream.close();
                    if (inputStream!=null)
                        inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
