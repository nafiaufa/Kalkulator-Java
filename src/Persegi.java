public class Persegi {
    Persegi() {}
    public double luas(double s1) {
        return (s1 * s1);
    }
    public double keliling(double s1) {
        return (s1 * 4);
    }

    public double sisi(double s1) {
        return Math.sqrt(s1);
    }

    public double diagonal(double s1) {
        return Math.sqrt((s1 * s1) + (s1 * s1));
    }
}
