import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();
        int sonuc = dortIslem.Topla(8, 9);
        System.out.println(sonuc);

        int carpSonuc = dortIslem.Carpma(12, 3);
        System.out.println(carpSonuc);

        int bolmeSonuc = dortIslem.Bolme(35, 5);
        System.out.println(bolmeSonuc);


    }
}
