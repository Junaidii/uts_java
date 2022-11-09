import java.time.LocalDate;

public class Dosen extends pegawai{

    String nidn;

    Dosen( String id, String nama, int gol, LocalDate TglLahir, String nidn){
        super(id, nama, gol, TglLahir);
        this.nidn = nidn;
    }
    long hitungtunjPegawai(){
        long tunjPegawai = 1500000;
        return tunjPegawai;
    }

    long hitungTunjFungsional(){
        long tunjFungsional;
        if (this.hitungUsia() < 40 ){
            tunjFungsional = 1700000;
        } else{
            tunjFungsional = 2000000;
        }

        return tunjFungsional;
    }

    long hitungTotalGaji(){
        long total = this.hitungGapok() + this.hitungtunjPegawai() + this.hitungTunjFungsional();
        return total;
    }

    void printPegawai(){
        System.out.println("ID Pegawai      : " + this.idPegawai);
        System.out.println("Nama Pegawai    : " + this.nama);
        System.out.println("Golongan        : " + this.gol);
        System.out.println("Tgl Lahir       : " + this.tglLahir);
        System.out.println("NIDN            : " + this.nidn);
        System.out.println("Usia            : " + this.hitungUsia() + " tahun");
        System.out.println("Gaji Pokok      : Rp " + this.hitungGapok());
        System.out.println("Tunj Pegawai    : Rp " + this.hitungtunjPegawai());
        System.out.println("Tunj Fungsi     : Rp " + this.hitungTunjFungsional());
        System.out.println("Total Gaji      : Rp " + this.hitungTotalGaji());
    }

}
