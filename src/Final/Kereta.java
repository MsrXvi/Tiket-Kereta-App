package Final;

import java.util.ArrayList;
import java.time.LocalDate;

public class Kereta {
    String tujuan;
    String namaKereta;
    String kelasKereta;
    int hargaKereta;
    int noKereta;
    LocalDate jadwal;
    String Waktu;

    Kereta(String tujuan, String namaKereta, String kelasKereta, int hargaKereta, int i, LocalDate jadwal, String waktu){
        this.tujuan = tujuan;
        this.namaKereta = namaKereta;
        this.kelasKereta = kelasKereta;
        this.hargaKereta = hargaKereta;
        this.noKereta = noKereta;
        this.jadwal = jadwal;
        this.Waktu = waktu;
    }
    

    public void print() {
        System.out.println("\ntujuan : "+this.tujuan);
        System.out.println("nama kereta "+this.namaKereta);
        System.out.println("kelas kereta "+this.kelasKereta);
        System.out.println("harga kereta "+this.hargaKereta);
        System.out.println("no kereta "+this.noKereta);
        System.out.println("tanggal berangkat : " +this.jadwal+ "pukul" + this.Waktu);
    }
}

class DataKereta {
    ArrayList<Kereta> dataKereta = new ArrayList<Kereta>();
    void tambahKereta (Kereta data){
        this.dataKereta.add(data);
    }
    void tampil(){
        System.out.println("\nDaftar Kereta Api");
        System.out.println("\n=================");
        for (Kereta item: this.dataKereta){
            item.print();
        }

    }
    public void tampilKereta(int pil2) {
    }
}