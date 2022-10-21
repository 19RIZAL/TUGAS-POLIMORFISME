public class Codeternity {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();

        vehicle.info();
        car.info();
    }
}

class Vehicle {
    public void info() {
        System.out.println("ini adalah sebuah mobil");
    }
}

class Car extends Vehicle {
    public void info() {
        System.out.println("mobil ini melaju dengan kecepatan 80 km");
    }
}