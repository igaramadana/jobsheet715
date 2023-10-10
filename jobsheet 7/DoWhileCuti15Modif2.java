import java.util.Scanner;
public class DoWhileCuti15Modif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Jatah Cuti: ");
        jatahCuti = sc.nextInt();

        do {
            System.out.print("Apakah anda ingin mengambil cuti (y/t)? ");
            konfirmasi = sc.next();

            if(konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari: ");
                jumlahHari = sc.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                } else if (jatahCuti == 0){
                    break;
                } else {
                    System.out.println("Sisa jatah cuti anda tidak mencukupi. sisa jatah anda adalah: " + jatahCuti);
                }
            } else {
                break;
            }
        } while (jatahCuti > 0);
    }
}
