import java.util.Scanner;
 class Fctorial {
    public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
        System.out.println("plz enter the number");
       int num=sc.nextInt();
      long fact= factorialNum(num);
        System.out.println("the factorial is "+fact);
    }
    public static long factorialNum(int num){
        if(num<2){
            return 1;
        }
        long  fact=1;
        for(int i=2;i<=num;i++){
            fact=fact*i;

        }
        return fact;

    }
}
