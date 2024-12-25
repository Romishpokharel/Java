import java.util.Scanner;
 class Controlabsolutevalue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number to calculate absolute value");
        int num =sc.nextInt();
        int Absolute=num<0?-num:num;
        System.out.println("the absolute value of a enterd numbber is "+Absolute);

    }
}
