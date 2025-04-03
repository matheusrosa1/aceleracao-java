package secao03.aula03;

public class Powerbank implements Chargeable {
    @Override
    public void charge() {
        System.out.println("Carregando o powerbank...");
    }

    @Override
    public int getBatteryLevel() {
        return 65;
    }
}
