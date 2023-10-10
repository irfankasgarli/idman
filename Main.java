import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("idman programına hoşgeldiniz...");
        String idmanlar = "Geçerli Hareketler...\n"
                + "Burpee\n"
                + "Pushup(Şınav)\n"
                + "Situp(Mekik)\n"
                + "Squat";
        System.out.println(idmanlar);
        System.out.println("Bir idman oluşturun...");
        System.out.println("Burpee Sayısı : ");
        int burpee = scanner.nextInt();
        System.out.println("Pushup Sayısı : ");
        int pushup = scanner.nextInt();
        System.out.println("Situp Sayısı : ");
        int situp = scanner.nextInt();
        System.out.println("Squat Sayısı : ");
        int squat = scanner.nextInt();
        scanner.nextLine();
        İdman idman = new İdman(burpee, pushup, situp, squat);
        System.out.println("İdmanınız başlıyor...");
        Hareket hareket = new Hareket(idman);
        while (idman.idmanBittiMi() == false) {
            System.out.println("hareket türü(burpee,pushup,situp,squat) : ");
            String tur = scanner.nextLine();
            System.out.println("Bu hareketten kaç tane yapacaksınız ? : ");
            int sayi = scanner.nextInt();
            scanner.nextLine();
            hareket.hareketYap(tur, sayi);
        }
        System.out.println("idmanını başarıyla bitirdin....");
    }
}