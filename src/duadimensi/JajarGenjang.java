package duadimensi;

public class JajarGenjang {
    Double a;
    Double t;

    public JajarGenjang(Double inputAlas, Double inputTinggi) {
        this.a = inputAlas;
        this.t = inputTinggi;
    }

    public Double Luas(){
        return a * t;
    }
}
