package com.javademo.l3p4.constantsdemo;

/**
 * Desription:
 *
 * @ClassName Constants2
 * @Author Zhanyuwei
 * @Date 2020/3/28 23:06
 * @Version 1.0
 **/
public class Constants2 {

    public static final double CM_PER_INCH = 2.54;

    public static void main(String[] args) {
        double paperWidth = 8.5;
        double paperHeight = 11;

        System.out.println("Paper size in centimeters: "+paperWidth * CM_PER_INCH + "by " + paperHeight * CM_PER_INCH);
    }
}
