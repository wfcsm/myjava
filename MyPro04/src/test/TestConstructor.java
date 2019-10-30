package test;

public class TestConstructor {
    public static void main(String[] args) {
        Point p = new Point(3.0,4.0);
        Point origin = new Point(0.0,0.0);
        Point p2 = new Point();
        System.out.println(p.getDistance(origin));

    }
}
class Point{
    double a,b;
    public Point(double x, double y){
        super();
        a = x;
        b = y;
    }
    public  Point(){}
    public double getDistance(Point p){
        return Math.sqrt((a-p.a)*(a-p.a)+(b-p.b)*(b-p.b));
    }
}
