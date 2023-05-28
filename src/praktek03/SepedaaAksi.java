package praktek03;

public class SepedaaAksi {
    public static void main(String[] args) {
        Sepedaa s = new Sepedaa();

        s.setMerk("Butterfly");
        s.setWarna("Merah");
        s.setHarga(1000);
        
        s.cetakInfo();
        
        System.out.print("Merknya \t: ");
        System.out.println(s.getMerk());
        System.out.print("Warnanya \t: ");
        System.out.println(s.getWarna());
        System.out.print("Harganya \t: ");
        System.out.println(s.getHarga());
    }
}
