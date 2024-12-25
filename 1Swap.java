import java.util.Scanner;
class Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the value of a and b");
        a=sc.nextInt();
        b=sc.nextInt();
        c=a;
        a=b;
        b=c;
        System.out.println("After swap");
        System.out.println(" a= " +a);
        System.out.println(" b= "+b);
    }

}
