
import java.util.Scanner;


     class Lcm {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("plz enter the value of a and b number");
            int a=sc.nextInt();
            int b=sc.nextInt();
            int lcm=Lcms(a,b);
            System.out.println("the lcm of and b are"+lcm);
        }
        public static int Lcms(int a, int b) {
            for (int i = a; i <= b; i++) {
                int factor = a * i;
                if (factor % b == 0) {
                    return factor;
                }
            }
return a*b;

        }
        }





