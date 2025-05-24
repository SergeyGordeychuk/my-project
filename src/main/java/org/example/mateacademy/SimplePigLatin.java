package org.example.mateacademy;

public class SimplePigLatin {
    public static String toSimplePigLatin(String string) {
        String str = "ay";
        StringBuilder builder = new StringBuilder();
        String[] s = string.split(" ");
        for (int i = 0; i < s.length; i++) {
            if (!Character.isAlphabetic(s[i].charAt(0))) {
                if (i == s.length - 1) {
                    builder.append(s[i]);
                    continue;
                } else {
                    builder.append(s[i]).append(" ");
                    continue;
                }
            }
            if (i != s.length - 1) {
                builder.append(s[i].substring(1, s[i].length()))
                        .append(s[i].substring(0, 1))
                        .append(str)
                        .append(" ");
            } else {
                builder.append(s[i].substring(1, s[i].length()))
                        .append(s[i].substring(0, 1))
                        .append(str);
            }
        }
        return builder.toString();
    }
}