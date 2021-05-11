import java.util.ArrayList;

public class MataKuliah {
      String NamaMatkul;
      String KodeMatkul;
      private ArrayList<Kelas> DftrKelas = new ArrayList<Kelas>();
      private String Nilai;

      public MataKuliah(){

      }
      public MataKuliah(String NamaMatkul,String KodeMatkul,ArrayList DftrKelas,String Nilai){
            this.NamaMatkul=NamaMatkul;
            this.KodeMatkul=KodeMatkul;
            this.DftrKelas=DftrKelas;
            this.Nilai=Nilai;
      }
      public void setNamaMatkul(String NamaMatkul){
            this.NamaMatkul=NamaMatkul;
      }
      public String getNamaMatkul(){
            return this.NamaMatkul;
      }
      public void setKodeMatkul(String KodeMatkul){
            this.KodeMatkul=KodeMatkul;
      }
      public String getKodeMatkul(){
            return this.KodeMatkul;
      }
      public void setDftrKelas(ArrayList DftrKelas){
            this.DftrKelas=DftrKelas;
      }
      public ArrayList getDftrKelas(){
            return this.DftrKelas;
      }
      public void setNilai(String Nilai){
            this.Nilai=Nilai;
      }
      public String getNilai(){
            return this.Nilai;
      }
      public void addKelas(Kelas Kls){
            DftrKelas.add(Kls);
      }
}
