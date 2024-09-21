public class Main {
    public static void main(String[] args) {
        Animal meuCachorro = new Cachorro("Rex");
        Animal meuGato = new Gato("Tom");

        System.out.println(meuCachorro.emitirSom());  // Rex diz: Au au!
        System.out.println(meuGato.emitirSom());      // Tom diz: Miau!
    }
}
