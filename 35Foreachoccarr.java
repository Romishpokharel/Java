import java.util.Scanner;

 class Foreachoccarr {
     public static void main(String[] args) {
        int[]arr=Arrayutility.inputArray();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number yo want to search");
        int num=sc.nextInt();
        int count=Occurences(arr,num);
        System.out.println("occurence is "+count);

            }
            public static int Occurences(int[]nums,int number){
    int count=0;
    for(int numb:nums){
        if(numb==number){
            count++;
        }


        }
    return count;
    }
}
