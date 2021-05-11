public class Kelas {
      private String KodeKelas;
      private int JamMulai;
      private int JamSelesai;

      public Kelas(){

      }
      public Kelas(String KodeKelas,int JamMulai,int JamSelesai){
            this.KodeKelas=KodeKelas;
            this.JamMulai=JamMulai;
            this.JamSelesai=JamSelesai;
      }
      public void setKodeKelas(String KodeKelas){
            this.KodeKelas=KodeKelas;
      }
      public String getKodeKelas(){
            return this.KodeKelas;
      }
      public void setJamMulai(int JamMulai){
            this.JamMulai=JamMulai;
      }
      public int getJamMulai(){
            return this.JamMulai;
      }
      public void setJamSelesai(int JamSelesai){
            this.JamSelesai=JamSelesai;
      }
      public int getJamSelesai(){
            return this.JamSelesai;
      }
}
