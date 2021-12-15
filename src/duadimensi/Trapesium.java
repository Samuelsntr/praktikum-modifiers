package duadimensi;

public class Trapesium {
    Double a;
    Double b;
    Double t;

    public Trapesium(Double inputA, Double inputB, Double inputTinggi){
        this.a = inputA;
        this.b = inputB;
        this.t = inputTinggi;
    }

    public Double luas(){
        return 0.5 * (a + b) * t;
    }
}
