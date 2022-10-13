public class PersegiPanjang {
    PersegiPanjang() {}
    public double luas(double s1, double s2) {
        return (s1 * s2);
    }
    public double keliling(double s1, double s2) {
        return (2 * (s1 + s2));
    }
    public double panjang(double s1, double s2) {
        return (s1 / s2);
    }
    public double lebar(double s1, double s2) {
        return (s1 / s2);
    }
    public double diagonal(double s1, double s2) {
        return Math.sqrt((s1 * s1) + (s2 * s2));
    }
}
