 class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age=age;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("your name is='").append(name).append('\'');
        sb.append(", oh your age is=").append(age);
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        Student std=new Student("romish",22);
        System.out.println(std.toString());

    }
}
