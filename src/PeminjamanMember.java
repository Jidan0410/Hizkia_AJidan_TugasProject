import java.util.Date;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public int getJumlahbuku() {
        return jumlahbuku;
    }

    public void setJumlahbuku(int jumlahbuku) {
        this.jumlahbuku = jumlahbuku;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getId_buku() {
        return id_buku;
    }

    public void setId_buku(int id_buku) {
        this.id_buku = id_buku;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPegawai() {
        return pegawai;
    }

    public void setPegawai(String pegawai) {
        this.pegawai = pegawai;
    }

    public String getNama_buku() {
        return nama_buku;
    }

    public void setNama_buku(String nama_buku) {
        this.nama_buku = nama_buku;
    }

    public Date getPinjaman() {
        return pinjaman;
    }

    public void setPinjaman(Date pinjaman) {
        this.pinjaman = pinjaman;
    }

    public Date getPengembalian() {
        return pengembalian;
    }

    public void setPengembalian(Date pengembalian) {
        this.pengembalian = pengembalian;
    }
}
