public class Tabung {
    Tabung (){}
    private final double pi = 3.14;
    public double volume(double r, double t) {return pi * (r * r) * t;}
    public double luasPermukaan(double r, double t) {return 2 * pi * r * (r + t);}
    public double luasSelimut(double r, double t) {return 2 * pi * r * t;}
    public double luasAlas(double r) {return pi * (r * r);}
    public double tinggi(double LP, double r) { return LP / 2 * pi * r - r;}
    public double jariAlas(double v, double t) {return Math.sqrt(v) / (pi * t);}
}
