import java.util.Scanner;
public class Mahasiswa15 {
    public static void main(String[] args) {
        Scanner scn15 = new Scanner(System.in);
        int jml = 1;
        String nama = "";
        String jenisKelamin = "";
        String output = "";

        while (jml <= 30){
            System.out.print("Masukkan Nama Mahasiswa: ");
            nama = scn15.nextLine();
            jml++;
            System.out.print("Masukkan Jenis Kelamin: ");
            jenisKelamin = scn15.nextLine();

            if (jenisKelamin.equalsIgnoreCase("P")) {
                output += nama ;
            
            }    
    }System.out.println("Yang berjenis kelamin perempuan adalah: ");
    System.out.println(output);
} 
}
