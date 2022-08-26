import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args) {
        int mat,fiz,kim,tr,tar,muz;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = input.nextInt();

        System.out.print("Fizik notunuz: ");
        fiz = input.nextInt();

        System.out.print("Kimya notunuz: ");
        kim = input.nextInt();

        System.out.print("Türkçe notunuz: ");
        tr = input.nextInt();

        System.out.print("Tarih notunuz: ");
        tar = input.nextInt();

        System.out.print("Müzik notunuz: ");
        muz = input.nextInt();

        float ort = (mat+fiz+kim+tr+tar+muz)/6;

        System.out.println("\n İşleniyor...");
        System.out.println("Bu seneki ortalamanız: " + ort);



    }

}