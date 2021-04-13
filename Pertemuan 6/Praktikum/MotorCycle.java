class MotorCycle extends MotorVehicle{
      private int numGear;

      public MotorCycle(){
            super();
            numGear = 0;
      }
      public MotorCycle(double kecepatan, String warna, int SizeEng, String lcPlate){
            super(kecepatan, warna, SizeEng, lcPlate);
            numGear = 0;
      }
      public void setGearFoot(int numGear){
            this.numGear = numGear;
      }
      public int getGearFoot(){
            return numGear;
      }
      @Override
      public void goStraight(){
          System.out.println("Motor Majuuu");
          speed = speed + 30;
      }
}