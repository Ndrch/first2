
public class abc {

	public static void main(String[] args) {
		double a = 3;
		double b = 2.5;
		double c = -0.5;
		double D = b * b - 4 * a * c;

		if (D == 0 && a != 0 && b != 0) {
			double x1 = (-b) / (2 * a);
			double x2 = (-b) / (2 * a);
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
			return;
		}

		else if (D > 0 && a > 0) {
			double x1 = ((-b) + (Math.sqrt(D))) / (2 * a);
			double x2 = ((-b) - (Math.sqrt(D))) / (2 * a);
			System.out.println("x1=" + x1);
			System.out.println("x2=" + x2);
			return;
		} else if (D > 0 && a == 0) {
			System.out.println("x1=" + 0.00);
			System.out.println("x2=" + 0.00);
			return;
		}

		else {
			System.out.println("x1=");
			System.out.println("x2=");
			return;
		}
	}
}