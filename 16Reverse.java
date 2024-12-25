import java.util.Scanner; class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" plz enter the number");
        int num=sc.nextInt();
        int rev=Reverse(num);
        System.out.println("the reverse of a number is:"+rev);}
    public static int Reverse(int num) {
        int newNum=0;
        while(num>10){
            int digit=num%10;
            newNum=newNum*10+digit;
            num/=10;
        }
        return newNum;

    }
}
