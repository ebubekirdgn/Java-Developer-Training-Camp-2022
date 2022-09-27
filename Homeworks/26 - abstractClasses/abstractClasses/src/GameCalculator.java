public abstract class GameCalculator {
    public abstract void hesapla(); // bunu kim impement ederse herkes kendine göre doldurmak zorundadır.
    public final void gameOver(){    // final ise değiştiremesin demektir.
        System.out.println("Oyun Bitti!");
    }
}
