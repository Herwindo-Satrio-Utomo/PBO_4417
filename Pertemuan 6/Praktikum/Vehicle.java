class Vehicle {
      double speed;
      String color;

      public Vehicle () {
            speed = 0;
            color = "Orange";
      }
      public Vehicle(double kecepatan, String warna){
            speed = kecepatan;
            color = warna;
      }
      public void goStraight(){
            System.out.println("Majuuu");
            speed = speed + 15;
      }
      public void turnLeft(){
            System.out.println ("Belok Kiri !");
      }
      public void turnRight(){
            System.out.println ("Belok Kanan !");
      }
}