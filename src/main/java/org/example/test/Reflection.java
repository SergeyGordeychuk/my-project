package org.example.test;

import java.lang.reflect.Field;

public class Reflection {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        int num = myClass.getNumber();
        String str = null;
        String str2 = null;
        System.out.println(num);
        try {
            Field name = myClass.getClass().getDeclaredField("name");
            name.setAccessible(true);
            str = (String) name.get(myClass);
            System.out.println(num + " " + str);
            name.set(myClass, (String) "new str");
            System.out.println(num + " " + str);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public static class MyClass {
        private int number = 5;
        private String name = "default";

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public void setName(String name) {
            this.name = name;
        }

        private void printData() {
            System.out.println(number + " " + name);
        }
    }
}
