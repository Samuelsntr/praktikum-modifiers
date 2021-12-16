package tigadimensi;

import duadimensi.Segitiga;

public class Limas extends Segitiga{
    
    public Limas(Double inputAlas, Double inputTinggi){
        super(inputAlas, inputTinggi);
    }

    public Double volume(){
        return 0.3 * super.luas();
    }
}
