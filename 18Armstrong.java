import java.util.Scanner;
 class Armstrong {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("enter your number");

        int num=sc.nextInt();
        //int orginalnum=num;
        int rum=Armstrong(num);
        if(rum==num){
            System.out.println("is Armstrong");}
        else{
            System.out.println("is not armstrong");}

    }
    public static int Armstrong(int num){
        int sum=0;
        while(num>0){
            int r=num%10;
            num/=10;
            sum=sum+r*r*r;}
            return sum;

                }
            }



