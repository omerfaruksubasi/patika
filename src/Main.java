import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double genelOrt=0;
        int mat, kimya, biyoloji, fizik;
        boolean sonuc;
        Scanner input = new Scanner(System.in);
        System.out.print("matematik notunuzu giriniz: ");
        mat = input.nextInt();
        System.out.println(mat>=60 ? "GECTI" : "KALDI");
        System.out.print("kimya notunuzu giriniz: ");
        kimya = input.nextInt();
        System.out.println(kimya>=60 ? "GECTI" : "KALDI");
        System.out.print("biyoloji notunuzu giriniz: ");
        biyoloji = input.nextInt();
        System.out.println(biyoloji>=60 ? "GECTI" : "KALDI");
        System.out.print("fizik notunuzu giriniz: ");
        fizik = input.nextInt();
        System.out.println(fizik>=60 ? "GECTI" : "KALDI");
        genelOrt = mat+kimya+biyoloji+fizik/5;
        System.out.println("Genel Ortalaminiz: "+genelOrt+ (genelOrt>=60 ? "Sinifi gectiniz":"sinifta kaldiniz"));
    }
}
