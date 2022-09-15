public class Main {
    public static void main(String[] args) {
        String ogrenci1 = "Ebubekir";
        String ogrenci2 = "Doğan";
        String ogrenci3 = "Salih";
        String ogrenci4 = "Selim";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("--------------------");

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Ebubekir";
        ogrenciler[1] = "Doğan";
        ogrenciler[2] = "Salih";
        ogrenciler[3] = "Selim";
        // ogrenciler[4] = "Mehmet";

        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }
        System.out.println("---------------");

        for (String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }
    }
}