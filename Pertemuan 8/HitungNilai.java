import jdk.tools.jlink.resources.plugins;
public class HitungNilai {
      private Mahasiswa Mhs;
      private int Rata;

      public HitungNilai(){

      }
      public HitungNilai(Mahasiswa Mhs,int Rata){
            this.Mhs=Mhs;
            this.Rata=Rata;
      }
      public void setMhs(Mahasiswa Mhs){
            this.Mhs=Mhs;
      }
      public Mahasiswa getMhs(){
            return this.Mhs;
      }
      public void setRata(int Rata){
            this.Rata=Rata;
      }
      public int getRata(){
            return this.Rata;
      }
}
