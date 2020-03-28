package com.javademo.l3p4.constantsdemo;

/**
 * Desription:
 *
 * @ClassName Constants1
 * @Author Zhanyuwei
 * @Date 2020/3/28 23:01
 * @Version 1.0
 **/
public class Constants1 {

    public static void main(String[] args) {
        final double CM_PER_INCH = 2.54;
        double paperWidth = 8.5;
        double paperHeight = 11;

        System.out.println("Paper size in centimeters: "+paperWidth * CM_PER_INCH + "by " + paperHeight * CM_PER_INCH);
    }
}
