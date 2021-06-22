import java.util.Date;

public class Main {
    public static void main(String[] args) {
        PeminjamanMember peminjam1 = new PeminjamanMember();
        peminjam1.id = 01;
        peminjam1.nim = 19710001;
        peminjam1.jumlahbuku = 2;
        peminjam1.harga = 20000;
        peminjam1.id_buku = 001;
        peminjam1.nama = "Yanti";
        peminjam1.pegawai = "Asep";
        peminjam1.nama_buku = "Laskar";
        peminjam1.pinjaman = new Date();
        peminjam1.pengembalian = new Date();

        SubPeminjamanMember peminjambsa1 = new SubPeminjamanMember();
        peminjambsa1.kode_buku = 01;
        peminjambsa1.kode_peminjam = 001;
        peminjambsa1.tgl_pinjam = new Date();
        peminjambsa1.tgl_pengembalian = new Date();
        peminjambsa1.namapeminjam = "Saha";
        peminjambsa1.no_telp = "081224234576";
        peminjambsa1.alamat = "Amuntai";

        peminjam1.tampilkaninfopeminjam();
        peminjam1.tampilkaninfopeminjam();
        peminjam1.tampilkaninfopeminjam();
        peminjam1.tampilkaninfopeminjam();
        peminjam1.tampilkaninfopeminjam();
        peminjam1.tampilkaninfopeminjam();
        peminjambsa1.meminjambukuberjangkawaktu();
        peminjambsa1.mengembalikanbukuberjangkawaktu();

    }
}
