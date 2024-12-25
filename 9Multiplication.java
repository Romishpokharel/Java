import java.util.Scanner;
 class Multiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
       int num=sc.nextInt();
    multiplicationNum(num);
    }
    public static void multiplicationNum(int num){
        for(int i=1;i<=10;i++){
            int mul=num*i;
            System.out.println(num+" x "+i+ " ="+mul);
        }



        }
    }

