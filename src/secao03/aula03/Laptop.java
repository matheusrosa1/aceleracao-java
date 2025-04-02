package secao03.aula03;

public class Laptop extends ComputerDevice {
    private double size;

    public Laptop(String brand, double storageCapacity, double size) {
        super(brand, storageCapacity);
        this.size = size;
    }

    @Override
    public void bootUp() {
        System.out.println("Inicializando o laptop de tamanho " + size + "...");
    }
}
