﻿public class Main {
    public static void main(String[] args) {
	
	//classler referans tiplidir.
     CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager2 = new CustomerManager();
        customerManager = customerManager2; //bu durumda customerManager'ın heap alanı GB temizler
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();
 
      int sayi1=10;
      int sayi2 = 20;
      sayi2 = sayi1;
      sayi1 =30;
      System.out.println(sayi2);
      
      int[] sayilar1 = new int[]{1,2,3};
      int[] sayilar2 = new int[]{4,5,6};
      
     sayilar2 = sayilar1;
     sayilar1[0] = 20;
     System.out.println(sayilar2[0]);
    }
}