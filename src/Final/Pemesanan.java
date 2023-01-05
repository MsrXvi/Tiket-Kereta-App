package Final;

import java.util.ArrayList;
import java.util.List;

public class Pemesanan {
    public DataKereta kereta;
    public DataPenumpang penumpang;
    
    Pemesanan(DataKereta train, DataPenumpang penumpang){
        this.kereta = train;
        this.penumpang = penumpang;
    }

    void printPenumpang (int pil1){
        penumpang.tampilPenumpang(pil1);
    }

    void PrintKereta (int pil2){
        kereta.tampilKereta(pil2);
    }
}

class DataPemesanan {
    ArrayList<Pemesanan> dataPemesanan = new ArrayList<Pemesanan>();
    void tambahPemesanan(Pemesanan data){
        this.dataPemesanan.add(data);
    }

    void tampilPemesanan ( int pil1, int pil2){
        System.out.println("\nPemesanan ke - "+ pil1+1);
        for (Pemesanan item: this.dataPemesanan){
            item.printPenumpang(pil1);
            item.PrintKereta(pil2);
        }
    }
}
