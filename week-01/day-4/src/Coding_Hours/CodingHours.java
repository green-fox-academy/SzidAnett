package Coding_Hours;

public class CodingHours {

    public static void main(String[] args) {

        int dailyHours = 6;
        int weeks = 17;

        System.out.println("Hours spent with coding in a semester: " + (weeks * 5 * dailyHours));

        int a = weeks * 5 * dailyHours;
        int b = weeks * 52;

        System.out.println("Percentage of the coding hours: " + ((float) a / b * 100) + "%");



    }
}
