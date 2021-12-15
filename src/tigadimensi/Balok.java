package tigadimensi;
import duadimensi.PersegiPanjang;

public class Balok extends PersegiPanjang{
    Double tinggi;
    
    
    public Balok(Double inputPanjang, Double inputLebar, Double inputTinggi) {
        super(inputPanjang, inputLebar);
        this.tinggi = inputTinggi;
        //TODO Auto-generated constructor stub
    }

    public Double volume(){
        return super.luas() * tinggi;
    }


    

}
