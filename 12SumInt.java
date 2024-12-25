import java.util.Scanner;
 class SumInt {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("plz enter the number");
        int num=sc.nextInt();
       int sum =sumInt(num);
        System.out.println("sum of digits is :"+sum);

    }
    public static int sumInt(int num){
        int sum=0;
        while(num>0){
            sum=sum+num%10;
            num=num/10;

        }
        return sum;
}
}
