package org.example.test;

public class Mumbling {
  public static String mumble(String string) {
    if (string.isEmpty()) {
      return string;
    }
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < string.toLowerCase().length(); i++) {
      for (int j = 0; j < i + 1; j++) {
        if (j == 0) {
          builder.append(string.toUpperCase().charAt(i));
        } else {
          builder.append(string.toLowerCase().charAt(i));
        }
      }
        if (i != string.length() - 1) {
            builder.append("-");
        }
    }
    return builder.toString();
  }
  public static void main(String[] args) {
    System.out.println(mumble("Hello"));
  }
}