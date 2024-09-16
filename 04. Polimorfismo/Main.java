public class Main {
    public static void main(String[] args) {
        // Instanciando as classes
        Animal minhaArara = new Arara();
        Animal minhaCobra = new Cobra();

        // Chama o método sobrescrito nas subclasses
        minhaArara.fazerSom();     //A arara faz: PruPru!
        minhaCobra.fazerSom();     //A cobra faz o barulho: Sssss!
    }
}
