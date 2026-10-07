import java.util.Scanner;

public class StudiKasus2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama; 
        String jenisKegiatan;
        int jumlahDokumen;
        int peringkat;
        int statusPKM;
        int dokumenKurang;

        System.out.print("Nama mahasiswa: ");
        nama = input.nextLine();

        System.out.print("Jenis kegiatan: ");
        jenisKegiatan = input.nextLine();

        System.out.print("Jumlah dokumen: ");
        jumlahDokumen = input.nextInt();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA")
                || jenisKegiatan.equalsIgnoreCase("BAKORMA")
                || jenisKegiatan.equalsIgnoreCase("Mandiri")) {

            System.out.print("Peringkat: ");
            peringkat = input.nextInt();

            if (peringkat >= 1 && peringkat <= 3) {

                if (jumlahDokumen == 4) {
                    System.out.println("Berhak menerima dana penghargaan.");
                } else {
                    dokumenKurang = 4 - jumlahDokumen;

                    System.out.println("Dokumen belum lengkap.");
                    System.out.println(dokumenKurang + " dokumen masih kurang.");
                    System.out.println("Dana penghargaan tidak diberikan.");
                }

            } else {
                System.out.println(
                    "Tidak menerima dana penghargaan "
                    + "(hanya untuk juara 1, 2, atau 3)."
                );
            }

        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {

            System.out.print("Status pendanaan PKM (1 = didanai, 0 = tidak didanai): ");
            statusPKM = input.nextInt();

            if (statusPKM == 1) {

                if (jumlahDokumen == 4) {
                    System.out.println("Berhak menerima dana penghargaan.");
                } else {
                    dokumenKurang = 4 - jumlahDokumen;

                    System.out.println("Dokumen belum lengkap.");
                    System.out.println(dokumenKurang + " dokumen masih kurang.");
                    System.out.println("Dana penghargaan tidak diberikan.");
                }

            } else {
                System.out.println(
                    "Tidak menerima dana penghargaan "
                    + "(PKM tidak didanai)."
                );
            }

        } else {
            System.out.println(
                "Tidak menerima dana penghargaan "
                + "(jenis kegiatan tidak termasuk ketentuan)."
            );
        }
        input.close();
    }
}