import java.util.Scanner;
class FibonnaciRecursion {
    public static void main(String[] args) {
        System.out.println("enter the numbe of fibonacci you want to print");
        Scanner sc=new Scanner(System.in);
        int count=sc.nextInt();
        for(int i=1;i<=count;i++){
            System.out.print(Fibonnaci(i)+ "");
        }

    }
    public static int Fibonnaci(int position){

        if(position==1) {
            return 1;

        }
        if (position==2){
            return 1;

        }
        return Fibonnaci(position-1) + Fibonnaci(position-2);




    }
}
