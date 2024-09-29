class Carro {
    String modelo;
    int ano;

    // Construtor padrão
    public Carro() {
        modelo = "Desconhecido";
        ano = 0;
    }

    // Construtor parametrizado
    public Carro(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    public void exibirInfo() {
        System.out.println("Modelo: " + modelo + ", Ano: " + ano);
    }
}