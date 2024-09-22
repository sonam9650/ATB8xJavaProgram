package Sept.ex_20092024;

public class Lab068_Leap_Year {
    public static void main(String[] args) {

        //✅ Leap Year Program - Find 2024
                int year = 2024;

                boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
                if (isLeapYear) {
                    System.out.println(year + " is a leap year.");
                } else {
                    System.out.println(year + " is not a leap year.");
                }
            }
        }

