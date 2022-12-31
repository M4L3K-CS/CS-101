package CS101.Lab.Labwork_13;

public class Main {
    public static void main(String[] args) {

        Point p1 = new Point(0, 0);
        Point p2 = new Point(10, 0);
        Point p3 = new Point(0, 10);
        Point p4 = new Point(1, 1);

        Line l1 = new Line(p1, p2);
        Line l2 = new Line(p3, p4);

        System.out.println(l1.intersection(l2).getX());
        System.out.println(l1.intersection(l2).getY());

        Point tr1 = new Point(0, 0);
        Point tr2 = new Point(0, 2);
        Point tr3 = new Point(2, 0);

        Point ChosenPoint = new Point(1, 1);

        Triangle tr = new Triangle(tr1, tr2, tr3);
        System.out.println(tr.contains(ChosenPoint));
    }
}