import java.util.Scanner;

public class ForKelipatan225{
    public static void main(String[] args){
        Scanner input25 = new Scanner(System.in);
        int kelipatan , jumlah = 0, counter = 0;
        double avr = 0.0;

        System.out.print("Masukkan bilangan kelipatan (1-9): ");
        kelipatan = input25.nextInt();

        for (int i = 1; i <= 50; i++){
            if (i % kelipatan == 0){
                jumlah += i;
                counter++;
                
            }
        if (counter > 0) {
            avr = (double) jumlah / counter;
        }
        }
        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n" , kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
        System.out.printf("Rata-rata bilangan kelipatan %d dari 1 sampai 50 adalah %2f\n ",kelipatan,avr );
    }
}
