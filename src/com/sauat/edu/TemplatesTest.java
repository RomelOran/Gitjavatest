package com.sauat.edu;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Romel
 * @date 2022/10/13 - 19:34
 */
public class TemplatesTest {
//    常用的模板1 main
    public static void main(String[] args) {
//        模板二  sout
        System.out.println("hello");
//        变形 soutp /soutm /soutv /xxx.sout
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("TemplatesTest.main");
        int num = 10;
        int num2 = 10;
        System.out.println("num = " + num);
        System.out.println(num2);
//        模板三 fori
        String[] arrs = new String[]{"lilei", "hanmeimei"};
        for (int i = 0; i <arrs.length; i++) {
            System.out.println(arrs[i]);

        }
        for (String arr : arrs) {
            System.out.println(arrs);
        }
        ArrayList list = new ArrayList();
        list.add("123");
        list.add("456");
        list.add("789");
        for (Object o : list) {

        }
        for (int i = 0; i < list.size(); i++) {

        }
//        模板四 ifn
        ArrayList list1 = new ArrayList();
        list.add("123");
        list.add("456");
        list.add("789");
        if (list == null) {

        }
//        变形 inn
        if (list != null) {

        }
        if (list != null) {

        }
//        变形 list.nn
        if (list == null) {

        }
//        模板五


    }


}
