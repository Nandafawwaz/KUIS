import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ulang;
        do {
            System.out.println("+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+");
            System.out.println("|        Pendaftaran beasiswa PT.Benang       ");
            System.out.println("+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+");
            System.out.println("Terdapat 2 program beasiswa yang dibuka :");
            System.out.println("1. Beasiswa Pelajar");
            System.out.println("2. Beasiswa Mahasiswa");
            System.out.print("Pilih beasiswa yang didaftar : ");

            int pilih = in.nextInt();

              switch(pilih) {
                  case 1:
                      String nama;
                       System.out.println("=== FORM PENDAFTARAN ===");
                       System.out.println("Nama Lengkap    : ");
                       nama = in.next();
                       System.out.println("Usia            : ");
                       break;
                  case 2:
                       System.out.println("=== FORM PENDAFTARAN ===");
              }

            }
        }
    }
}
