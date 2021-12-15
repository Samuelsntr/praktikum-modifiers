import javax.xml.crypto.dsig.spec.TransformParameterSpec;

import duadimensi.BelahKetupat;
import duadimensi.JajarGenjang;
import duadimensi.Lingkaran;
import duadimensi.Persegi;
import duadimensi.Trapesium;
import tigadimensi.Balok;
import tigadimensi.Kerucut;
import tigadimensi.PrismaSegitiga;
import tigadimensi.Tabung;
public class App {
    public static void main(String[] args) throws Exception {
    // Persegi pertama = new Persegi(10.0);
    // System.out.println("Luasnya adalah: "+ pertama.luas()); 
    // Lingkaran kedua = new Lingkaran(2.5);
    // System.out.println(kedua.luas()); 

    // JajarGenjang rumus1 = new JajarGenjang(5.0, 5.0);
    // System.out.println(rumus1.Luas());

    // BelahKetupat rumus2 = new BelahKetupat(10.0, 5.0);
    // // System.out.println(rumus2.luas());
    // Trapesium rumus3 = new Trapesium(2.0, 3.0, 4.0);
    // System.out.println(rumus3.luas());
    // System.out.println(pertama.luas());

    // Kerucut rumus4 = new Kerucut(2.0, 2.0);
    // System.out.println(rumus4.volume());

    PrismaSegitiga rumus5 = new PrismaSegitiga(2.0, 2.0, 2.0);
    System.out.println(rumus5.volume());

    // Balok rumus5 = new Balok(2.0, 2.0, 2.0);
    // System.out.println(rumus5.volume());
}
    
}
