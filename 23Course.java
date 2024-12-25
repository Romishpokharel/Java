 class Course {
    static int maxCapacity=100;
    int enrollments;
    String courseName;
    Course(String courseName){
        this.courseName=courseName;
        this.enrollments=0;//basically by default enroolment is zero but we can assign the value in constuctor
    }

String [] enrolledStudent=new String[maxCapacity];


static void setMaxCapacity(int capacity){
    Course.maxCapacity=capacity;

}
void enrollments(String studentName) {
    if (enrollments < maxCapacity) {
        enrolledStudent[enrollments] = studentName;
        enrollments++;
        System.out.println(studentName + " has been enrolled in " + courseName);
    } else {
        System.out.println("students are enrolled no seats available");

    }}



     public static void main(String[] args) {
Course.setMaxCapacity(75);
         System.out.println("the size for the student is" +Course.maxCapacity);

         Course admit=new Course("BIM");
         admit.enrollments("Romish");
     }

}


