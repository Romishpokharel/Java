import java.util.Scanner;
 class Switchcalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int num1=sc.nextInt();
        System.out.println("enter the second number");
        int num2=sc.nextInt();
        System.out.println("enter the operation (*,+,-,/)");

        String operation= sc.next();
       int result=calculator(num1,num2,operation);
        System.out.println("the result is "+result);
    }
        public static int calculator(int num1, int num2, String operation){
            return switch(operation){
                case"+"->
                        num1+num2;
                case"-"->
                    num1-num2;
                case"*"->
                    num1*num2;
                case"/"->
                    num1/num2;
                default->0;};}}

