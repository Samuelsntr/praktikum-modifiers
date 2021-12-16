package tigadimensi;
import duadimensi.Persegi;

public class Kubus extends Persegi{
    
    public Kubus(Double sisi){
        super(sisi);
    }

    Double volume(){
        return super.luas() * lebar;
    }
}
