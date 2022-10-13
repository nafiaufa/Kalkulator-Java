public class Balok {
    Balok(){}
    public double volume(double p, double l, double t) {return (p * l * t);}
    public double luasPermukaan(double p, double l, double t) {return 2 * ((p * l) + (p * t) + (l * t));}
    public double panjang(double v, double l, double t) {return v / (l * t);}
    public double lebar(double v, double p, double t) {return v / (p * t);}
    public double tinggi(double v, double p, double l) {return v / (p * l);}
    public double diagonalBidang(double p, double l) {return Math.sqrt((p * p) + (l * l));}
    public double diagonalRuang(double p, double l, double t) {return Math.sqrt((p * p) + (l * l) + (t * t));}
    public double luasBidangDiagonal(double p, double l, double t) {return Math.sqrt((l * l) + (t * t)) * p;}

}
