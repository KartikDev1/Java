package JavaProgramming;

import java.text.DecimalFormat;

public class Hello {

    public static  boolean isLeapYear(int year){
        if(year >= 1 && year <= 9999){
            return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        }
        return false;
    }

    public static int getDaysInMonth(int month,int year){
        int days = 0;
        if(month < 1 || month > 12){
            return -1;
        }
        if(year < 1 || year > 9999){
            return -1;
        }
        if(isLeapYear(year)){
            switch (month){
                case 1, 3 ,5,7,8,10,12-> days = 31;
                case 2 -> days = 29;
                case 4,6,9,11 -> days = 30;
            };
        }else{
            switch (month){
                case 1, 3 ,5,7,8,10,12-> days = 31;
                case 2 -> days = 28;
                case 4,6,9,11 -> days = 30;
            };
        }
        return days;
    }
    public static void main(String[] args) {
        System.out.println(isLeapYear(2000));
        System.out.println(getDaysInMonth(2,2001));
    }
}
