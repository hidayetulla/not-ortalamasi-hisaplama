import java.util.Scanner;

public class pratik {
    public static void main(String[] args) {
        int mat,tarih,muzik,kimya,fizik,turkce;

        Scanner input = new Scanner(System.in);

        System.out.print("matimatik notunuz: ");
        mat = input.nextInt();

        System.out.print("tarih notunuz: ");
        tarih = input.nextInt();

        System.out.print("muzik notunuz:");
        muzik = input.nextInt();

        System.out.print("kimya notunuz: ");
        kimya = input.nextInt();

        System.out.print("fizik notunuz: ");
        fizik = input.nextInt();

        System.out.print("turkce notunuz: ");
        turkce = input.nextInt();

        int toplam = (mat+tarih+muzik+kimya+fizik+turkce);
        double sonuc1= toplam/6;
        String sonuc = sonuc1>60 ? "çok şanslısın" : "birz daha çalış";
        System.out.print(sonuc);
    }
}
