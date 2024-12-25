 class SumPositive {
    public static void main(String[] args) {
        int []numArr=Arrayutility.inputArray();
        int sum=0;
        for(int number:numArr){
            if(number<0){
                continue;
            }
            sum+=number;
        }
        System.out.println("the sum is "+sum);
    }
}
