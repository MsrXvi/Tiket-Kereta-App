package Final;

import java.util.ArrayList;
import java.util.Date;
import java.time.LocalDate;
import java.util.Scanner;

public class akhir {
    private static int kelasKereta;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DataKereta train = new DataKereta();
        LocalDate now = LocalDate.now();
        LocalDate later = now.plusDays(7);
        train.tambahKereta(new Kereta("Pamekasan", "Petruk", "ekonomi", 88000, 0, later, "08.00"));
        train.tambahKereta(new Kereta("Pamekasan", "Petruk", "Eklusif", 160000, 1, later, "17.00"));
        train.tambahKereta(new Kereta("Pamekasan", "Petruk", "Bisnis", 240000, 2, later, "12.00"));
        train.tambahKereta(new Kereta("Sampang", "Dhunay", "Ekonomi", 88000, 3, later, "10.00"));
        train.tambahKereta(new Kereta("Sampang", "Dhunay", "Eklusif", 160000, 4, later, "08.00"));
        train.tambahKereta(new Kereta("Sampang", "Dhunay", "Bisnis", 240000, 5, later, "15.00"));
        train.tambahKereta(new Kereta("Bangkalan", "Topel", "Ekonomi", 160000, 6, later, "06.00"));
        train.tambahKereta(new Kereta("Bangkalan", "Topel", "Eklusif", 160000, 7, later, "19.00"));
        train.tambahKereta(new Kereta("Bangkalan", "Topel", "Bisnis", 240000, 8, later, "20.30"));

        DataPenumpang penumpang = new DataPenumpang();
        boolean exit;

        while (exit = true) {
            System.out.println("\nProgram Pemesanan Tiket Kereta Api");
            System.out.println("====================================\n");
            System.out.println("1. Tambah Pemesanan");
            System.out.println("2, Lihat Daftar kereta");
            System.out.println("3, Lihat Daftar Penumpang");
            System.out.println("4, exit");
            System.out.println("Masukkan Pilihan : ");
            int pilih = Integer.parseInt(scanner.nextLine());
            switch (pilih) {
                case 1:

                    System.out.print("Inputkan Jumlah Penumpang :");
                    int Jumlah = Integer.parseInt(scanner.nextLine());
                    for (int indeks = 0; indeks < Jumlah; indeks++) {
                        System.out.print("\nMasukkan Nama : ");
                        String namaPenumpang = scanner.nextLine();

                        System.out.print("\nMasukkan No ID/KTP : ");
                        String idPenumpang = scanner.nextLine();

                        System.out.print("\nMasukkan Alamat : ");
                        String alamatPenumpang = scanner.nextLine();

                        System.out.print("\nMasukkan No Telfon : ");
                        String telfonPenumpang = scanner.nextLine();

                        System.out.print("\nMasukkan Email : ");
                        String emailPenumpang = scanner.nextLine();

                        Date calender = new Date();
                        System.out.println("Tanggal Pemesanan : " + calender.toString());
                        penumpang.tambahPenumpang(new Penumpang(namaPenumpang, idPenumpang, alamatPenumpang,
                                telfonPenumpang, emailPenumpang, calender));

                        DataPemesanan pemesanan = new DataPemesanan();
                        System.out.println("\nKota Tujuan :\n1, Pamekasan\n2, Sampang\n3, Bangkalan");
                        System.out.print("Kota Tujuan (1/2/3):");
                        int KotaTujuan = Integer.parseInt(scanner.nextLine());
                        if (KotaTujuan == 1) {
                            System.out.println("\nKelasKereta :\n1, Ekonomi\n2, Eklusif\n3, Bisnis");
                            System.out.print("Kelas Kereta (1/2/3);");
                            int KelasKereta = Integer.parseInt(scanner.nextLine());
                            if (KelasKereta == 1) {
                                pemesanan.tambahPemesanan(new Pemesanan(train, penumpang));
                                pemesanan.tampilPemesanan(indeks, 0);
                                ArrayList<Integer> kursiPmkEko = new ArrayList<Integer>();
                                kursiPmkEko.add(1);
                                kursiPmkEko.add(2);
                                kursiPmkEko.add(3);
                                kursiPmkEko.add(4);
                                kursiPmkEko.add(5);
                                kursiPmkEko.add(6);
                                kursiPmkEko.add(7);
                                kursiPmkEko.add(8);
                                kursiPmkEko.add(9);
                                kursiPmkEko.add(10);                              
                                System.out.print("Kursi Yang Tersedia; " + kursiPmkEko);
                                System.out.print("\nPilih Kursi (1-10); ");
                                int pilKursi = Integer.parseInt(scanner.nextLine());
                                kursiPmkEko.remove(pilKursi - 1);
                            }

                            else if (KelasKereta == 2) {
                                pemesanan.tambahPemesanan(new Pemesanan(train, penumpang));
                                pemesanan.tampilPemesanan(indeks, 1);
                                ArrayList<Integer> kursiPmkEks = new ArrayList<Integer>();
                                kursiPmkEks.add(1);
                                kursiPmkEks.add(2);
                                kursiPmkEks.add(3);
                                kursiPmkEks.add(4);
                                kursiPmkEks.add(5);
                                kursiPmkEks.add(6);
                                kursiPmkEks.add(7);
                                kursiPmkEks.add(8);
                                kursiPmkEks.add(9);
                                kursiPmkEks.add(10);
                                System.out.print("Kursi Yang Terpilih: " + kursiPmkEks);
                                System.out.print("\nPilih Kursi (1-10) ");
                                int pilKursi = Integer.parseInt(scanner.nextLine());
                                kursiPmkEks.remove(pilKursi - 1);

                            }

                            else if (KelasKereta == 3) {
                                pemesanan.tambahPemesanan(new Pemesanan(train, penumpang));
                                pemesanan.tampilPemesanan(indeks, 2);
                                ArrayList<Integer> kursiPmkBis = new ArrayList<Integer>();
                                kursiPmkBis.add(1);
                                kursiPmkBis.add(2);
                                kursiPmkBis.add(3);
                                kursiPmkBis.add(4);
                                kursiPmkBis.add(5);
                                kursiPmkBis.add(6);
                                kursiPmkBis.add(7);
                                kursiPmkBis.add(8);
                                kursiPmkBis.add(9);
                                kursiPmkBis.add(10);
                                System.out.print("Kursi Yang Terpilih; " + kursiPmkBis);
                                System.out.print("\nPilih Kursi (1-10) ");
                                int pilKursi = Integer.parseInt(scanner.nextLine());
                                kursiPmkBis.remove(pilKursi - 1);
                            }
                        }

                    else if (KotaTujuan == 2){
                        System.out.println("\n Kursi Kereta :\n1, Ekonomi\n2, Eklusif\n3, Bisnis");
                        System.out.print("Pilih Kereta (1/2/3): ");
                        int KelasKereta = Integer.parseInt(scanner.nextLine());
                        if (KelasKereta == 1) {
                            pemesanan.tambahPemesanan(new Pemesanan(train, penumpang));
                            pemesanan.tampilPemesanan(indeks, 0);
                            ArrayList<Integer> kursiSamEko = new ArrayList<Integer>();
                            kursiSamEko.add(1);
                            kursiSamEko.add(2);
                            kursiSamEko.add(3);
                            kursiSamEko.add(4);
                            kursiSamEko.add(5);
                            kursiSamEko.add(6);
                            kursiSamEko.add(7);
                            kursiSamEko.add(8);
                            kursiSamEko.add(9);
                            kursiSamEko.add(10);
                            System.out.print("Kursi Yang Tersedia; " + kursiSamEko);
                            System.out.print("\nPilih Kursi (1-10); ");
                            int pilKursi = Integer.parseInt(scanner.nextLine());
                            kursiSamEko.remove(pilKursi - 1);
                        }

                        else if (KelasKereta == 2) {
                            pemesanan.tambahPemesanan(new Pemesanan(train, penumpang));
                            pemesanan.tampilPemesanan(indeks, 1);
                            ArrayList<Integer> kursiSamEks = new ArrayList<Integer>();
                            kursiSamEks.add(1);
                            kursiSamEks.add(2);
                            kursiSamEks.add(3);
                            kursiSamEks.add(4);
                            kursiSamEks.add(5);
                            kursiSamEks.add(6);
                            kursiSamEks.add(7);
                            kursiSamEks.add(8);
                            kursiSamEks.add(9);
                            kursiSamEks.add(10);
                            System.out.print("Kursi Yang Terpilih: " + kursiSamEks);
                            System.out.print("\nPilih Kursi (1-10) ");
                            int pilKursi = Integer.parseInt(scanner.nextLine());
                            kursiSamEks.remove(pilKursi - 1);

                        }

                        else if (KelasKereta == 3) {
                            pemesanan.tambahPemesanan(new Pemesanan(train, penumpang));
                            pemesanan.tampilPemesanan(indeks, 2);
                            ArrayList<Integer> kursiSamBis = new ArrayList<Integer>();
                            kursiSamBis.add(1);
                            kursiSamBis.add(2);
                            kursiSamBis.add(3);
                            kursiSamBis.add(4);
                            kursiSamBis.add(5);
                            kursiSamBis.add(6);
                            kursiSamBis.add(7);
                            kursiSamBis.add(8);
                            kursiSamBis.add(9);
                            kursiSamBis.add(10);
                            System.out.print("Kursi Yang Terpilih; " + kursiSamBis);
                            System.out.print("\nPilih Kursi (1-10) ");
                            int pilKursi = Integer.parseInt(scanner.nextLine());
                            kursiSamBis.remove(pilKursi - 1);
                        }
                    } else if (KotaTujuan == 3){
                        System.out.println("\n Kursi Kereta :\n1, Ekonomi\n2, Eklusif\n3, Bisnis");
                        System.out.print("Pilih Kereta (1/2/3): ");
                        int kereta = Integer.parseInt(scanner.nextLine());
                        if (kereta == 1) {
                            pemesanan.tambahPemesanan(new Pemesanan(train, penumpang));
                            pemesanan.tampilPemesanan(indeks, 0);
                            ArrayList<Integer> kursiBangEko = new ArrayList<Integer>();
                            kursiBangEko.add(1);
                            kursiBangEko.add(2);
                            kursiBangEko.add(3);
                            kursiBangEko.add(4);
                            kursiBangEko.add(5);
                            kursiBangEko.add(6);
                            kursiBangEko.add(7);
                            kursiBangEko.add(8);
                            kursiBangEko.add(9);
                            kursiBangEko.add(10);
                            System.out.print("Kursi Yang Tersedia; " + kursiBangEko);
                            System.out.print("\nPilih Kursi (1-10); ");
                            int pilKursi = Integer.parseInt(scanner.nextLine());
                            kursiBangEko.remove(pilKursi - 1);
                        }

                        else if (kereta == 2) {
                            pemesanan.tambahPemesanan(new Pemesanan(train, penumpang));
                            pemesanan.tampilPemesanan(indeks, 1);
                            ArrayList<Integer> kursiBangEks = new ArrayList<Integer>();
                            kursiBangEks.add(1);
                            kursiBangEks.add(2);
                            kursiBangEks.add(3);
                            kursiBangEks.add(4);
                            kursiBangEks.add(5);
                            kursiBangEks.add(6);
                            kursiBangEks.add(7);
                            kursiBangEks.add(8);
                            kursiBangEks.add(9);
                            kursiBangEks.add(10);
                            System.out.print("Kursi Yang Terpilih: " + kursiBangEks);
                            System.out.print("\nPilih Kursi (1-10) ");
                            int pilKursi = Integer.parseInt(scanner.nextLine());
                            kursiBangEks.remove(pilKursi - 1);

                        }

                        else if (kereta == 3) {
                            pemesanan.tambahPemesanan(new Pemesanan(train, penumpang));
                            pemesanan.tampilPemesanan(indeks, 2);
                            ArrayList<Integer> kursiBangBis = new ArrayList<Integer>();
                            kursiBangBis.add(1);
                            kursiBangBis.add(2);
                            kursiBangBis.add(3);
                            kursiBangBis.add(4);
                            kursiBangBis.add(5);
                            kursiBangBis.add(6);
                            kursiBangBis.add(7);
                            kursiBangBis.add(8);
                            kursiBangBis.add(9);
                            kursiBangBis.add(10);
                            System.out.print("Kursi Yang Terpilih; " + kursiBangBis);
                            System.out.print("\nPilih Kursi (1-10) ");
                            int pilKursi = Integer.parseInt(scanner.nextLine());
                            kursiBangBis.remove(pilKursi - 1);
                            break;

                        }
                    }
                }
            case 2:
                train.tampil();
                break;
            case 3:
                penumpang.tampilSemua();
                break;
            case 4:
                System.exit(0);
                break;
        }
    } 
}   
}