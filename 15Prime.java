import java.util.Scanner;
class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("plz enter the number");
        int num = sc.nextInt();
        int count=primeNum(num);
        if(count==2){
            System.out.println("it is prime"+num);}
        else{
            System.out.println("not prime0"+num);
        }
    }

    public static int primeNum(int num) {

        int count=0;
        for (int i=1;i<=num;i++){
            if (num%i==0){
                count++;
            }
        }
        return count;
    }}
