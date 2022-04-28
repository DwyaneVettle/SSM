package com.sccs.spring_web02.recursive;

import java.io.File;

public class ListFile {

    public static void main(String[] args) {
        getFiles("D:\\Software");
    }

    private static void getFiles(String path) {
        // 1.创建一个文件对象
        File file = new File(path);
        // 2.遍历改目录下的所有文件
        for (File f : file.listFiles()) {
            // 3、判断如果有文件是目录
            if (f.isDirectory()) {
                // 4.递归调用
                getFiles(f.getAbsolutePath());
            } else {
                // 5.如果不是目录，输出文件
                System.out.println(f.getAbsolutePath());
            }
        }
    }
}
