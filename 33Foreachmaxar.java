 class Foreachmaxar {
    public static void main(String[] args) {
        System.out.println("welcome to find mac integer array");
        int[]arr=Arrayutility.inputArray();
        int max=Integer.MIN_VALUE;
        for(int number:arr){
        if(max<number){
            max=number;
        }
    }
        System.out.println("maximum is"+max);
}}
