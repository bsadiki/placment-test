package object.oriented;

public class FigureFactory {

    public Figure create(String code, double... dimensions) {
        if ("triangle".equals(code)) {
            return new Triangle(dimensions[0], dimensions[1], dimensions[2]);
        }

        if ("circle".equals(code)) {
            return new Circle(dimensions[0]);
        }
        if ("carree".equals(code)) {
            return new Carree(dimensions[0], dimensions[1], dimensions[2], dimensions[3]);
        }

        return Figure.NO_FIGURE;
    }

}
