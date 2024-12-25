import java.util .Scanner;
class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("plz enter the number");
    int num=sc.nextInt();
    int pal=checkPalindrome(num);
    if(pal==num){
        System.out.println("is Palindrome");}
    else{
        System.out.println("not palindrome");
    }


    }


    public static int checkPalindrome(int num){
        int newNum=0;
        while(num>0){
            int digit=num%10;
             newNum=newNum*10+digit;
            num/=10;
        }
        return newNum;

    }
}
