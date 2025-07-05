package praktikum20250515;

public class TestPolimorfisme {
    public static void main(String[] args) {
        
        Kendaraan k1 = new Kendaraan(2, "Merah");
        k1.display();  
        System.out.println();

        Kendaraan k2 = new Mobil("Bensin", 1500, 4, "Hitam");
        k2.display();  
        System.out.println();
        
        Kendaraan k3 = new Sepeda("2", 21, 2, "Hijau");
        k3.display();
        
        Kendaraan k4 = new Taksi(4, 3, "Hitam", 1, 4, "Bensin");
        k4.display();
    }
}