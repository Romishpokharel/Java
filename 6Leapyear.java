
import java.util.Scanner;
 class Leapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("plz enter the year");
        int year;
        year=sc.nextInt();
        if((year%400==0 && year%4==0) || ( year % 100 !=0)){
            System.out.println("the entered number is a leap year  ");}
            else{
                System.out.println("the year is not a leap year");
            }


















        }
    }

