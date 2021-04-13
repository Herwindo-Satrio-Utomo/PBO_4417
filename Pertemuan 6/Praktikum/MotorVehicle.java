class MotorVehicle extends Vehicle{
      int SizeOfEngine;
      String LincencePlate;
      
      public MotorVehicle(){
            super();
            SizeOfEngine = 1;
            LincencePlate = "H 41 NDO";
      }
      public MotorVehicle(double kecepatan, String warna, int SizeEng, String lcPlate){
            super(kecepatan, warna);
            SizeOfEngine = SizeEng;
            LincencePlate = lcPlate;
      }
      public int getSizeOfEngine(){
            return SizeOfEngine;
      }
      public String getLicencePlate(){
            return LincencePlate;
      }
      public void goStraight(){
            System.out.println("Kendaraan Mesin Majuuu");
            speed = speed + 20;
      }
}