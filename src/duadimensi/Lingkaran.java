package duadimensi;

public class Lingkaran {
    protected Double jari;
    final Double phi = 3.14;

    public Lingkaran(Double jari) {
        this.jari = jari;
    }

    public Double luas() {
        return  jari * jari * phi;
    }
}
