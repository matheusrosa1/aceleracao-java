package secao03.aula03;

public class Application {

    public static void main(String[] args) {
        Laptop laptop = new Laptop("Samsung", 100, 14);
        Desktop desktop = new Desktop("Dell", 500);
        Powerbank powerbank = new Powerbank();

        plugDevice(laptop);
        plugDevice(powerbank);
        checkDevice(laptop);
        checkDevice(desktop);
    }

    public static void checkDevice(ComputerDevice device) {
        System.out.println("Verificando dispositivo de marca " + device.getBrand());
        device.bootUp();
    }

    public static void plugDevice(Chargeable chargeable) {
        System.out.println("A bateria atual é " + chargeable.getBatteryLevel());
        chargeable.charge();
    }
}