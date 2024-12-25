import java.util.Scanner;
 class Guessinggames {

    int random;
    Guessinggames(){
          random=(int)Math.round(Math.random()*100);
    }
    public  int Guess(int guessNumber){
        return guessNumber-random;


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("welcome to guessing games");
        Guessinggames game=new Guessinggames();
        int guess;
        int result;
        do {
            System.out.println("Guess the number ");
            guess = sc.nextInt();
            result = game.Guess(guess);
            if(result==0){
                System.out.println("your guess is correct");

            }else if(result<0) {
                System.out.println("plz guess higher number ");
            }
            else{
                System.out.println("guess a bit lower ");
                }


        }while(result!=0);

    }
}
