import java.util.Scanner;
 class PalindromeRec {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("enter the String");
        String name=sc.next();
        System.out.println("your string is"+(isPalindrome(name)?" palindrome": "not palindrome"));
    }
    public static boolean isPalindrome(String str){
        if(str.length()<=1){
            return true;
        }
        int last=str.length()-1;
        if(str.charAt(0)!=str.charAt(last)){
            return false;
        }
        String newString=str.substring(1,last);
        return isPalindrome(newString);

    }
}
