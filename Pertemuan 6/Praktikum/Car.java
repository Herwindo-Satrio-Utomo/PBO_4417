class Car extends MotorVehicle{
      private boolean seatBelt;

      public Car(){
            super();
            seatBelt = false;
      }
      public Car(double kecepatan, String warna, int SizeEng, String lcPlate){
            super(kecepatan, warna, SizeEng, lcPlate);
            seatBelt = false;
      }
      public void setSeatBelt(int Belt){
            if (Belt > 0){
                  seatBelt = true;
            }
      }
      public boolean getSeatBelt(){
            return seatBelt;
      }
      public void goStraight(){
            System.out.println("Kendaraan Maju......");
            speed = speed + 30;
      }
}