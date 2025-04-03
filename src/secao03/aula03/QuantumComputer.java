package secao03.aula03;

public abstract class QuantumComputer extends ComputerDevice {

    public QuantumComputer(String brand, double storageCapacity) {
        super(brand, storageCapacity);
    }

    public abstract void quantumComputation();
}