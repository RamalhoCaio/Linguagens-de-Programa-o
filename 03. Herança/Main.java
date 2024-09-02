// Classe principal para teste
public class Main {
    public static void main(String[] args) {
        // Criação de um objeto da classe Cachorro
        Cachorro meuCachorro = new Cachorro("Rex");

        // Chamada de métodos
        meuCachorro.fazerSom(); // Este método foi sobreposto na subclasse
        meuCachorro.farejar();   // Método específico da subclasse

        // Exibindo o nome do cachorro (herdado da superclasse)
        System.out.println("Nome do cachorro: " + meuCachorro.nome);
    }
}
