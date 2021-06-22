import java.util.Date;

public class PeminjamanMember {
    int id;
    int nim;
    int jumlahbuku;
    int harga;
    int id_buku;
    String nama;
    String pegawai;
    String nama_buku;
    Date pinjaman;
    Date pengembalian;

    public void tampilkaninfopeminjam(){
        System.out.println("ID Peminjam :"+id);
        System.out.println("NIM Peminjam :"+nim);
        System.out.println("Nama Peminjam :"+nama);
    }
    public void meminjambuku(){
        System.out.println("ID buku :"+id_buku);
        System.out.println("Nama buku :"+nama_buku);
        System.out.println("Pinjam buku :"+pinjaman);
        System.out.println("Jumlah buku :"+jumlahbuku);
    }
    public void mengembalikanbuku(){
        System.out.println("ID buku :"+id_buku);
        System.out.println("Nama buku :"+nama_buku);
        System.out.println("Pengembalian buku :"+pengembalian);
        System.out.println("Jumlah buku :"+jumlahbuku);
    }
    public void membelibuku(){
        System.out.println("ID buku :"+id_buku);
        System.out.println("Nama buku :"+nama_buku);
        System.out.println("Harga buku :"+harga);
        System.out.println("jumlah buku :"+jumlahbuku);
    }
}
