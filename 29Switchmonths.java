import java.util.Scanner;
 class Switchmonths {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of your month");
        int num=sc.nextInt();
        monthYear(num);

    }
    public static String monthYear(int monthNum){

return switch(monthNum){
                case 1 -> "january";
                case 2 -> "febraury";
                case 3 -> "March";
                case 4 -> "April";
                case 5 -> "May";
                case 6->  "june";
                case 7->   "july";
                case 8->  "August";
                case 9->  "September";
                case 10->  "october";
                case 11-> "November";
                case 12->  "December";
                default -> "Invalid days";
            };


    }
}
