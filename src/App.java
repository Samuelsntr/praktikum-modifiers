import javax.xml.crypto.dsig.spec.TransformParameterSpec;

import duadimensi.BelahKetupat;
import duadimensi.JajarGenjang;
import duadimensi.Lingkaran;
import duadimensi.Persegi;
import duadimensi.Trapesium;
import tigadimensi.Balok;
import tigadimensi.Kerucut;
import tigadimensi.Kubus;
import tigadimensi.Limas;
import tigadimensi.PrismaSegitiga;
import tigadimensi.Tabung;
public class App {
    public static void main(String[] args) throws Exception {

        // Menghitung luas matematika dua dimensi
        BelahKetupat belahketupat = new BelahKetupat(5.0, 2.0);
        System.out.println(belahketupat.luas());

        JajarGenjang jajargenjang = new JajarGenjang(7.0, 10.0);
        System.out.println(jajargenjang.Luas());

        Trapesium trapesium = new Trapesium(5.0, 2.0, 7.0);
        System.out.println(trapesium.luas());

        // Menghitung volume matematika tiga dimensi
        Balok balok = new Balok(5.0, 2.0, 5.0);
        System.out.println(balok.volume());

        Kerucut kerucut = new Kerucut(5.0, 10.0);
        System.out.println(kerucut.volume());

        Limas limas = new Limas(10.0, 10.0);
        System.out.println(limas.volume());

        PrismaSegitiga prisma = new PrismaSegitiga(2.0, 10.0, 15.0);
        System.out.println(prisma.volume());

}
    
}
