import java.util.Scanner;
public class persegi extends BangunDatar {
    float sisi;

    @Override
    float Luas() {
        float luas = sisi * sisi;
        System.out.println("Luas Persegi     = " + luas);
        return luas;
    }

    @Override
    float Keliling() {
        float keliling = 4 * sisi;
        System.out.println("Keliling Persegi = " + keliling);
        return keliling;
    }

    void inputPersegi() {
        Scanner input = new Scanner(System.in);
        System.out.println("----Persegi----");
        System.out.print("Masukkan nilai sisi: ");
        sisi = input.nextFloat();
        System.out.println("---- Hasil ----");
        Luas();
        Keliling();
    }

    void inputpersegi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}