public class Main {
    public static void main(String[] args) {
        sayiBulmaca();
    }
    
    public static void sayiBulmaca(){
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 3;
        boolean listedeVarMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                listedeVarMi = true;
                break;
            }
        }

        if (listedeVarMi) {
           mesajVer(aranacak + " sayısı listede var.");
        } else {
           mesajVer(aranacak + " sayısı listede bulunamadı.");
        }
    }
    
      public static void mesajVer(String mesaj){
          System.out.println(mesaj);
      }
}