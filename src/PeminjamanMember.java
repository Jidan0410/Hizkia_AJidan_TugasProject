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

    public PeminjamanMember() {
    }

    public PeminjamanMember(int id, int nim, int jumlahbuku, int harga, int id_buku, String nama, String pegawai, String nama_buku, Date pinjaman, Date pengembalian) {
        this.id = id;
        this.nim = nim;
        this.jumlahbuku = jumlahbuku;
        this.harga = harga;
        this.id_buku = id_buku;
        this.nama = nama;
        this.pegawai = pegawai;
        this.nama_buku = nama_buku;
        this.pinjaman = pinjaman;
        this.pengembalian = pengembalian;
    }

    public PeminjamanMember(int id, int nim, int jumlahbuku, int harga, int id_buku, String nama, String pegawai, String nama_buku) {
        this.id = id;
        this.nim = nim;
        this.jumlahbuku = jumlahbuku;
        this.harga = harga;
        this.id_buku = id_buku;
        this.nama = nama;
        this.pegawai = pegawai;
        this.nama_buku = nama_buku;
    }

    public PeminjamanMember(int id, int nim, int id_buku, String nama) {
        this.id = id;
        this.nim = nim;
        this.id_buku = id_buku;
        this.nama = nama;
    }

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
