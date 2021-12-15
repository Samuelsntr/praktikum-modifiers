package tigadimensi;

import duadimensi.Segitiga;

public class PrismaSegitiga extends Segitiga {
    Double tp;


    public PrismaSegitiga(Double inputAlas, Double inputTinggi, Double inputTinggiPrisma){
    super(inputAlas, inputTinggi);
    this.tp = inputTinggiPrisma;
    }

    public Double volume(){
        return super.luas() * tp;
    }
}
