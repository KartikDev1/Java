package JavaProgramming;

import static java.lang.Integer.parseInt;

public class numberPalindrome {
    public static void main(String[] args) {
        int number = 777;

        int reversed_num = 0;
        while(number > 0){
            reversed_num = reversed_num * 10 + number % 10;
            number = number / 10;
        }
        if(reversed_num == number){
            System.out.println("true");
        }
        System.out.println("false");
    }
}
