public class Main {
    public static void main(String[] args) {
        String[][] sehirler = new String[3][3];

        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Bursa";
        sehirler[0][2] = "Bilecik";
        sehirler[1][0] = "Ankara";
        sehirler[1][1] = "Konya";
        sehirler[1][2] = "Kayseri";
        sehirler[2][0] = "Ordu";
        sehirler[2][1] = "Samsun";
        sehirler[2][2] = "Trabzon";
        /*
        for (int i = 0; i <= 2; i++) {
            System.out.println("----------------------");
            for (int j = 0; j <= 2; j++) {
                System.out.println(sehirler[i][j]);
            }
        }
        */
        String[][] cities = {{"İstanbul","Bursa","Bilecik"},{"Ankara","Konya","Kayseri"},{"Ordu","Samsun","Trabzon"}};
        for (int i = 0; i <= 2; i++) {
            System.out.println("----------------------");
            for (int j = 0; j <= 2; j++) {
                System.out.println(cities[i][j]);
            }
        }
    }
}