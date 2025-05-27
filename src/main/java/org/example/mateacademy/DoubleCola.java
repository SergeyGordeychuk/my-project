package org.example.mateacademy;

import java.util.ArrayList;
import java.util.List;

public class DoubleCola {
    public static String getNthPerson(String[] names, int n) {
        List<String> list = new ArrayList<>();
        for (String name : names) {
            list.add(name);
        }
        for (int i = 0; i < n; i++) {
            if (list.size() >= n) {
                return list.get(n - 1);
            }
            String s = list.get(i);
            list.add(s);
            list.add(s);
        }
        return list.get(n - 1);
    }
}