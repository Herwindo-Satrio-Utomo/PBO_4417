public class testrun {
      public static void main(String[] args) {
            Mahasiswa mhs = new Mahasiswa();
            MataKuliah satu = new MataKuliah();

            mhs.setNama("Herwindo");
            mhs.setNim("A11.2019.12302");
            mhs.setMatkul(satu);
            mhs.setNilai(80);
            System.out.println("Nama:"+mhs.getNama()+"\n"+"Nim:"+mhs.getNim()+"\n"+"Mata Kuliah : "+satu.getMatkul()+"\n"+"Nilai : "+mhs.getNilai());
      }
}
