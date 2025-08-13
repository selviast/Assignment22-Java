package main.java.org.dibimbing;
import java.util.Scanner;


public class Assignment22 {
    public static void main(String[] args) {
        ifDasarDanNested(90);
        looping100();
        tryCatch();
    }
    
    public static void ifDasarDanNested(int angka) {
        System.out.println("------------ no.1 if Dasar dan nested ---------");

            // If dasar --> jika range 60 sampai 100 maka dinyatakan lulus
            if (angka >= 60 && angka <= 100) {
                System.out.println("Nilai = " + angka + "\nSelamat! Anda Lulus");
            //range 0 - 59 = dinyatakan tidak lulus
            } else if (angka >= 0 && angka < 60) {
                System.out.println("Nilai = " + angka + "\nMaaf, Anda Tidak Lulus");
            //selain range 0-100 maka input nilai dianggap tidak benar.
            } else {
                System.out.println("Mohon inputkan nilai dengan benar.");
            }

            // If bertingkat (nested if / if di dalam if)
            if (angka >= 60 && angka <=100 ) {
                if (angka >= 85) { // jika nilai di range 85-100 cetak Nilai sangat baik
                    System.out.println("Nilai sangat baik");
                } else { // jika range 60-84 maka cetak Nilai cukup baik
                    System.out.println("Nilai cukup baik");
                }
            } else if (angka >= 0 && angka < 60) { //jika nilai di range 0 - 59 maka nilai di bawah standard minimum
                System.out.println("Nilai belum mencapai batas minimum");
            } else {
                System.out.println("Input angka tidak valid"); //input nilai di luar range 0-100
            }
    }

    public static void looping100(){
        System.out.println("------------ no.2 lopping 1-100 -----------");
        //dimulai dari angka 1, berhenti sampai i bernilai 100, dan tiap iterasi i bertambah 1
        for (int i=1; i<=100; i++){
            System.out.println("Angka: " + i);
        }
    }


    public static void tryCatch() {
            System.out.println("------------ no.3 try catch -----------");
            // prompt input
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.print("Masukkan angka pertama: "); //input angka pertama
                int a = scanner.nextInt();

                System.out.print("Masukkan angka kedua: "); //input angka kedua
                int b = scanner.nextInt();

                int hasil = a / b;
                System.out.println("Hasil pembagian: " + hasil);
            } catch (ArithmeticException e) {
                //jika dibagi dengan 0
                System.out.println("Kesalahan: Tidak bisa membagi dengan nol.");
            } catch (Exception e) {
                //input tidak valid
                System.out.println("Kesalahan: Input tidak valid.");
            } finally {
                scanner.close();
                System.out.println("Program selesai.");
            }
        }
}
