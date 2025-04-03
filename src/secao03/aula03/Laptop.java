package secao03.aula03;

public class Laptop extends ComputerDevice implements Chargeable {
    private double size;

    @Override
    public void charge() {
        System.out.println("Carregando laptop");
    }

    @Override
    public int getBatteryLevel() {
        return 85;
    }

    public Laptop(String brand, double storageCapacity, double size) {
        super(brand, storageCapacity);
        this.size = size;
    }

    @Override
    public void bootUp() {
        System.out.println("Inicializando o laptop de tamanho " + size + "...");
    }
}
