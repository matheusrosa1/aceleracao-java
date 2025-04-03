package secao03.aula01.exercicios;

/**
 * The type Carro.
 */
public class Carro {
    private String marca;
    private String modelo;
    private static int contador = 0;


    private int ano;

    /**
     * Instantiates a new Carro.
     *
     * @param marca  the marca
     * @param modelo the modelo
     * @param ano    the ano
     */
    public Carro(String marca, String modelo, int ano) {

        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        Carro.contador++; // Incrementa o contador a cada carro criado
    }

    /**
     * Exibir informacoes.
     */
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano);
    }

    /**
     * Gets ano.
     *
     * @return the ano
     */
    public int getAno() {
        return ano;
    }


    /**
     * Gets modelo.
     *
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Gets marca.
     *
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Sets marca.
     *
     * @param marca the marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Sets modelo.
     *
     * @param modelo the modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Sets ano.
     *
     * @param ano the ano
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * Quantidade de carros int.
     *
     * @return the int
     */
    public static int quantidadeDeCarros() {
        return contador;
    }
}
