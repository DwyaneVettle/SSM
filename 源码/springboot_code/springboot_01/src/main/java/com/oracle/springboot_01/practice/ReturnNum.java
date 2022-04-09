package com.oracle.springboot_01.practice;
import java.util.Scanner;
/**
 * @Author zoutr
 * @Description
 * @Date 2022/4/4
 * @Copyright 四川城市职业学院
 * 打印回形矩阵
 **/
public class ReturnNum {

 /*   public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("请输入矩阵的行列数：");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        pattern = new int[n][n];

        // 奇偶数的不同
        if (n % 2 == 0) {
            sum = n * n;
        } else {
            sum = n * n - 1;
            pattern[(n - 1) / 2][(n - 1) / 2] = n * n;
        }

        printPattern(0); //递归

        // 输出图案
        for (int[] row : pattern) {
            for (int column : row) {
                System.out.print(column + "\t");
            }
            System.out.println();
        }
    }


    static int n; // 列数
    static int sum;    //矩阵数字总个数
    static int flag = 1;
    static int[][] pattern;

    *//*
     * 打印图案功能，其中n为图案矩阵的行列数
     *//*
    static void printPattern(int layer) {

        // 上方赋值
        for (int i = layer; i < n - layer - 1; i++) {
            pattern[layer][i] = flag++;
            if (flag > sum) {
                return;
            }
            // 右边赋值
            for (int j = layer; j < n - layer - 1; j++) {
                pattern[j][n - layer - 1] = flag++;
                if (flag > sum) {
                    return;
                }
                // 下边赋值
                for (int k = n - layer - 1; k > layer; k--) {
                    pattern[n - layer - 1][k] = flag++;
                    if (flag > sum) {
                        return;
                    }
                    // 左边赋值
                    for (int l = n - layer - 1; l > layer; l--) {
                        pattern[l][layer] = flag++;
                        if (flag > sum) {
                            return;
                        }

                        printPattern(++layer);
                    }

                }
            }*/
        }