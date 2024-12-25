import java.util.Scanner;
 class Contrilmin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the first number");
        int num1=sc.nextInt();
        System.out.print("enter the second number");
        int num2=sc.nextInt();
        int minimum=num1<num2?num1:num2;
        System.out.println("the minimum number is: "+minimum);
    }
}
