import java.util.Scanner;
import java.util.Scanner;
 class Countarrray {
    public static void main(String[] args) {
        System.out.println("welcome to counter of same occurence of an element in an array");
        int[] numArray=Arrayutility.inputArray();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want to find");
        int num=sc.nextInt();
        int count=Occurences(numArray,num);
        System.out.println(" the number you enter occured is "+count+ "times");
        }
        public static int Occurences(int[]numArray, int num) {
            int occ = 0;

            for (int i = 0; i < numArray.length; i++) {
                if (numArray[i] == num) {
                    occ++;
                }
            }
            return occ;
        }}



