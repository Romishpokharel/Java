import java.util.Scanner;
 class Fibonnaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        Fibonacci(num);
    }
    public static void Fibonacci(int num){
        int a=0;int b=1;
        if(num>=1) {
            System.out.print( a );
        }if(num>=2){
            System.out.print( b );
        }
        for(int i=2;i<num;i++){
            int next=a+b;
            System.out.print( next );
            a=b;
            b=next;
        }
    }
}
