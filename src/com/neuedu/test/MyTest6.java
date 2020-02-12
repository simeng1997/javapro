package com.neuedu.test;

import java.io.*;

public class MyTest6 {
    public static void main(String[] args) {
        //把d盘下某个文件复制到d:/a下
        File from = new File("e:/东软培训/5 继承.wmv");
        File parent = new File("e:/东软培训/a");
        if(!parent.exists()){
            parent.mkdirs();
        }
        File to = new File("e:/东软培训/a" + from.getName());  // from.getName()是获取
        InputStream inputStream = null;
        OutputStream outputStream = null;
        byte[] b = new byte[1024];   //1024字节为单位的读取
        try {
            inputStream = new FileInputStream(from);    //获取要复制的内容
            outputStream = new FileOutputStream(to);
            int len = inputStream.read(b);
            while (len!=-1){
                outputStream.write(b,0,len);  //要读取的内容可能不是1024的倍数，所以写入要到内容的长度len
                outputStream.flush();             //将停留在流中的数据压入到复制好的文件中
                len = inputStream.read(b);
            }
            System.out.println("复制完成");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (outputStream!=null)
                     outputStream.close();
                if (inputStream!=null)
                     inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

}
