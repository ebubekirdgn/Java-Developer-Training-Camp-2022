public class Main {
    public static void main(String[] args) {
         WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.hesapla();
        womanGameCalculator.gameOver();
        /*HATALI VE UYGUN KULLANIM DEGİLDİR. ABSTRACTLAR NEWLENEMEZLER
        GameCalculator gameCalculator = new GameCalculator() {
            @Override
            public void hesapla() {

            }
        }*/

        GameCalculator gameCalculator = new WomanGameCalculator();
        womanGameCalculator.hesapla();
    }
}
//ABSTRACTLAR CLASSLARA GORE :
//NEWLENEMEZ
//ZORUNLU İCİ DOLDURULMASI GEREKEN VEYA HERKESİN KENDİNE GÖRE AYRI AYRI DOLDURULMASI GEREKEN OPERASYONLAR TANIMLAMAMIZI SAĞLAR.