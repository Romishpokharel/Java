import java.util.Scanner;

 class Temprconversion {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         float F,C;
         System.out.print("Enter the tmepterature in Fahrenheit: ");
         F=sc.nextFloat();
         C=(F-32)*5/9;
         System.out.print(" The temeperature in celsius is:" +C);
     }

}
