package Java;
class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        UberX uberX = new UberX("AMQ123", new Account(23, "Juan Hector", "HEC123", "EXAMPLE@gmail.com", "Contraseña originl"), "chevrolet", "sonic");
        uberX.setPassenger(3);
        uberX.printDataCar();
        
        /*Car car2 = new Car("PER432", new Account(23, "Juan Hector", "HEC123", "EXAMPLE@gmail.com", "Contraseña originl"));
        car2.passenger = 3;
        car2.printDataCar();*/

        /*User user = new User(new Account(23, "Juan Hector", "HEC123", "EXAMPLE@gmail.com", "Contraseña originl"));*/
    }
}