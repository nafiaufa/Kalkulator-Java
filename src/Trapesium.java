public class Trapesium {
    Trapesium(){}

    public double luas(double s1, double s2, double s3) {
        return (0.5 * (s1 + s2) * s3);
    }

    public double keliling(double s1, double s2, double s3, double s4) {
        return (s1 + s2 + s3 + s4);
    }

    public double tinggi(double a, double b, double s) {
        return (Math.sqrt(s * s - ((b - a) * (b - a))));
    }
}
