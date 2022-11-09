import java.time.LocalDate;

public class NonDosen extends pegawai{

    NonDosen(String id, String nama, int gol, LocalDate tglLahir){
        super(id, nama, gol, tglLahir);
    }

    long hitungtunjPegawai(){
        long tunjPegawai = 1000000;
        return tunjPegawai;
    }

    long hitungTotalGaji(){
        long total = this.hitungGapok() + this.hitungtunjPegawai();
        return total;
    }

    void printPegawai(){
        System.out.println("ID Pegawai          : " + this.idPegawai);
        System.out.println("Nama Pegawai        : " + this.nama);
        System.out.println("Golongan            : " + this.gol);
        System.out.println("Tgl Lahir           : " + this.tglLahir);
        System.out.println("Usia                : " + this.hitungUsia() + " tahun");
        System.out.println("Gaji Pokok          : Rp " + this.hitungGapok());
        System.out.println("Tunj Pegawai        : Rp " + this.hitungtunjPegawai());
        System.out.println("Total Gaji          : Rp " + this.hitungTotalGaji());
    }
}
