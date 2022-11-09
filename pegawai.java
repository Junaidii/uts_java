import java.time.LocalDate;
import java.time.Period;

public class pegawai {

    String idPegawai;
    String nama;
    int gol;
    LocalDate tglLahir;

    pegawai(String id, String nama, int gol, LocalDate tglLahir){

        this.idPegawai = id;
        this.nama = nama;
        this.gol = gol;
        this.tglLahir = tglLahir;
    }

    int hitungUsia(){

        LocalDate today = LocalDate.now();

        Period selisih = Period.between(this.tglLahir, today);
        return selisih.getYears();
    }

    long hitungGapok(){
        long gapok = 0;
        if (this.gol == 1){
            if (this.hitungUsia() < 40 ){
                gapok = 3500000;
            } else {
                gapok = 4500000;
            }
        } else if (this.gol == 2){
            if (this.hitungUsia() < 40 ){
                gapok = 5000000;
            } else{
                gapok = 6000000;
            }
        }
        return gapok;
    }

    void printpegawai(){

        System.out.println("ID Pegawai          : " + this.idPegawai);
        System.out.println("Nama Pegawai        : " + this.nama);
        System.out.println("Golongan            : " + this.gol);
        System.out.println("Tgl Lahir           : " + this.tglLahir);
        System.out.println("Gaji Pokok          : Rp " + this.hitungGapok());
    }

}
