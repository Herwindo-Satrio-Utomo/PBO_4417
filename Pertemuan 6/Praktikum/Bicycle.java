class Bicycle extends Vehicle {
      public Bicycle(){
            super();
      }
      public Bicycle(double kecepatan, String warna){
            super(kecepatan,warna);
      }
      public void ringBell(){
            System.out.println("Kring...Kring...");
      }
      public void goStraight(){
            System.out.println("Sepeda Majuuu");
            speed = speed + 15;
      }
}