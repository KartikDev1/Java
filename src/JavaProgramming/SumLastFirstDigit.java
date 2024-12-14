package JavaProgramming;

public class SumLastFirstDigit {
    public static void main(String[] args) {
        int number = 379;

        int sum = number % 10;

        while(number > 0){
            int digit = number;
            number = number / 10;

            if(number == 0){
                sum += digit;
            }
        }
        System.out.println(sum);
    }
}
