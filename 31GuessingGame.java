import java.util.Scanner;
 class GuessingGame {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int num=5;
        int guess;
        do{
            System.out.println("guess the number form 1 to 10");
            guess=sc.nextInt();
        }
        while(guess!=num);
        System.out.println("your guess is absolute correct");

    }
}
