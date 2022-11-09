import java.time.LocalDate;

public class mainApp {
    public static void main(String[]args){

        pegawai p1 =new pegawai("P01", "Junaidi",2, LocalDate.of(2002, 01,10));
        p1.printpegawai();


        Dosen p2 =new Dosen ("P02", "Lalu Ari", 1, LocalDate.of(1979, 10, 17), "8888");
        p2.printPegawai();


        NonDosen p3 =new NonDosen("P03", "Rino Martin", 1, LocalDate.of(2001, 04, 10));
        p3.printPegawai();
    }
}
