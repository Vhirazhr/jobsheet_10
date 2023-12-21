import java.util.Scanner;

public class CinemaWithScanner211 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        String nama;
        int baris, kolom;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan Anda (1-3): ");

            int pilihan = input.nextInt();
            input.nextLine();

            // memilih menu
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama penonton: ");
                    nama = input.nextLine();
                    System.out.print("Masukkan nomor baris: ");
                    baris = input.nextInt();
                    input.nextLine();
                    System.out.print("Masukkan nomor kolom: ");
                    kolom = input.nextInt();
                    input.nextLine();

                    // Memeriksa ketersediaan kursi
                    if (baris >= 1 && baris <= penonton.length && kolom >= 1 && kolom <= penonton[0].length) {
                        if (penonton[baris - 1][kolom - 1] == null) {
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Penonton " + nama + " ditempatkan di kursi " + baris + ", " + kolom);
                        } else {
                            System.out.println("Kursi sudah terisi. Silakan pilih kursi lain.");
                        }
                    } else {
                        System.out.println(
                                "Baris atau kolom tidak valid. Harap masukkan nomor baris dan kolom yang valid.");
                    }
                    break;

                // daftar penonton
                case 2:
                    System.out.println("Daftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] == null) {
                                System.out.print("***\t");
                            } else {
                                System.out.print(penonton[i][j] + "\t");
                            }
                        }
                        System.out.println();
                    }
                    break;

                // Exit
                case 3:
                    System.out.println("Keluar dari program. Selamat tinggal!");
                    input.close();

                default:
                    System.out.println("Pilihan tidak valid. Harap masukkan angka antara 1 dan 3.");
            }
        }
    }
}
