public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel";
        String yeniMesaj = mesaj.substring(0,2);// baslangıc dahil bitis dahil degildir.
        String deger = sehirVer();
        System.out.println(yeniMesaj);
        int sayi = topla(15,7);
        System.out.println(sayi);
        int toplam = topla(1,2,3,3,4,4,65);
        System.out.println(toplam);

    }
    
    public static void ekle(){
        System.out.println("Eklendi");
    }
    public static void sil(){
        System.out.println("Silindi");
    }
    
    public static void guncelle(){
       System.out.println("Güncellendi");
    }
    public static int topla(int s1,int s2){
        
        return s1+s2;
    }
    public static int topla(int... sayilar){ // ... variables arguments denir buna
        int toplam = 0;
        
        for(int sayi : sayilar){
            toplam += sayi;
        }
        return toplam;
    }
    public static String sehirVer(){
        return "Ankara";
    } 
}