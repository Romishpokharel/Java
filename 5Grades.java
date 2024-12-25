import java.util.Scanner;
 class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your grades");
        int percentage;
        percentage = sc.nextInt();
        if(percentage>100){
            System.out.println("Your grades is Invalid");
        }
        if (percentage >= 90 && percentage<=100 ) {
            System.out.println("your grade is A+");}
         else if (percentage>=80 && percentage<90 ) {
            System.out.println("your grade is A");}
         else if (percentage>= 70 && percentage<80) {
            System.out.println("your grades is B+");}
            else if(percentage<70){
            System.out.println("you are fali");

        }
    }}
