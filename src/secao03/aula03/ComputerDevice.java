package secao03.aula03;

public abstract class ComputerDevice {
    private String brand;
    private double storageCapacity;

    public ComputerDevice(String brand, double storageCapacity) {
        this.brand = brand;
        this.storageCapacity = storageCapacity;
    }

    public String getBrand() {
        return brand;
    }

    public double getStorageCapacity() {
        return storageCapacity;
    }

    public abstract void bootUp();
}
