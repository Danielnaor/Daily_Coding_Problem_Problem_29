package com.mycompany.daily_coding_problem_problem_29;

/**
 *
 * @author Danielnaor
 */
public class Daily_Coding_Problem_Problem_29 {

    public static void main(String[] args) {
        System.out.println(run_length_encoding("AAAABBBCCDAA")); // 4A3B2C1D2A
        System.out.println(run_length_decoding("4A3B2C1D2A")); // AAAABBBCCDAA

    }

    public static String run_length_encoding(String decodedString) {
        if (decodedString == null || decodedString.length() == 0) {
            return decodedString;
        }
        String s = "";
        int strike = 0;
        for (int i = 0; i <= decodedString.length(); i++) {
            if ((i != decodedString.length()) && (i == 0 || decodedString.charAt(i) == decodedString.charAt(i - 1))) {
                strike++;
            } else {
                s += strike;
                s += decodedString.charAt(i - 1);
                strike = 1;

            }

        }

        return s;
    }

    public static String run_length_decoding(String encodedString) {
        String s = "";

        String numberBuilder = "";
        while (encodedString.length() > 0) {
            if (Character.isDigit(encodedString.charAt(0))) {
                numberBuilder += encodedString.charAt(0);
                encodedString = encodedString.substring(1);
            } else {
                int num = Integer.parseInt(numberBuilder);
                for (int i = 0; i < num; i++) {
                    s += encodedString.charAt(0);
                }
                numberBuilder = "";
                encodedString = encodedString.substring(1);

            }
        }
        return s;
    }

}
