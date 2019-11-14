package Latihan1;



public class AeroPlan extends vehicle{
    public void walk(){
        System.out.println("Aeroplan is Flying");
    }
    public void fuel(){
        System.out.println("avtur");
    }
    public static void main(String[] args) {
        AeroPlan angga = new AeroPlan();
        angga.function();
        angga.fuel();
        angga.walk();
    }
}
