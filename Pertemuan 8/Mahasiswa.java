import java.util.ArrayList;

public class Mahasiswa {
      private String Nama;
      private String Nim;
      private ArrayList<MataKuliah> Matkul = new ArrayList<MataKuliah>();
      private int Nilai;

      public Mahasiswa(){

      }
      public Mahasiswa(String Nama,String Nim, ArrayList Matkul, int Nilai){
            this.Nama = Nama;
            this.Nim = Nim;
            this.Matkul = Matkul;
            this.Nilai = Nilai;
      }
      public void setNama(String Nama){
            this.Nama = Nama;
      }
      public String getNama(){
            return this.Nama;
      }
      public void setNim(String Nim){
            this.Nim = Nim;
      }
      public String getNim(){
            return this.Nim;
      }
      public void setMatkul(ArrayList Matkul){
            this.Matkul = Matkul;
      }
      public ArrayList getMatkul(){
            return this.Matkul;
      }
      public void setNilai(int Nilai){
            this.Nilai = Nilai;
      }
      public int getNilai(){
            return this.Nilai;
      }
}
