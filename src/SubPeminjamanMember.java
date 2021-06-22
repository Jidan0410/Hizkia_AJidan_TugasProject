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
}
