package com.ucp1;
public class tampilan_hasil_customer_hotel {
    public static void main(String[] args) {
        customer_hotel customer = new customer_hotel();
        customer.name = "joko";
        customer.address = "bandung";

        customer.infoTamu();
        customer.waktuCheckin("12.30");
        customer.waktuCheckout("13.50");
        customer.informasiPembayaran(200000);
        customer.pesananMakanan("nasi goreng");

    }
}
