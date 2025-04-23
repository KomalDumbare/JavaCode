import java.util.Scanner;

class Leap_Year {
    private int year;

    public void set(int year) {
        this.year = year;
    }

    public void show() {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("The year " + year + " is a leap year.");
        } else {
            System.out.println("The year " + year + " is not a leap year.");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Leap_Year LY = new Leap_Year();
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        LY.set(year);
        LY.show();
        sc.close();
    }
}
