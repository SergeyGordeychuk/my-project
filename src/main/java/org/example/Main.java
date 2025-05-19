package org.example;


import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;

public class Main {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int x = 10;
        String[] str = {"romeo", "juliette"};
        for (int multiple : getMultiples(2, 10)) {
            System.out.print(multiple);
        }

        System.out.println();

    }

    public static int[] getMultiples(int multiples, int number) {
        int[] result = new int[multiples];
        for (int i = 0; i < multiples; i++) {
            result[i] = number * (i + 1);
        }
        return result;
    }

    public static String extractFileName(String dirtyFileName) {
        int index = dirtyFileName.indexOf("_");
        String[] split = dirtyFileName.substring(index + 1).split("\\.");
        return split[0] + "." + split[1];
    }

    public static String findScreenSize(int width, String ratio) {
        String[] split = ratio.split(":");
        int height = 0;
        return new String(width + "x" + ((width/Integer.parseInt(split[0])*Integer.parseInt(split[1]))));
    }

    public static boolean isVowel(String string) {
        switch (string.toLowerCase()) {
            case "a", "e", "i", "o", "u":
                return true;
        }
        return false;
    }

    public static int findShortest(String string) {
        int length = Integer.MAX_VALUE;
        for (String s : string.split(" ")) {
            if (length > s.length()) {
                length = s.length();
            }
        }
        return length;
    }

    public static boolean isTheSameAmountOfXO(String string) {
        int x = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.toLowerCase().charAt(i) == 'o') {
                x++;
            } else if (string.toLowerCase().charAt(i) == 'x') {
                x--;
            }
        }
        return x == 0;
    }

    public static IntUnaryOperator add(int n) {
        return x -> x + n;
    }

    public static String isSpecialNumber(int number) {
        String str = "123450";
        String s = String.valueOf(number);
        for (int i = 0; i < s.length(); i++) {
            if (!str.contains(String.valueOf(s.charAt(i)))) {
                return "NOT!!";
            }
        }
        return "Special!!";
    }

    public static String sortGiftCode(String code) {
        return Arrays
                .stream(code.split(""))
                .sorted()
                .collect(Collectors.joining());
    }

    public static String[] capitalizeNames(String[] names) {
        String[] result = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            String builder = names[i].substring(0, 1).toUpperCase(Locale.ROOT)
                    + names[i].substring(1).toLowerCase(Locale.ROOT);
            result[i] = builder;
        }
        return result;
    }
}