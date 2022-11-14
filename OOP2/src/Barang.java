public class Barang {
    int kodeBarang = 1;
    String namaBarang = "Kursi";
    int harga = 20000;
    int jumlah = 2;
    String kategori = "Mebel";

    public void preparing (){
        System.out.println("Kode barang " + kodeBarang + " dengan nama barang " + namaBarang + " sedang disiapkan\n");
    }

    public void checking (){
        System.out.println("Barang " + namaBarang + " dengan jumlah " + jumlah + " sedang di check\n");
    }

    public void sending (){
        System.out.println("Barang " + namaBarang + " dengan kategori " + kategori + " telah dikirim\n");
    }

    protected void tagihan(){
        System.out.println("Total tagihan : \nNama barang: " + namaBarang + "\nHarga: " + harga + "\nJumlah: " + jumlah + "\nTagihan: " + (harga*jumlah));
    }
}
