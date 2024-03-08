package TugasPemlan2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Data> data_diri = new ArrayList<>();
        char respon;
        while (true) {
            Data d1 = new Data();
            System.out.print("Masukkan NIM: ");
            d1.setNim(sc.nextLine());
            System.out.print("Masukkan Nama: ");
            d1.setNama(sc.nextLine());
            System.out.print("Masukkan Alamat: ");
            d1.setAlamat(sc.nextLine());
            data_diri.add(d1);
            System.out.print("Tambah lagi ?");
            respon = sc.next().charAt(0);
            sc.nextLine();
            if (respon == 't') {
                break;
            }
        }
        System.out.println("==================================");
        for (Data d : data_diri) {
            System.out.println(d.getNim() + " | " + d.getNama() + " | " + d.getAlamat());
        }
    }
}
