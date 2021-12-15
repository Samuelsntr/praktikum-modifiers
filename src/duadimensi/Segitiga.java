package duadimensi;

public class Segitiga extends Persegi {
    Double tinggi;

    protected Segitiga(Double sisi, Double tinggi) {
        super(sisi);
        this.tinggi = tinggi;
    }

    @Override
    public Double luas() {
        return (lebar * tinggi) / 2;
    }
}
