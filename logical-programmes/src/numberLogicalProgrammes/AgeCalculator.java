package numberLogicalProgrammes;

import java.util.Scanner;

public class AgeCalculator {

    public static void calculateAge( int currentDate, int currentMonth, int currentYear,
                                     int birthDate, int birthMonth, int birthYear) {
        int month[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (birthDate>currentDate) {
            currentMonth = currentMonth-1;
            currentDate=currentDate+month[birthMonth-1];
        }
        if (birthMonth>currentMonth) {
            currentYear=currentYear-1;
            currentMonth=currentMonth+12;
        }
        int calculateDate=currentDate-birthDate;
        int calculateMonth=currentMonth-birthMonth;
        int calculateYear= currentYear-birthYear;

        System.out.println("You are "+calculateYear+" years "+calculateMonth+" months "+calculateDate+" days old");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter current date in  YYYY-MM-DD");
        int currentYear = scanner.nextInt();
        int currentMonth = scanner.nextInt();
        int currentDate = scanner.nextInt();

        System.out.println("Enter birth date in YYYY_MM_DD");
        int birthYear = scanner.nextInt();
        int birthMonth = scanner.nextInt();
        int birthDate = scanner.nextInt();

        calculateAge(currentDate, currentMonth, currentYear, birthDate, birthMonth, birthYear );
    }
}
