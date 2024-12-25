import java.util.Scanner;
public class Suminte {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in) ;
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int sum=Sums(num);
        System.out.println("Yhe sum of int of number is"+sum);

    }
    public static int Sums(int num){
        int sum=0;
        while(num>0){
            sum=sum+num%10;
            num=num/10;
        }
        return sum;
    }
}
