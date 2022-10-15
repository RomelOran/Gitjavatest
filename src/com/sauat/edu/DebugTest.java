package com.sauat.edu;

import java.util.HashMap;

/**
 * @author Romel
 * @date 2022/10/14 - 16:31
 */
public class DebugTest {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);

        }
        HashMap<String, String> map = new HashMap<>();
       map.put("name", "Tom");
       map.put("age", "12");
       map.put("school", "Tsinghuw");
       map.put("major", "computer");

       String age = map.get("age");
        System.out.println("age = " + age);

        map.remove("major");
        System.out.println(map);

    }
}
