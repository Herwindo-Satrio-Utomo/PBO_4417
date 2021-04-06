class Vehicle {
      double speed = 0;
      String color = "Orange";

      public Vehicle () {

      }
      public void goStraight(){
            System.out.println ("Maju......");
      }
      public void turnLeft(){
            System.out.println ("Belok Kiri !");
      }
      public void turnRight(){
            System.out.println ("Belok Kanan !");
      }
}
class Bicycle extends Vehicle {
      public Bicycle(){

      }
      public void ringBell(){
            System.out.println("Kring...Kring...");
      }
}
class MotorVehicle extends Vehicle{
      int SizeOfEngine = 1 ;
      String LincencePlate = "H 41 NDO";
      
      public MotorVehicle(){

      }
      public MotorVehicle(int SizeEng, String lcPlate){
            this.SizeOfEngine = SizeEng;
            this.LincencePlate = lcPlate;
      }
      public int getSizeOfEngine(){
            return this.SizeOfEngine;
      }
      public String getLicencePlate(){
            return this.LincencePlate;
      }
}
public class Uji_Kendaraan {
      public static void main (String [] args){
      Vehicle kendaraan = new Vehicle();
      System.out.println("Kecepatan Kendaraan : "+kendaraan.speed);
      System.out.println("Warna Kendaraan : "+ kendaraan.color+"\n");

      Bicycle sepeda = new Bicycle();
      System.out.println("Kecepatan Sepeda : "+sepeda.speed);
	sepeda.ringBell();
      sepeda.turnRight();
      System.out.println("Warna Sepeda : "+ sepeda.color);
      sepeda.ringBell();
      sepeda.turnLeft();

      MotorVehicle motor = new MotorVehicle(1500, "H 41 SYG");
      System.out.println("\nKapasitas Mesin  : "+motor.getSizeOfEngine()+" cc");
      System.out.println("Plat Nomor Motor : "+motor.getLicencePlate());
      System.out.println("Warna Motor : "+motor.color);
      motor.turnLeft();
      motor.goStraight();
      }
}