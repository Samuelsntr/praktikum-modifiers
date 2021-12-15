package tigadimensi;
import duadimensi.Lingkaran;

public class Kerucut extends Lingkaran {
    // Rumus V = 0.3 * phi * r * r * t
    // Double sepertiga = 0.3;
    // Double r;
    Double tinggi;

    public Kerucut(Double jari, Double inputTinggi) {
        super(jari);
        this.tinggi = inputTinggi;
    }

    public Double volume() {
        return 0.3 * super.luas() * tinggi;
    }
}


// package tigadimensi;

// import duadimensi.Lingkaran;

// public class Kerucut{
//     //     // Rumus V = 0.3 * phi * r * r * t
//     Double phi = 3.14;
//     Double jari;
//     Double t;

//     public Kerucut(Double inputJari, Double inputTinggi){
//         this.jari = inputJari;
//         this.t = inputTinggi;
//     }

//     public Double volume(){
//         return 0.3 * phi * jari * jari * t;
//     }

// }