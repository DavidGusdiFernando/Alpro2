import java.util.Scanner;

public class HitungLuasJajarGenjang {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Menghitung Luas Jajar Genjang");
        System.out.println("===============================");

        System.out.print("Masukkan alas: ");
        double alas = input.nextDouble();

        System.out.print("Masukkan tinggi: ");
        double tinggi = input.nextDouble();
        
        double luas = alas * tinggi;
        System.out.println("Luas jajar genjang = " + luas);
    }
}