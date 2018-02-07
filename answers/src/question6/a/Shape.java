package question6.a;

public abstract class Shape {
    protected final int x;
    protected final int y;
    public abstract int area();

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
