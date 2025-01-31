package org.example;

public class Vowels {
    public static void main(String[] args) {

        String str = "pramod";
        int vowels_count = 0;
        int consonents_count=0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'a' || str.charAt(i)== 'e' || str.charAt(i) =='i' || str.charAt(i) == 'o' || str.charAt(i)=='u') {
                vowels_count++;
            } else if (str.charAt(i) > 'a' && str.charAt(i) <='z')
            {
                consonents_count++;
            }
        }

        System.out.println("vowels count is "+ vowels_count);
        System.out.println("consonents count is " + consonents_count);
    }
}
