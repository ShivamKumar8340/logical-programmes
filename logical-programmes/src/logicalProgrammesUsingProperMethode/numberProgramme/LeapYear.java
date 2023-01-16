package logicalProgrammesUsingProperMethode.numberProgramme;

public class LeapYear {

    public static void main(String[] args) {
        LeapYear leapYear = new LeapYear();
        leapYear.checkLeapYear(100);
    }
    void checkLeapYear(int year) {
        boolean leap = false;
        if (year%4==0) {
            leap=true;

            if (year%100==0) {
                if (year % 400 == 0) {
                    leap = true;
                } else
                    leap = false;
            }
        }
        else
            leap=false;

        if (leap) {
            System.out.println("year "+year+" is leap year");
        }
        else
            System.out.println("year "+year+" is not leap year");
    }
}
