import java.util.Scanner;
public class While25 {
    public static void main(String[] args){
        Scanner sc25 =new Scanner(System.in);
        int i =1;

        while (i <= 10){
            if (i % 2 == 0){
                System.out.println("Angka " + i + " adalah bilangan genap");
            }else{
                System.out.println("Angka " + i +" adalah bilangan ganjil");
            }
            i++;
        }
    }
}

