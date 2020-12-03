import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String figure = scanner.nextLine ();
        double area = 0;
        if (figure.equals ("square")) {
            double side = Double.parseDouble (scanner.nextLine ());
            area = side * side;
            System.out.printf ("%.3f", area);
        } else if (figure.equals ("rectangle")) {
            double sideA = Double.parseDouble (scanner.nextLine ());
            double sideB = Double.parseDouble (scanner.nextLine ());
            area = sideA * sideB;
            System.out.printf ("%.3f", area);
        } else if (figure.equals ("circle")) {
            double radius = Double.parseDouble (scanner.nextLine ());
            area = radius * radius * Math.PI;
            System.out.printf ("%.3f", area);
        } else if (figure.equals ("triangle")) {
            double a = Double.parseDouble (scanner.nextLine ());
            double ah = Double.parseDouble (scanner.nextLine ());
            area = (a * ah) / 2;
            System.out.printf ("%.3f", area);
        }
    }
}