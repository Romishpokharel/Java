import java.util.Scanner;

public class Arrayutility {
    public static int[] inputArray() {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int size = sc.nextInt();
        int[] num = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("plz enter your number:" + (i + 1));
            num[i] = sc.nextInt();

        }
        return num;
    }}