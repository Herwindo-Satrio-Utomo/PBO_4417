import java.util.ArrayList;

public class Dosen {
      private String Nama;
      private String NIP;
      private MataKuliah Matkul;
      private Kelas Kelas;

      public Dosen(){

      }
      public Dosen(String Nama,String NIP,MataKuliah Matkul,Kelas Kelas){
            this.Nama=Nama;
            this.NIP=NIP;
            this.Matkul=Matkul;
            this.Kelas=Kelas;
      }
      public void setNama(String Nama){
            this.Nama = Nama;
      }
      public String getNama(){
            return this.Nama;
      }
      public void setNIP(String NIP){
            this.NIP = NIP;
      }
      public String getNIP(){
            return this.NIP;
      }
      public void setMatkul(MataKuliah Matkul){
            this.Matkul = Matkul;
      }
      public MataKuliah getMatkul(){
            return this.Matkul;
      }
      public void setKelas(Kelas Kelas){
            this.Kelas = Kelas;
      }
      public Kelas getKelas(){
            return this.Kelas;
      }
}
