import java.util.Scanner;
 class Circle {
    double radiusInMm;

    public Circle(double radiusInMm) {
        this.radiusInMm = radiusInMm;
    }
    double getArea(){
        return Math.PI*Math.sqrt(radiusInMm);

    }

    @Override
    public String toString() {
        /*final StringBuilder sb = new StringBuilder("Circle{");
        sb.append("radiusInMm=").append(radiusInMm);
        sb.append('}');
        sb.append("your circumferance=").append(getArea());
        return sb.toString();*/
        return "your radius is "+radiusInMm +" \n"+"your circumferance is "+getArea();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius");
        int r=sc.nextInt();
        Circle circle =new Circle(r);
        System.out.println(circle.toString());

    }
}
