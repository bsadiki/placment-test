package object.oriented;

public class Carree extends Figure {
    private final double a;
    private final double b;
    private final double c;
    private final double d;

    public Carree(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public double perimeter() {
        return a + b + c + d;
    }
}
