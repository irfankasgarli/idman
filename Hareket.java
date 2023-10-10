import java.util.Scanner;

public class Hareket {
    İdman idman;
    public Hareket(İdman idman) {
        this.idman = idman;
    }

    public void hareketYap(String hareketTuru, int sayi) {
        if (hareketTuru.equals("burpee")) {
            burpeeYap(sayi);
        } else if (hareketTuru.equals("pushup")) {
            pushupYap(sayi);
        } else if (hareketTuru.equals("situp")) {
            situpYap(sayi);
        } else if (hareketTuru.equals("squat")) {
            squatYap(sayi);
        } else {
            System.out.println("geçersiz işlem...");
        }
    }

    public void burpeeYap(int sayi) {
        if (idman.getBurpee_sayisi() == 0) {
            System.out.println("yapacak burpee kalmadı...");
        } else if (idman.getBurpee_sayisi() - sayi < 0) {
            System.out.println("hedeflediğin burpee sayısını geçtin.Tebrikler!");
            idman.setBurpee_sayisi(0);
            System.out.println("kalan burpee : " + idman.getBurpee_sayisi());
        } else {
            idman.setPushup_sayisi(idman.getPushup_sayisi() - sayi);
            System.out.println("kalan burpee : " + idman.getBurpee_sayisi());
        }
    }

    public void pushupYap(int sayi) {
        if (idman.getPushup_sayisi() == 0) {
            System.out.println("yapacak pushup kalmadı...");
        } else if (idman.getPushup_sayisi() - sayi < 0) {
            System.out.println("hedeflediğin pushup sayısını geçtin.Tebrikler!");
            idman.setPushup_sayisi(0);
            System.out.println("kalan pushup : " + idman.getPushup_sayisi());
        } else {
            idman.setPushup_sayisi(idman.getPushup_sayisi() - sayi);
            System.out.println("kalan pushup sayısı : " + idman.getPushup_sayisi());
        }
    }

    public void situpYap(int sayi) {
        if (idman.getSitup_sayisi() == 0) {
            System.out.println("Yapacak Situp  kalmadı...");
        } else if (idman.getSitup_sayisi() - sayi < 0) {
            System.out.println("Hedeflediğin situp sayısını geçtin.Tebrikler!");
            idman.setSitup_sayisi(0);
            System.out.println("Kalan Situp : " + idman.getSitup_sayisi());
        } else {
            idman.setSitup_sayisi(idman.getSitup_sayisi() - sayi);
            System.out.println("Kalan Situp Sayısı : " + idman.getSitup_sayisi());
        }
    }

    public void squatYap(int sayi) {
        if (idman.getSquat_sayisi() == 0) {
            System.out.println("Yapacak squat kalmadı...");
        } else if (idman.getSquat_sayisi() - sayi < 0) {
            System.out.println("Hedeflediğin squat sayısını geçtin.Tebrikler!");
            idman.setSquat_sayisi(0);
            System.out.println("Kalan Squat : " + idman.getSquat_sayisi());
        } else {
            idman.setSquat_sayisi(idman.getSquat_sayisi() - sayi);
            System.out.println("Kalan Squat Sayısı : " + idman.getSquat_sayisi());
        }
    }

    public boolean idmanBittiMi() {
        return (idman.getBurpee_sayisi() == 0) && (idman.getPushup_sayisi() == 0) && (idman.getSitup_sayisi() == 0)
                && (idman.getSquat_sayisi() == 0);

    }

}

