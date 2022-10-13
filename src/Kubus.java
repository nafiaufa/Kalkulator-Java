public class Kubus {
    Kubus(){}


    public double volume(double s1) {
        return (s1 * s1 * s1);
    }
    public double luasPermukaan(double s1) {
        return (6 * (s1 * s1));
    }
    public double sisiRusuk(double s1) {
        return Math.sqrt(s1);
    }
    public double diagonalSisi(double s1) {return s1;}
    public double diagonalRuang(double s1) {return s1;}
    public double bidangDiagonal(double s1) {return s1 * s1;}
}
