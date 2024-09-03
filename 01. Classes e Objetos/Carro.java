public class Carro {
    private String modelo;
    private int ano;
    private double quilometragem;

    // Construtor
    public Carro(String modelo, int ano, double quilometragem) {
        this.modelo = modelo;
        this.ano = ano;
        this.quilometragem = quilometragem;
    }

    // Método para exibir informações do carro
    public String obterInfo() {
        return "Modelo: " + modelo + ", Ano: " + ano + ", Quilometragem: " + quilometragem + " km";
    }

    // Método para atualizar a quilometragem
    public void atualizarQuilometragem(double quilometragem) {
        if (quilometragem > this.quilometragem) {
            this.quilometragem = quilometragem;
        } else {
            System.out.println("A quilometragem não pode ser menor que a atual.");
        }
    }

    // Métodos
    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public double getQuilometragem() {
        return quilometragem;
    }
}