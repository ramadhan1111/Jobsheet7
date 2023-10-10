import java.util.Scanner;

public class DoWhileCuti25 {
    public static void main(String[] args) {
        Scanner sc25 = new Scanner(System.in);

        int jatahCuti , jumlahHari;
        String konfirmasi;

        System.out.print("Jatah cuti: ");
        jatahCuti = sc25.nextInt();

        do {
            System.out.print("Apakah Anda ingin mengambil cuti (y/t)? ");
            konfirmasi = sc25.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari: ");
                jumlahHari = sc25.nextInt();

                if (jumlahHari <= jatahCuti){
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                }else {
                    System.out.println("Sisa jatah cuti anda tidak mencukupi");
                    break;
                }
                    
            }
        } while (jatahCuti > 0);
    }
    
}
