public class Main {
    public static void main(String[] args) {
        // Usando o construtor padrão
        Carro carro1 = new Carro();
        carro1.exibirInfo();

        // Usando o construtor parametrizado
        Carro carro2 = new Carro("Fusca", 1972);
        carro2.exibirInfo();
    }
}