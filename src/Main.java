import java.text.DecimalFormat;
import java.util.Scanner;
import java.math.RoundingMode;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        mainMenu();
    }
    private static void mainMenu(){
        System.out.println("\nmasukan input:");
        var inputCommand = scanner.nextLine();

        switch (inputCommand){
            case "help" :
                System.out.println("list command bangun datar");
                System.out.println("1. segitiga");
                System.out.println("2. persegi");
                System.out.println("3. persegi panjang");
                System.out.println("4. jajar Genjang");
                System.out.println("5. belah ketupat");
                System.out.println("6. layang-layang");
                System.out.println("7. trapesium");
                System.out.println("8. lingkaran");
                System.out.println("list command bangun ruang");
                System.out.println("1. kubus");
                System.out.println("2. balok");
                System.out.println("3. tabung");
                System.out.println("4. bola");
                System.out.println("ex input => segitiga, segitiga help, segitiga luas");
                mainMenu();
            case "segitiga":
                System.out.println("segitiga adalah poligon dengan tiga ujung dan tiga simpul.");
                mainMenu();
            case "segitiga help":
                System.out.println("cari menggunakan command => segitiga luas,segitiga keliling, segitiga tinggi, segitiga alas");
                mainMenu();
            case "segitiga luas":
                System.out.println(" Luas = 1/2 x a x t");
                SegitigaL();
                mainMenu();
            case "segitiga keliling":
                System.out.println("Keliling = s + s + s");
                SegitigaK();
                mainMenu();
            case "segitiga tinggi":
                System.out.println("Tinggi = (2 * L) : a");
                SegitigaT();
                mainMenu();
            case "segitiga alas":
                System.out.println("Alas = (2 * L) : t");
                SegitigaA();
                mainMenu();
            case "persegi":
                System.out.println("Persegi merupakan turunan dari segi empat yang mempunyai ciri khusus keempat sisinya sama panjang dan keempat sudutnya siku-siku");
                mainMenu();
            case "persegi help":
                System.out.println("cari menggunakan command => persegi luas,persegi keliling, persegi sisi, persegi diagonal");
                mainMenu();
            case "persegi luas":
                System.out.println("Luas = s * s");
                PersegiL();
                mainMenu();
            case "persegi keliling":
                System.out.println("Keliling = s + s + s + s");
                PersegiK();
                mainMenu();
            case "persegi sisi":
                System.out.println("Sisi = √L");
                PersegiS();
                mainMenu();
            case "persegi diagonal":
                System.out.println("Diagonal = √(s² + s²)");
                PersegiD();
                mainMenu();
            case "persegi panjang":
                System.out.println("Persegi panjang adalah suatu segi empat yang keempat sudutnya siku-siku dan panjang sisi-sisi yang berhadapan sama.");
                mainMenu();
            case "persegi panjang help":
                System.out.println("Hitung menggunakan command => persegi panjang luas,persegi panjang keliling, persegi panjang panjang, persegi panjang lebar, persegi panjang diagonal)");
                mainMenu();
            case "persegi panjang luas":
                System.out.println("Luas (L) = panjang (p) x lebar (l)");
                PersegiPL();
                mainMenu();
            case "persegi panjang keliling":
                System.out.println("keliling = 2(p+l)");
                PersegiPK();
                mainMenu();
            case "persegi panjang panjang":
                System.out.println("Panjang = luas : lebar");
                PersegiPP();
                mainMenu();
            case "persegi panjang lebar":
                System.out.println("lebar = luas : panjang");
                PersegiPl();
                mainMenu();
            case "persegi panjang diagonal":
                System.out.println("Diagonal = √(p² + l²)");
                PersegiPD();
                mainMenu();
            case "jajar genjang":
                System.out.println("Jajar genjang adalah bangun datar dua dimensi yang terdiri dari dua pasang sisi.");
                mainMenu();
            case "jajar genjang help":
                System.out.println("Hitung menggunakan command => jajar genjang luas,jajar genjang keliling, jajar genjang sisi alas, jajar genjang sisi miring");
                mainMenu();
            case "jajar genjang luas":
                System.out.println("Luas = alas x tinggi");
                JajarL();
                mainMenu();
            case "jajar genjang keliling":
                System.out.println("Keliling = 2 x (a+b)");
                JajarK();
                mainMenu();
            case "jajar genjang sisi alas":
                System.out.println("Alas = L : t");
                JajarA();
                mainMenu();
            case "jajar genjang sisi miring":
                System.out.println("Miring = (K : 2) – a");
                JajarM();
                mainMenu();
            case "belah ketupat":
                System.out.println("Belah ketupat adalah bangun datar dua dimensi yang dibentuk oleh empat buah segitiga siku siku masing-masing sama besar dengan sudut di hadapannya.");
                mainMenu();
            case "belah ketupat help":
                System.out.println("Hitung menggunakan command => belah ketupat luas,belah ketupat keliling, belah ketupat sisi, belah ketupat diagonal I, belah ketupat diagonal II)");
                mainMenu();
            case "belah ketupat luas":
                System.out.println("Luas = ½ x diagonal I x diagonal II");
                ketupatL();
                mainMenu();
            case "belah ketupat keliling":
                System.out.println("Keliling = 4 x sisi");
                ketupatK();
                mainMenu();
            case "belah ketupat sisi":
                System.out.println("Sisi = K : 4");
                ketupatS();
                mainMenu();
            case "belah ketupat diagonal 1":
                System.out.println("d1 = (2 x L) : d2");
                ketupatD1();
                mainMenu();
            case "belah diagonal 2":
                System.out.println("d2 = (2 x L) : d1");
                ketupatD2();
                mainMenu();
            case "layang-layang":
                System.out.println("Layang-layang adalah bangun datar yang terbentuk dari gabungan dua segitiga.");
                mainMenu();
            case "layang-layang help":
                System.out.println("Hitung menggunakan command => layang-layang luas,layang-layang keliling, layang-layang diagonal I, layang-layang diagonal II)");
                mainMenu();
            case "layang-layang luas":
                System.out.println("Luas = 1/2 x diagonal 1 x diagonal 2");
                layangL();
                mainMenu();
            case "layang-layang keliling":
                System.out.println("Keliling = sisi I + sisi I + sisi II + sisi II");
                layangK();
                mainMenu();
            case "layang-layang diagonal I":
                System.out.println("d1 = 2 × L ÷ d2");
                layangD1();
                mainMenu();
            case "layang-layang diagonal II":
                System.out.println("d2 = 2 × L ÷ d1");
                layangD2();
                mainMenu();
            case "trapesium":
                System.out.println("trapesium adalah bangun datar yang memiliki 2 pasang sisi yang sejajar tetapi pada 1 pasang sisinya memiliki panjang yang tidak sama atau kedua sisinya tidak sama panjang.");
                mainMenu();
            case "trapesium help":
                System.out.println("Hitung menggunakan command => trapesium luas,trapesium keliling, trapesium diagonal I, trapesium diagonal II");
                mainMenu();
            case "trapesium luas":
                System.out.println("Luas = 1/2 × (a + b) × t");
                trapesiumL();
                mainMenu();
            case "trapesium keliling":
                System.out.println("Keliling = a + b + c + d");
                trapesiumK();
                mainMenu();
            case "trapesium tinggi":
                System.out.println("Tiggi = (2 x L)/a + b");
                trapesiumT();
                mainMenu();
            case "lingkaran":
                System.out.println("Lingkaran adalah bentuk yang terdiri dari semua titik dalam bidang yang berjarak tertentu dari titik tertentu.");
                mainMenu();
            case "lingkaran help":
                System.out.println("Hitung menggunakan command => lingkaran luas,lingkaran keliling, lingkaran jari-jari, lingkaran diameter");
                mainMenu();
            case "lingkaran luas":
                System.out.println("Luas = π × r²");
                lingkaranL();
                mainMenu();
            case "lingkaran keliling":
                System.out.println("Keliling = π x d");
                lingkaranK();
                mainMenu();
            case "lingkaran jari-jari":
                System.out.println("jari-jari = d : 2");
                lingkaranJ();
                mainMenu();
            case "lingkaran diameter":
                System.out.println("Diameter = r x 2");
                lingkaranD();
                mainMenu();
            case "kubus":
                System.out.println("Kubus adalah bangun ruang yang dibatasi oleh enam sisi yang berbentuk persegi.");
                mainMenu();
            case "kubus help":
                System.out.println("Hitung menggunakan command => kubus volume,kubus luas permukaan, kubus sisi rusuk, kubus diagonal sisi, kubus diagonal ruang, kubus luas bidang diagonal ");
                mainMenu();
            case "kubus volume":
                System.out.println("V = s x s x s");
                kubusV();
                mainMenu();
            case "kubus luas permukaan":
                System.out.println(" Luas Permukaan = 6 x s2");
                kubusLP();
                mainMenu();
            case "kubus sisi rusuk":
                System.out.println("sisi rusuk = akar pangkat 3 volume");
                kubusSR();
                mainMenu();
            case "kubus diagonal sisi":
                System.out.println("Diagonal sisi = r = x√2");
                kubusDS();
                mainMenu();
            case "kubus diagonal ruang":
                System.out.println("Diagonal ruang = r = x√3");
                kubusDR();
                mainMenu();
            case "kubus luas bidang diagonal":
                System.out.println("Luas Bidang Diagonal = S x S√2");
                kubusBD();
                mainMenu();
            case "balok":
                System.out.println("Balok adalah bangun ruang tiga dimensi yang dibentuk oleh tiga pasang persegi atau persegi panjang,");
                mainMenu();
            case "balok help":
                System.out.println("Hitung menggunakan command => balok volume,balok luas permukaan,balok panjang,balok lebar,balok tinggi, balok diagonal bidang, balok diagonal ruang, balok luas bidang diagonal ");
                mainMenu();
            case "balok volume":
                System.out.println("Volume =  p × l × t");
                balokV();
                mainMenu();
            case "balok luas permukaan":
                System.out.println("Luas permukaan = 2 × (pl + pt + lt)");
                balokLP();
                mainMenu();
            case "balok panjang":
                System.out.println("panjang = V : (l x t)");
                balokP();
                mainMenu();
            case "balok lebar":
                System.out.println("lebar = V : (p x t)");
                balokL();
                mainMenu();
            case "balok tinggi":
                System.out.println("tinggi = V : (p x l)");
                balokT();
                mainMenu();
            case "balok diagonal bidang":
                System.out.println("diagonal bidang = √(p2 + l2)");
                balokDB();
                mainMenu();
            case "balok diagonal ruang":
                System.out.println("diagonal ruang = √(p2 + l2 + t2)");
                balokDR();
                mainMenu();
            case "balok luas bidang diagonal":
                System.out.println("luas bidang diagonal = √(l² + t²) x p");
                balokLBD();
                mainMenu();
            case "tabung":
                System.out.println("Tabung adalah bangun ruang tiga dimensi yang dibentuk oleh dua buah lingkaran identik yang sejajar dan sebuah persegi panjang yang mengelilingi kedua lingkaran tersebut. Tabung memiliki 3 sisi dan 2 rusuk.");
                mainMenu();
            case "tabung help":
                System.out.println("Hitung menggunakan command => tabung volume,tabung luas permukaan,tabung luas selimut,tabung luas alas,tabung tinggi, tabung jari-jari alas ");
                mainMenu();
            case "tabung volume":
                System.out.println("volume = πr²t");
                tabungV();
                mainMenu();
            case "tabung luas permukaan":
                System.out.println("Luas Permukaan = 2 x π x r x (r + t)");
                tabungLP();
                mainMenu();
            case "tabung luas selimut":
                System.out.println("Luas selimut = 2 πr t");
                tabungLS();
                mainMenu();
            case "tabung luas alas":
                System.out.println("volume = π × r2");
                tabungLA();
                mainMenu();
            case "tabung tinggi":
                System.out.println("Tinggi = LP : 2 x π x r - r");
                tabungT();
                mainMenu();
            case "tabung jari-jari alas":
                System.out.println("jari-jari  = √V : (π x t)");
                tabungJA();
                mainMenu();
            case "bola":
                System.out.println("Bola adalah bangun ruang dengan bentuk bulat sempurna yang tersusun oleh tidak terhingga lingkaran yang mempunyai jari-jari dan pusat lingkaran yang sama.");
                mainMenu();
            case "bola help":
                System.out.println("Hitung menggunakan command => bola volume,bola luas permukaan,bola jari-jari");
                mainMenu();
            case "bola volume":
                System.out.println("Volume =  4/3 × π × r³");
                bolaV();
                mainMenu();
            case "bola luas permukaan":
                System.out.println("Luas permukaan = 4 × π × r²");
                bolaLP();
                mainMenu();
            case "bola jari-jari":
                System.out.println("jari-jari (r) = d÷2");
                bolaR();
                mainMenu();
            default:
                System.out.println("silahkan input => help , untuk Memunculkan list bangun datar dan bangun luas yang tersedia di project ");
                mainMenu();

        }

    }
    //bola
    private static void bolaV() {
        Bola b;
        double r;
        char coba;

        b = new Bola();

        do {
            System.out.print("\nMasukan jari-jari Bola: ");
            r = scanner.nextDouble();
            System.out.println("Volume Bola: " + roundingMode(b.volume(r)));
            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');
        mainMenu();
    }
    private static void bolaLP() {
        Bola b;
        double r;
        char coba;

        b = new Bola();

        do {
            System.out.print("\nMasukan jari-jari Bola: ");
            r = scanner.nextDouble();
            System.out.println("Luas Permukaan Bola: " + roundingMode(b.luas(r)));
            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');
        mainMenu();
    }
    private static void bolaR() {
        Bola b;
        double d;
        char coba;

        b = new Bola();

        do {
            System.out.print("\nMasukan Diameter Bola: ");
            d = scanner.nextDouble();
            System.out.println("Jari-jari Bola: " + roundingMode(b.jari(d)));
            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');
        mainMenu();
    }
    //bola
    //Tabung
    private static void tabungV() {
        Tabung tbg;
        double r, t;
        char coba;

        tbg = new Tabung();

        do {
            System.out.print("\nMasukan jari-jari tabung: ");
            r = scanner.nextDouble();
            System.out.print("\nMasukan tinggi tabung: ");
            t = scanner.nextDouble();
            System.out.println("Volume Tabung: " + roundingMode(tbg.volume(r, t)));
            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');
        mainMenu();
    }
    private static void tabungLP() {
        Tabung tbg;
        double r, t;
        char coba;

        tbg = new Tabung();

        do {
            System.out.print("\nMasukan jari-jari tabung: ");
            r = scanner.nextDouble();
            System.out.print("\nMasukan tinggi tabung: ");
            t = scanner.nextDouble();
            System.out.println("Luas Permukaan Tabung: " + roundingMode(tbg.luasPermukaan(r, t)));
            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');
        mainMenu();
    }
    private static void tabungLS() {
        Tabung tbg;
        double r, t;
        char coba;

        tbg = new Tabung();

        do {
            System.out.print("\nMasukan jari-jari tabung: ");
            r = scanner.nextDouble();
            System.out.print("\nMasukan tinggi tabung: ");
            t = scanner.nextDouble();
            System.out.println("Luas Selimut Tabung: " + roundingMode(tbg.luasSelimut(r, t)));
            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');
        mainMenu();
    }
    private static void tabungLA() {
        Tabung tbg;
        double r;
        char coba;

        tbg = new Tabung();

        do {
            System.out.print("\nMasukan jari-jari tabung: ");
            r = scanner.nextDouble();
            System.out.println("Luas Alas Tabung: " + roundingMode(tbg.luasAlas(r)));
            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');
        mainMenu();
    }
    private static void tabungT() {
        Tabung tbg;
        double LP, r;
        char coba;

        tbg = new Tabung();

        do {
            System.out.print("\nMasukan Luas Permukaan tabung: ");
            LP = scanner.nextDouble();
            System.out.print("\nMasukan jari-jari tabung: ");
            r = scanner.nextDouble();
            System.out.println("Luas tinggi Tabung: " + roundingMode(tbg.tinggi(LP, r)));
            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');
        mainMenu();
    }
    private static void tabungJA() {
        Tabung tbg;
        double V, t;
        char coba;

        tbg = new Tabung();

        do {
            System.out.print("\nMasukan volume tabung: ");
            V = scanner.nextDouble();
            System.out.print("\nMasukan tinggi tabung: ");
            t = scanner.nextDouble();
            System.out.println("Jari-jari alas Tabung: " + roundingMode(tbg.jariAlas(V ,t)));
            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');
        mainMenu();
    }

    //Tabung
    // balok
    private static void balokV() {
        Balok blk;
        double l, t, p ;
        char coba;

        blk = new Balok();

        do {
            System.out.print("\nMasukan panjang balok: ");
            p = scanner.nextDouble();
            System.out.print("\nMasukan lebar balok: ");
            l = scanner.nextDouble();
            System.out.print("\nMasukan tinggi balok: ");
            t = scanner.nextDouble();
            System.out.println("Volume balok: " + roundingMode(blk.volume(p, l, t)));
            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');
        mainMenu();
    }
    private static void balokLP() {
        Balok blk;
        double l, t, p ;
        char coba;

        blk = new Balok();

        do {
            System.out.print("\nMasukan panjang balok: ");
            p = scanner.nextDouble();
            System.out.print("\nMasukan lebar balok: ");
            l = scanner.nextDouble();
            System.out.print("\nMasukan tinggi balok: ");
            t = scanner.nextDouble();
            System.out.println("Luas Permukaan balok: " + roundingMode(blk.luasPermukaan(p, l, t)));
            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');
        mainMenu();
    }
    private static void balokP() {
        Balok blk;
        double v, l, t ;
        char coba;

        blk = new Balok();

        do {
            System.out.print("\nMasukan volume balok: ");
            v = scanner.nextDouble();
            System.out.print("\nMasukan lebar balok: ");
            l = scanner.nextDouble();
            System.out.print("\nMasukan tinggi balok: ");
            t = scanner.nextDouble();
            System.out.println("Panjang balok: " + roundingMode(blk.panjang(v, l, t)));
            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');
        mainMenu();
    }
    private static void balokL() {
        Balok blk;
        double v, t, p ;
        char coba;

        blk = new Balok();

        do {
            System.out.print("\nMasukan volume balok: ");
            v = scanner.nextDouble();
            System.out.print("\nMasukan panjang balok: ");
            p = scanner.nextDouble();
            System.out.print("\nMasukan tinggi balok: ");
            t = scanner.nextDouble();
            System.out.println("Lebar: " + roundingMode(blk.lebar(v, p, t)));
            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');
        mainMenu();
    }
    private static void balokT() {
        Balok blk;
        double l, v, p ;
        char coba;

        blk = new Balok();

        do {
            System.out.print("\nMasukan volume balok: ");
            v = scanner.nextDouble();
            System.out.print("\nMasukan lebar balok: ");
            l = scanner.nextDouble();
            System.out.print("\nMasukan panjang balok: ");
            p = scanner.nextDouble();
            System.out.println("Tinggi balok: " + roundingMode(blk.tinggi(v, l, p)));
            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');
        mainMenu();
    }
    private static void balokDB() {
        Balok blk;
        double l, p ;
        char coba;

        blk = new Balok();

        do {
            System.out.print("\nMasukan panjang balok: ");
            p = scanner.nextDouble();
            System.out.print("\nMasukan lebar balok: ");
            l = scanner.nextDouble();
            System.out.println("Diagonal Bidang balok: " + roundingMode(blk.diagonalBidang(p, l)));
            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');
        mainMenu();
    }
    private static void balokDR() {
        Balok blk;
        double l, t, p ;
        char coba;

        blk = new Balok();

        do {
            System.out.print("\nMasukan panjang balok: ");
            p = scanner.nextDouble();
            System.out.print("\nMasukan lebar balok: ");
            l = scanner.nextDouble();
            System.out.print("\nMasukan tinggi balok: ");
            t = scanner.nextDouble();
            System.out.println("Diagonal Ruang Balok: " + roundingMode(blk.diagonalRuang(p, l, t)));
            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');
        mainMenu();
    }
    private static void balokLBD() {
        Balok blk;
        double l, t, p ;
        char coba;

        blk = new Balok();

        do {
            System.out.print("\nMasukan panjang balok: ");
            p = scanner.nextDouble();
            System.out.print("\nMasukan lebar balok: ");
            l = scanner.nextDouble();
            System.out.print("\nMasukan tinggi balok: ");
            t = scanner.nextDouble();
            System.out.println("Luas Bidang Diagonal balok: " + roundingMode(blk.luasBidangDiagonal(p, l, t)));
            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');
        mainMenu();
    }

    // balok
    //kubus
    private static void kubusV() {
        Kubus kbs;
        double s1;
        char coba;

        kbs = new Kubus();

        do {
            System.out.print("\nMasukan sisi kubus: ");
            s1 = scanner.nextDouble();
            System.out.println("Volume kubus: " + roundingMode(kbs.volume(s1)));
            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');
        mainMenu();
    }
    private static void kubusLP() {
        Kubus kbs;
        double s1;
        char coba;

        kbs = new Kubus();

        do {
            System.out.print("\nMasukan sisi kubus: ");
            s1 = scanner.nextDouble();
            System.out.println("luas permukaan kubus: " + roundingMode(kbs.luasPermukaan(s1)));
            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');
        mainMenu();
    }
    private static void kubusSR() {
        Kubus kbs;
        double s1;
        char coba;

        kbs = new Kubus();

        do {
            System.out.print("\nMasukan Volume kubus: ");
            s1 = scanner.nextDouble();
            System.out.println("Sisi rusuk kubus: " + roundingMode(kbs.sisiRusuk(s1)));
            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');
        mainMenu();
    }
    private static void kubusDS() {
        Kubus kbs;
        double s1;
        char coba;

        kbs = new Kubus();

        do {
            System.out.print("\nMasukan panjang rusuk kubus: ");
            s1 = scanner.nextDouble();
            System.out.println("Diagonal sisi kubus: " + roundingMode(kbs.diagonalSisi(s1)) + "√2");
            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');
        mainMenu();
    }
    private static void kubusDR() {
        Kubus kbs;
        double s1;
        char coba;

        kbs = new Kubus();

        do {
            System.out.print("\nMasukan panjang rusuk kubus: ");
            s1 = scanner.nextDouble();
            System.out.println("diagonal ruang kubus: " + roundingMode(kbs.diagonalRuang(s1)) + "√3");
            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');
        mainMenu();
    }
    private static void kubusBD() {
        Kubus kbs;
        double s1;
        char coba;

        kbs = new Kubus();

        do {
            System.out.print("\nMasukan sisi kubus: ");
            s1 = scanner.nextDouble();
            System.out.println("Bidang diagonal kubus: " + roundingMode(kbs.bidangDiagonal(s1)) + "√2");
            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');
        mainMenu();
    }
    //kubus
    //lingkaran
    private static void lingkaranL() {
        Lingkaran lngkrn;
        double s1;
        char coba;

        lngkrn = new Lingkaran();

        do {
            System.out.print("\nMasukan jari-jari lingkaran: ");
            s1 = scanner.nextDouble();
            System.out.println("Luas lingkaran: " + roundingMode(lngkrn.luas(s1)));
            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');
        mainMenu();
    }
    private static void lingkaranK() {
        Lingkaran lngkrn;
        double s1;
        char coba;

        lngkrn = new Lingkaran();

        do {
            System.out.print("\nMasukan diameter lingkaran: ");
            s1 = scanner.nextDouble();
            System.out.println("keliling lingkaran: " + roundingMode(lngkrn.keliling(s1)));
            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');
        mainMenu();
    }
    private static void lingkaranD() {
        Lingkaran lngkrn;
        double s1;
        char coba;

        lngkrn = new Lingkaran();

        do {
            System.out.print("\nMasukan jari-jari lingkaran: ");
            s1 = scanner.nextDouble();
            System.out.println("diameter lingkaran: " + roundingMode(lngkrn.diameter(s1)));
            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');
        mainMenu();
    }
    private static void lingkaranJ() {
        Lingkaran lngkrn;
        double s1;
        char coba;

        lngkrn = new Lingkaran();

        do {
            System.out.print("\nMasukan Diameter lingkaran: ");
            s1 = scanner.nextDouble();
            System.out.println("jari-jari lingkaran: " + roundingMode(lngkrn.jarijari(s1)));
            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');
        mainMenu();
    }
    //lingkaran
    //trapesium
    private static void trapesiumL() {
        Trapesium trpsium;
        double s1, s2, s3;
        char coba;

        trpsium = new Trapesium();

        do {
            System.out.print("\nMasukan sisi atas trapesium: ");
            s1 = scanner.nextDouble();
            System.out.print("Masukan sisi bawah trapesium: ");
            s2 = scanner.nextDouble();
            System.out.print("Masukan tinggi trapesium ");
            s3 = scanner.nextDouble();
            System.out.println("Luas trapesium: " + roundingMode(trpsium.luas(s1, s2, s3)));
            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');
        mainMenu();
    }
    private static void trapesiumK() {
        Trapesium trpsium;
        double s1, s2, s3, s4;
        char coba;

        trpsium = new Trapesium();

        do {
            System.out.print("\nMasukan panjang sisi A trapesium: ");
            s1 = scanner.nextDouble();
            System.out.print("Masukan panjang sisi B trapesium: ");
            s2 = scanner.nextDouble();
            System.out.print("Masukan panjang sisi C trapesium:");
            s3 = scanner.nextDouble();
            System.out.print("Masukan panjang sisi D trapesium:");
            s4 = scanner.nextDouble();
            System.out.println("Keliling trapesium: " + roundingMode(trpsium.keliling(s1, s2, s3, s4)));
            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');
        mainMenu();
    }
    private static void trapesiumT() {
        Trapesium trpsium;
        double a, b, s;
        char coba;

        trpsium = new Trapesium();

        do {
            System.out.print("\nMasukan sisi sejajar a trapesium: ");
            a = scanner.nextDouble();
            System.out.print("Masukan sisi sejajar b trapesium: ");
            b = scanner.nextDouble();
            System.out.print("Masukan sisi miring trapesium: ");
            s = scanner.nextDouble();
            System.out.println("Tinggi trapesium: " + roundingMode(trpsium.tinggi(a, b, s)));
            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');
        mainMenu();
    }
    //trapesium
    //layang-layang
    private static void layangL() {
        LayangLayang lyglyg;
        double s1, s2;
        char coba;

        lyglyg = new LayangLayang();

        do {
            System.out.print("\nMasukan diagonal I layang-layang: ");
            s1 = scanner.nextDouble();
            System.out.print("Masukan diagonal II layang-layang: ");
            s2 = scanner.nextDouble();
            System.out.println("Luas layang-layang: " + roundingMode(lyglyg.luas(s1, s2)));
            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');
        mainMenu();
    }
    private static void layangK() {
        LayangLayang lyglyg;
        double s1, s2;
        char coba;

        lyglyg = new LayangLayang();

        do {
            System.out.print("\nMasukan sisi I layang-layang: ");
            s1 = scanner.nextDouble();
            System.out.print("Masukan sisi II layang-layang: ");
            s2 = scanner.nextDouble();
            System.out.println("keliling layang-layang: " + roundingMode(lyglyg.keliling(s1, s2)));
            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');
        mainMenu();
    }
    private static void layangD1() {
        LayangLayang lyglyg;
        double s1, s2;
        char coba;

        lyglyg = new LayangLayang();

        do {
            System.out.print("\nMasukan Luas layang-layang: ");
            s1 = scanner.nextDouble();
            System.out.print("Masukan diagonal II layang-layang: ");
            s2 = scanner.nextDouble();
            System.out.println("diagonal I layang-layang: " + roundingMode(lyglyg.d1(s1, s2)));
            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');
        mainMenu();
    }
    private static void layangD2() {
        LayangLayang lyglyg;
        double s1, s2;
        char coba;

        lyglyg = new LayangLayang();

        do {
            System.out.print("\nMasukan Luas layang-layang: ");
            s1 = scanner.nextDouble();
            System.out.print("Masukan diagonal I layang-layang: ");
            s2 = scanner.nextDouble();
            System.out.println("diagonal II layang-layang: " + roundingMode(lyglyg.d2(s1, s2)));
            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');
        mainMenu();
    }
    //layang-layang
    // belah ketupat
    private static void ketupatL() {
        BelahKetupat blhktpt;
        double s1, s2;
        char coba;

        blhktpt = new BelahKetupat();

        do {
            System.out.print("\nMasukan diagonal I belah ketupat: ");
            s1 = scanner.nextDouble();
            System.out.print("Masukan diagonal II belah ketupat: ");
            s2 = scanner.nextDouble();
            System.out.println("Luas belah ketupat: " + roundingMode(blhktpt.luas(s1, s2)));
            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');
        mainMenu();
    }
    private static void ketupatK() {
        BelahKetupat blhktpt;
        double s1;
        char coba;

        blhktpt = new BelahKetupat();

        do {
            System.out.print("\nMasukan sisi belah ketupat: ");
            s1 = scanner.nextDouble();
            System.out.println("Keliling belah ketupat: " + roundingMode(blhktpt.keliling(s1)));
            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');
        mainMenu();
    }
    private static void ketupatS() {
        BelahKetupat blhktpt;
        double s1;
        char coba;

        blhktpt = new BelahKetupat();

        do {
            System.out.print("\nMasukan keliling belah ketupat: ");
            s1 = scanner.nextDouble();
            System.out.println("Sisi belah ketupat: " + roundingMode(blhktpt.sisi(s1)));
            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');
        mainMenu();
    }
    private static void ketupatD1() {
        BelahKetupat blhktpt;
        double s1, s2;
        char coba;

        blhktpt = new BelahKetupat();

        do {
            System.out.print("\nMasukan Luas belah ketupat: ");
            s1 = scanner.nextDouble();
            System.out.print("Masukan Diagonal II belah ketupat: ");
            s2 = scanner.nextDouble();
            System.out.println("Diagonal I belah ketupat: " + roundingMode(blhktpt.d1(s1, s2)));
            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');
        mainMenu();
    }
    private static void ketupatD2() {
        BelahKetupat blhktpt;
        double s1, s2;
        char coba;

        blhktpt = new BelahKetupat();

        do {
            System.out.print("\nMasukan Luas belah ketupat: ");
            s1 = scanner.nextDouble();
            System.out.print("Masukan diagonal I belah ketupat: ");
            s2 = scanner.nextDouble();
            System.out.println("Diagonal II belah ketupat: " + roundingMode(blhktpt.d2(s1, s2)));
            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');
        mainMenu();
    }
    // belah ketupat
    // jajar genjang
    private static void JajarL() {
        JajarGenjang jjrgnjng;
        double s1, s2;
        char coba;

        jjrgnjng = new JajarGenjang();

        do {
            System.out.print("\nMasukan alas jajar genjang: ");
            s1 = scanner.nextDouble();
            System.out.print("Masukan tinggi jajar genjang: ");
            s2 = scanner.nextDouble();
            System.out.println("Luas jajar genjang: " + roundingMode(jjrgnjng.luas(s1, s2)));
            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');
        mainMenu();
    }
    private static void JajarK() {
        JajarGenjang jjrgnjng;
        double s1, s2;
        char coba;

        jjrgnjng = new JajarGenjang();

        do {
            System.out.print("\nMasukan sisi alas jajar genjang: ");
            s1 = scanner.nextDouble();
            System.out.print("Masukan sisi miring jajar genjang: ");
            s2 = scanner.nextDouble();
            System.out.println("Keliling jajar genjang: " + roundingMode(jjrgnjng.keliling(s1, s2)));
            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');
        mainMenu();
    }
    private static void JajarA() {
        JajarGenjang jjrgnjng;
        double s1, s2;
        char coba;

        jjrgnjng = new JajarGenjang();

        do {
            System.out.print("\nMasukan Luas jajar genjang: ");
            s1 = scanner.nextDouble();
            System.out.print("Masukan tinggi jajar genjang: ");
            s2 = scanner.nextDouble();
            System.out.println("Alas jajar genjang: " + roundingMode(jjrgnjng.alas(s1, s2)));
            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');
        mainMenu();
    }
    private static void JajarM() {
        JajarGenjang jjrgnjng;
        double s1, s2;
        char coba;

        jjrgnjng = new JajarGenjang();

        do {
            System.out.print("\nMasukan Keliling jajar genjang: ");
            s1 = scanner.nextDouble();
            System.out.print("Masukan Alas jajar genjang: ");
            s2 = scanner.nextDouble();
            System.out.println("Sisi Miring jajar genjang: " + roundingMode(jjrgnjng.miring(s1, s2)));
            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');
        mainMenu();
    }
    // jajar genjang
    // segitiga
    private static void SegitigaL() {
        Segitiga sgtg;
        double s1, s2;
        char coba;

        sgtg = new Segitiga();

        do {
            System.out.print("\nMasukan alas segitiga: ");
            s1 = scanner.nextDouble();
            System.out.print("Masukan tinggi segitiga: ");
            s2 = scanner.nextDouble();
            System.out.println("Luas segitiga: " + roundingMode(sgtg.luas(s1, s2)));
            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');
        mainMenu();
    }

    private static void SegitigaK() {
        Segitiga sgtg;
        double s1, s2, s3;
        char coba;

        sgtg = new Segitiga();

        do {
            System.out.print("\nMasukan sisi A segitiga: ");
            s1 = scanner.nextDouble();
            System.out.print("\nMasukan sisi B segitiga: ");
            s2 = scanner.nextDouble();
            System.out.print("\nMasukan sisi C segitiga: ");
            s3 = scanner.nextDouble();
            System.out.println("Keliling segitiga: " + roundingMode(sgtg.keliling(s1, s2, s3)));
            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');
        mainMenu();
    }

    private static void SegitigaT() {
        Segitiga sgtg;
        double s1, s2;
        char coba;

        sgtg = new Segitiga();

        do {
            System.out.print("\nMasukan luas segitiga: ");
            s1 = scanner.nextDouble();
            System.out.print("Masukan alas segitiga: ");
            s2 = scanner.nextDouble();
            System.out.println("Tinggi segitiga: " + roundingMode(sgtg.tinggi(s1, s2)));
            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');
        mainMenu();
    }

    private static void SegitigaA() {
        Segitiga sgtg;
        double s1, s2;
        char coba;

        sgtg = new Segitiga();

        do {
            System.out.print("\nMasukan luas segitiga: ");
            s1 = scanner.nextDouble();
            System.out.print("Masukan tinggi segitiga: ");
            s2 = scanner.nextDouble();
            System.out.println("Alas segitiga: " + roundingMode(sgtg.alas(s1, s2)));
            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');
        mainMenu();
    }
    // segitiga

    //persegi
    private static void PersegiL() {
        Persegi prsg;
        double s1;
        char coba;

        prsg = new Persegi();

        do {
            System.out.print("\nMasukan sisi persegi: ");
            s1 = scanner.nextDouble();
            System.out.println("Luas persegi: " + roundingMode(prsg.luas(s1)));
            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');
        mainMenu();
    }
    private static void PersegiK() {
        Persegi prsg;
        double s1;
        char coba;

        prsg = new Persegi();

        do {
            System.out.print("\nMasukan sisi persegi: ");
            s1 = scanner.nextDouble();
            System.out.println("Keliling persegi: " + roundingMode(prsg.keliling(s1)));
            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');
        mainMenu();
    }
    private static void PersegiS() {
        Persegi prsg;
        double s1;
        char coba;

        prsg = new Persegi();

        do {
            System.out.print("\nMasukan luas persegi: ");
            s1 = scanner.nextDouble();
            System.out.println("Sisi persegi: " + roundingMode(prsg.sisi(s1)));
            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');
        mainMenu();
    }
    private static void PersegiD() {
        Persegi prsg;
        double s1;
        char coba;

        prsg = new Persegi();

        do {
            System.out.print("\nMasukan sisi persegi: ");
            s1 = scanner.nextDouble();
            System.out.println("Diagonal persegi: " + roundingMode(prsg.diagonal(s1)));
            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');
        mainMenu();
    }
    //persegi

    //persegi panjang
    private static void PersegiPL() {
        PersegiPanjang prsgpjg;
        double s1, s2;
        char coba;

        prsgpjg = new PersegiPanjang();

        do {
            System.out.print("\nMasukan Panjang persegi panjang: ");
            s1 = scanner.nextDouble();
            System.out.print("\nMasukan Lebar persegi panjang: ");
            s2 = scanner.nextDouble();
            System.out.println("Luas persegi panjang: " + roundingMode(prsgpjg.luas(s1,s2)));
            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');
        mainMenu();
    }
    private static void PersegiPK() {
        PersegiPanjang prsgpjg;
        double s1, s2;
        char coba;

        prsgpjg = new PersegiPanjang();

        do {
            System.out.print("\nMasukan Panjang persegi panjang: ");
            s1 = scanner.nextDouble();
            System.out.print("\nMasukan Lebar persegi panjang: ");
            s2 = scanner.nextDouble();
            System.out.println("Keliling persegi panjang: " + roundingMode(prsgpjg.keliling(s1,s2)));
            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');
        mainMenu();
    }
    private static void PersegiPP() {
        PersegiPanjang prsgpjg;
        double s1, s2;
        char coba;

        prsgpjg = new PersegiPanjang();

        do {
            System.out.print("\nMasukan Luas persegi panjang: ");
            s1 = scanner.nextDouble();
            System.out.print("\nMasukan Lebar persegi panjang: ");
            s2 = scanner.nextDouble();
            System.out.println("Panjang persegi panjang: " + roundingMode(prsgpjg.panjang(s1,s2)));
            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');
        mainMenu();
    }
    private static void PersegiPl() {
        PersegiPanjang prsgpjg;
        double s1, s2;
        char coba;

        prsgpjg = new PersegiPanjang();

        do {
            System.out.print("\nMasukan Luas persegi panjang: ");
            s1 = scanner.nextDouble();
            System.out.print("\nMasukan Panjang persegi panjang: ");
            s2 = scanner.nextDouble();
            System.out.println("Lebar persegi panjang: " + roundingMode(prsgpjg.lebar(s1,s2)));
            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');
        mainMenu();
    }
    private static void PersegiPD() {
        PersegiPanjang prsgpjg;
        double s1, s2;
        char coba;

        prsgpjg = new PersegiPanjang();

        do {
            System.out.print("\nMasukan Panjang persegi panjang: ");
            s1 = scanner.nextDouble();
            System.out.print("\nMasukan Lebar persegi panjang: ");
            s2 = scanner.nextDouble();
            System.out.println("Diagonal persegi panjang: " + roundingMode(prsgpjg.diagonal(s1,s2)));
            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');
        mainMenu();
    }
    //persegi panjang
    private static String roundingMode(double number) {
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);
        return df.format(number);
    }

}