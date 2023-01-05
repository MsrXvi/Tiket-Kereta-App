package Final;

import java.util.ArrayList;
import java.util.Date;

public class Penumpang {
    String namaPenumpang;
    String idPenumpang;
    String alamatPenumpang;
    String telfonPenumpang;
    String emailPenumpang;
    Date tgl;

    Penumpang (String namaPenumpang, String idPenumpang, String alamatPenumpang, String telfonPenumpang, String emailPenumpang, Date calender){
        this.namaPenumpang = namaPenumpang;
        this.idPenumpang = idPenumpang;
        this.alamatPenumpang = alamatPenumpang;
        this.emailPenumpang = emailPenumpang;
        this.tgl = calender;

    }

void print(){
        System.out.println("\nNama Penumpang: "+this.namaPenumpang);
        System.out.println("ID /KTP : "+this.idPenumpang);
        System.out.println("Alamat : "+this.alamatPenumpang);
        System.out.println("No Telfon : "+this.telfonPenumpang);
        System.out.println("Email : "+this.emailPenumpang);
        System.out.println("Tanggal Pesan : "+this.tgl);
    }

    void printidentitas (){
        System.out.println("\nNamaPenumpang: "+this.namaPenumpang);
        System.out.println("ID /KTP : "+this.idPenumpang);
    }

}

class DataPenumpang {
    ArrayList<Penumpang> dataPenumpang = new ArrayList<Penumpang>();
    void tambahPenumpang(Penumpang data){
        this.dataPenumpang.add(data);
    }
void tampilSemua(){
        System.out.println("\nDaftar Penumpang Kereta Api");
        System.out.println("\n===========================");
        for (Penumpang item: this.dataPenumpang){
            item.print();
        }
    }

    void tampilPenumpang (int pilihan) {
        dataPenumpang.get(pilihan).printidentitas();
    }
}