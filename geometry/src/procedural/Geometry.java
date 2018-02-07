package procedural;

public class Geometry {

	public static final double PI = 3.141592653589793;

	public static double perimeter(String figure, int... dimensions) {
		if ("triangle".equals(figure)) {
			return dimensions[0] + dimensions[1] + dimensions[2];
		} else if ("circle".equals(figure)) {
			return 2 * PI * dimensions[0];
		} else if("carree".equals(figure)){
			return dimensions[0] + dimensions[1] + dimensions[2]+ dimensions[3];
		}
			return 0;
	}

}
