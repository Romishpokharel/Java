import java.util.Scanner;

 class Arraysumavg{
    public static void main(String[] args) {
        System.out.println("welcome to Array sum and average ");
        int[] numArray = Arrayutility.inputArray();
        long sum=sum(numArray);
        double Average=average(numArray);
        System.out.println("the sum of array is "+sum);
        System.out.println("the average of array is "+Average);
    }
    public static long sum(int[] numArray) {
long sum=0;
for (int i=0;i<numArray.length;i++){
    sum=sum+numArray[i];
}
return sum;


    }
    public static double average(int []numArray){
        double sums=sum(numArray);
        return (sums/numArray.length);

        }



    }




