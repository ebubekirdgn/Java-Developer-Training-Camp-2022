public class OgrenciKrediManager  extends BaseKrediManager{

    //override edilmesini istemiyorsak base sınıfı final olarak işaretlendiririz.
    // Bu durumda override olan yerler patlar.
    public double hesapla(double tutar ){
        return  tutar * 0.18;
    }
}
