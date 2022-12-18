import Auto.Bus;

public class Main {
    public static void main(String[] args) {
        Bus laz = new Bus("ЛАЗ", "Турист", 1985, "СССР", "бело-красный", 110);
        Bus paz = new Bus("ПАЗ", "Cитимакс-9", 2022, "Россия", "синий", 150);
        Bus nefaz = new Bus("НЕФАЗ", "Детский", 2015, "Россия", "желтый", 80);
        System.out.println(laz);
        System.out.println(paz);
        System.out.println(nefaz);
    }
}