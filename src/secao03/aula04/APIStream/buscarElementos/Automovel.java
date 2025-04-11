package secao03.aula04.APIStream.buscarElementos;


class Automovel {
    private String chassi;
    private String modelo;
    private int anoFabricacao;

    public Automovel(String chassi, String modelo, int anoFabricacao) {
        this.chassi = chassi;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    public String getChassi() {
        return chassi;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    @Override
    public String toString() {
        return modelo + " - " + anoFabricacao + " - " + chassi;
    }
}