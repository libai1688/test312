package com.ithei.itheima_o1;

import java.util.ArrayList;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李三");
        list.add("王三");
        list.add("赵三");
        for (int i = 0; i < list.size(); i++) {
           String s = list.get(i);
            System.out.println(s);
        }
        System.out.println("test");
    }
}
