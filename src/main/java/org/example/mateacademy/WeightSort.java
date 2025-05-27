package org.example.mateacademy;

import java.util.Arrays;
import java.util.Comparator;

public class WeightSort {
    public static String orderWeights(String weights) {
        if (weights.isEmpty()) {
            return weights;
        }
        String[] s = weights.split(" ");
        Arrays.sort(s, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int n1 = calculateWeight(o1);
                int n2 = calculateWeight(o2);
                if (n1 != n2) {
                    return Integer.compare(n1, n2);
                }
                return o1.compareTo(o2);
            }
        });
        return String.join(" ", s);
    }

    private static int calculateWeight(String number) {
        int weight = 0;
        for (Character c : number.toCharArray()) {
            weight += c - '0';
        }
        return weight;
    }
}