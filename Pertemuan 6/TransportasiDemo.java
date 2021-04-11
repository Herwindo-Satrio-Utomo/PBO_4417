import transportasi.Bicycle;
import transportasi.Mobil;

public class TransportasiDemo {
    public static void main(String[] args) {
        Mobil Jazz = new Mobil();
        Jazz.setWarna("Hitam");
        Jazz.setNopol("H 41 NDO");
        System.out.println("Mobil Jazz dengan warna " + Jazz.getWarna() + " dan nomor " + Jazz.getNopol());

        Mobil Fortuner = new Mobil("Putih", "H 1 SYG", 2021, true);
        System.out.println("Mobil Fortuner dengan warna " + Fortuner.getWarna() + " dan nomor " + Fortuner.getNopol() + " tahun produksi " + Fortuner.getTahunProduksi() +" "+ Fortuner.getRem());

        Bicycle pixy = new Bicycle();
        pixy.setWarna("Merah");
        pixy.setRem(false);
        System.out.println("Sepeda dengan warna " + pixy.getWarna()+" "+pixy.getRem());

        Bicycle a = new Bicycle("Hitam", "Polygon", false);
        System.out.println("Sepeda dengan warna " + a.getWarna() + " dengan merek " + a.getMerek() +" "+ a.getRem());
    }
}