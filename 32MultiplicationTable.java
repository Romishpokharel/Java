import java.util.Scanner;
 class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number for the mul table");
        int num=sc.nextInt();

        for(int i=1;i<=10;i++){
            int mul=num*i;
            System.out.println("the mul of "+num  + "*"+i + " is "+mul);
        }
        ;
    }
}
