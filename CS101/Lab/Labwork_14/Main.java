package CS101.Lab.Labwork_14;

public class Main {
    public static void main(String[] args) {

        Point p1 = new Point(15, 15);
        Point p2 = new Point(0, 0);
        Point p3 = new Point(10, 0);
        Point p4 = new Point(0, 10);

        Line l1 = new Line(p1, p2);
        Line l2 = new Line(p3, p4);

        System.out.println(l1.intersection(l2).getX());
        System.out.println(l1.intersection(l2).getY());
    }
}