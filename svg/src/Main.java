//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 20;
        p1.y = 15;

        System.out.printf("x: " + p1.x + "\ny: " + p1.y + '\n');

        Point p2 = new Point();
        p2.x = 10;
        p2.y = 25;

        System.out.printf(p1.toString());
        System.out.println(p1.toSvg());

        Segment s1 = new Segment();
        s1.start = p1;
        s1.end = p2;
        System.out.println("Segment length = " + s1.length());


    }
}