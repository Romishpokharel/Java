import java.sql.SQLOutput;
import java.util.Scanner;
class Calculator {
     public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
         System.out.print(" Enter your name: ");
       String name=sc.nextLine();

         System.out.println("\n Welcome " +name+  "To Simple  Calculator\n");

         System.out.print("enter the first number:");
         float num1=sc.nextFloat();
        
         System.out.print("enter the second number: ");
         float num2=sc.nextFloat();


         float sum=num1+num2;
         float diff=num1-num2;
         float mul=num1*num2;
         float rem=num1%num2;
         float div=num1/num2;



         System.out.println("The sum of two value is "+sum);
         System.out.println("The difference of two value is "+diff);
         System.out.println("The multiplication of two value is "+mul);
         System.out.println("The remainder of two value is "+rem);
         System.out.println("The division of two value is "+div);
     }
}
