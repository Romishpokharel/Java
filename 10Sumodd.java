import java.util.Scanner;
 class Sumodd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Plz enter the number");
        int num=sc.nextInt();
        int d=sumOdds(num);
        System.out.println("the sum of odd number from 1 to entered number is :"+d);
    }
    public static int sumOdds(int num){
        int sum=0;
        for(int i=1;i<=num;i+=2){

            sum=sum+i;


        }
        return sum;

    }
}
