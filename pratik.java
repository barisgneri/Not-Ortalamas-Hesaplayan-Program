https://app.patika.dev/barisgneri

package Giris;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        int fizik, kimya, mat, tarih, muzik, turkce;

        Scanner input = new Scanner(System.in);

        System.out.println("Mat Notunuzu Girin:");
        mat = input.nextInt();

        System.out.println("Fizik Notunuzu Girin: ");
        fizik = input.nextInt();

        System.out.println("Kimya Notunuzu Girin: ");
        kimya = input.nextInt();

        System.out.println("Tarih Notunuzu Girin: ");
        tarih = input.nextInt();

        System.out.println("Müzik Notunuzu Girin: ");
        muzik = input.nextInt();

        System.out.println("Türkçe Notunuzu Girin: ");
        turkce = input.nextInt();

        double toplam = turkce + muzik + tarih + fizik + kimya + mat;
        double sonuc = toplam/6.0;

        System.out.print("Ortalamanız: "+ sonuc +" ve ");

        String durum = sonuc >= 60 ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız";
        System.out.print(durum);
    }
}
