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
        peminjam1.meminjambuku();
        peminjam1.mengembalikanbuku();
        peminjam1.membelibuku();
        peminjam1.tampilkaninfopeminjam();
        peminjam1.tampilkaninfopeminjam();
        peminjambsa1.meminjambukuberjangkawaktu();
        peminjambsa1.mengembalikanbukuberjangkawaktu();

        //Construc1
        PeminjamanMember a1_objct = new PeminjamanMember(02,19710002,2,20000,002,"Ari","Huja","Ari Hujan", new Date(), new Date());
        a1_objct.tampilkaninfopeminjam();
        a1_objct.meminjambuku();
        a1_objct.mengembalikanbuku();
        a1_objct.membelibuku();

        PeminjamanMember a2_objct = new PeminjamanMember(03,19710003,3,20000,003,"Aris","Hujar","Ari Hujan Basah", new Date(), new Date());
        a2_objct.tampilkaninfopeminjam();
        a2_objct.meminjambuku();
        a2_objct.mengembalikanbuku();
        a2_objct.membelibuku();

        //Construc2
        PeminjamanMember a3_objct = new PeminjamanMember(04,19710004,4,20000,004,"Arif","Hujaf","Ari Hujan Dingin");
        a3_objct.meminjambuku();
        a3_objct.mengembalikanbuku();

        PeminjamanMember a4_objct = new PeminjamanMember(05,19710003,5,20000,005,"Ariv","Hujag","Ari Hujan Deras");
        a4_objct.meminjambuku();
        a4_objct.mengembalikanbuku();

        //Construc3
        PeminjamanMember a5_objct = new PeminjamanMember(001,19710001,01,"Haris");
        a5_objct.membelibuku();

        PeminjamanMember a6_objct = new PeminjamanMember(002,19710002,02,"Haris");
        a6_objct.membelibuku();
    }
}
