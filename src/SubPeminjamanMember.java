import java.util.Date;

public class SubPeminjamanMember extends PeminjamanMember {
    int kode_buku;
    int kode_peminjam;
    Date tgl_pinjam;
    Date tgl_pengembalian;
    String namapeminjam;
    String no_telp;
    String alamat;

    public void meminjambukuberjangkawaktu(){
        System.out.println("Kode Buku Dipinjam :"+kode_buku);
        System.out.println("Tanggal Meminjam :"+tgl_pinjam);
        System.out.println("Kode Peminjam Biasa :"+kode_peminjam);
        System.out.println("Nama Peminjam :"+namapeminjam);
        System.out.println("No Telepon Peminjam :"+no_telp);
        System.out.println("Alamat Peminjam :"+alamat);
    }
    public void mengembalikanbukuberjangkawaktu(){
        System.out.println("Kode Buku Dipinjam :"+kode_buku);
        System.out.println("Tanggal Mengembalikan :"+tgl_pengembalian);
        System.out.println("Kode Peminjam Biasa :"+kode_peminjam);
        System.out.println("Nama Peminjam :"+namapeminjam);
        System.out.println("No Telepon Peminjam :"+no_telp);
        System.out.println("Alamat Peminjam :"+alamat);
    }

    public int getKode_buku() {
        return kode_buku;
    }

    public void setKode_buku(int kode_buku) {
        this.kode_buku = kode_buku;
    }

    public int getKode_peminjam() {
        return kode_peminjam;
    }

    public void setKode_peminjam(int kode_peminjam) {
        this.kode_peminjam = kode_peminjam;
    }

    public Date getTgl_pinjam() {
        return tgl_pinjam;
    }

    public void setTgl_pinjam(Date tgl_pinjam) {
        this.tgl_pinjam = tgl_pinjam;
    }

    public Date getTgl_pengembalian() {
        return tgl_pengembalian;
    }

    public void setTgl_pengembalian(Date tgl_pengembalian) {
        this.tgl_pengembalian = tgl_pengembalian;
    }

    public String getNamapeminjam() {
        return namapeminjam;
    }

    public void setNamapeminjam(String namapeminjam) {
        this.namapeminjam = namapeminjam;
    }

    public String getNo_telp() {
        return no_telp;
    }

    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
