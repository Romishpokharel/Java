
import java.util.Scanner;
class Agecal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        int age = sc.nextInt();
        if (age >= 65) {
            System.out.println("you are an senior citizen");
        } else if (age >= 20) {
            System.out.println("you are an adult");
        } else if (age >= 13) {
            System.out.println("you are teenage");
        } else  {
            System.out.println("you are a child");

        }
    }
}

