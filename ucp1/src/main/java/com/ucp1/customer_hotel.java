package com.ucp1;

public class customer_hotel {
    String name;
    String address;
    final int noktp = 2021116;
    final int nokamar = 45;

    public void infoTamu() {
        System.out.println("Info TAMU:");
        System.out.println("Nama: " + name);
        System.out.println("No KTP: " + noktp);
        System.out.println("Alamat: " + address);
        System.out.println("No Kamar: " + nokamar);
    }

    public void waktuCheckin(String checkinTime) {
        System.out.println("Waktu Check-in: " + checkinTime);
    }

    public void waktuCheckout(String checkoutTime) {
        System.out.println("Waktu Check-out: " + checkoutTime);
    }

    public void informasiPembayaran(double jumlah) {
        System.out.println("Informasi Pembayaran");
        System.out.println("Total Pembayaran: RP." + jumlah);
    }

    public void pesananMakanan(String food) {
        System.out.println("Pesanan Makan: " + food);
    }
    
}