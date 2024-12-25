import java.util.Scanner;
class PasswordChecker {
     public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String password;
do{
    System.out.println("enter the password");
    password=sc.next();
}
while(!isValid(password));
         System.out.println("your password is valid");
     }
     public static boolean isValid(String password){

         return password.length()>6;
     }
}
