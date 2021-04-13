public class Uji_Kendaraan {
      public static void main (String [] args){
      Vehicle kendaraan = new Vehicle();
      System.out.println("Kendaraan tanpa parameter ");
      System.out.println("Kecepatan Kendaraan : "+kendaraan.speed);
      System.out.println("Warna Kendaraan : "+ kendaraan.color+"\n");

      Bicycle sepeda = new Bicycle(4.0,"Putih");
      System.out.println("Sepeda tanpa parameter");
      System.out.println("Kecepatan Sepeda : "+sepeda.speed);
	sepeda.ringBell();
      sepeda.turnRight();
      System.out.println("Warna Sepeda : "+ sepeda.color);
      sepeda.ringBell();
      sepeda.turnRight();

      MotorVehicle motor = new MotorVehicle(3.0,"Hitam",250, "H 41 SYG");
      System.out.println("\nKendaraan Bermotor 1 dengan parameter");
      System.out.println("Kapasitas Mesin  : "+motor.getSizeOfEngine()+" cc");
      System.out.println("Plat Nomor Motor : "+motor.getLicencePlate());
      System.out.println("Warna Motor : "+motor.color);
      motor.turnLeft();

      MotorVehicle motor2 = new MotorVehicle();
      System.out.println("\nKendaraan Bermotor 2 dengan parameter");
      System.out.println("Warna Motor : "+motor2.color);
      System.out.println("Kapasitas Mesin  : "+motor2.getSizeOfEngine());
      System.out.println("Plat Nomor Motor : "+motor2.getLicencePlate());

      Car mobil = new Car();
      mobil.goStraight();

      System.out.println("\nMelajukan Kendaraan: ");
      KendaraanMelaju(kendaraan);

      System.out.println("Melajukan Sepeda: ");
      KendaraanMelaju(sepeda);

      System.out.println("Melajukan Kendaraan Bermotor 1: ");
      KendaraanMelaju(motor);

      System.out.println("Melajukan Kendaraan Bermotor 2: ");
      KendaraanMelaju(motor2);

      System.out.println("Melajukan Mobil: ");
      KendaraanMelaju(mobil);

      }
      public static void KendaraanMelaju(Vehicle kendaraan){
            kendaraan.goStraight();
            System.out.println("Kecepatan baru : " +kendaraan.speed+" km / jam");
      }
}