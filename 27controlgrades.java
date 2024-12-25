import java.util.Scanner;
 class controlgrades {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your score:");
        int score=sc.nextInt();
        String check=score>80?"High":score>50?"moderate":"high";
        System.out.println(check);
    }
}
