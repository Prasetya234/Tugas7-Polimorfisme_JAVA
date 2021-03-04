package Kerucut;

public class Main {

    public static void main(String[] args) {
        BinganRuing SayNotoYes = new BinganRuing();
        Kerucut hasil = new Kerucut(7,24,26);

        // memanggil method luas dan keliling
        System.out.println("---------------------------------------------");
        SayNotoYes.luas();
        SayNotoYes.volume();

        System.out.println("Luas Kerucut: " + hasil.luas());
        System.out.println("Volume Kerucut: " + hasil.volume());
        System.out.println("---------------------------------------------");
    }
}
