public class Main {
    public static void main(String[] args) {
        // Cria um objeto da classe Carro
        Carro meuCarro = new Carro("Fusca", 1974, 120000);

        // Exibe informações do carro
        System.out.println("Informações do carro:");
        System.out.println(meuCarro.obterInfo());

        // Atualiza a quilometragem
        meuCarro.atualizarQuilometragem(125000);

        // Exibe as informações atualizadas
        System.out.println("\nApós atualização:");
        System.out.println(meuCarro.obterInfo());
    }
}
