import java.util.Scanner;
 class Gcd {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("enter your numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int gcd=findGcd(a,b);
        System.out.println("the Gcd of entersd number is :"+gcd);
    }
    public static int findGcd(int num1, int num2){
        int gcd=1;
        int least=lowNum(num1,num2);
        for(int i=2;i<=least;i++) {
            if (num1 % i == 0 && num2 % i == 0){
                gcd = i;
        }

            }
            return gcd;}
        public static int lowNum(int a, int b){
            if (a<b){
                return a;}
                else{
                    return b;
                }
            }
        }



