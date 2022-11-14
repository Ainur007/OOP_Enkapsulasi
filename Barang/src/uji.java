public class uji extends barang {

    public static void main(String[] args) {

        barang obj = new barang();

        obj.setNama("Pensil");
        System.out.println(obj.getNama());

        obj.setKode(666);
        System.out.println(obj.getKode());

        obj.setHarga(2000);
        System.out.println(obj.getHarga());

        obj.setJumlah(30);
        System.out.println(obj.getJumlah());

        obj.setKategori("Alat Tulis");
        System.out.println(obj.getKategori());

    }

}
