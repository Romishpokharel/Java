import java.util.Scanner;
 class Controloddeven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num");
        int num=sc.nextInt();
        //for(int i=1;i<=num;i+=2){
          //  System.out.println(i);





        String chek=num%2==0?"the number is even":"the number is odd";
           System.out.println(chek);


    }
}
