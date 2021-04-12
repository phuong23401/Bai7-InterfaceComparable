import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle(){
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, Paint fill) {
        super(radius, fill);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;
    }
}
