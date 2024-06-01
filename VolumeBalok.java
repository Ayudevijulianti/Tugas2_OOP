package tugas02devi;

/**
 *
 * @author devijulianti 2201010700
 * TGL: 2024-05-31
 */
public class VolumeBalok {
    private double panjang;
    private double lebar;
    private double tinggi;

    public VolumeBalok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }

    public double hitungLuasPermukaan() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }

    public void printInfo() {
        System.out.println("\nPanjang: " + panjang);
        System.out.println("Lebar: " + lebar);
        System.out.println("Tinggi: " + tinggi);
        System.out.println("\nVolume: " + hitungVolume());
        System.out.println("Luas Permukaan: " + hitungLuasPermukaan());
    }
}