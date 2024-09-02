// Classe Subclasse que herda de Animal
public class Cachorro extends Animal {
    // Construtor da subclasse
    public Cachorro(String nome) {
        super(nome); // Chama o construtor da superclasse
    }

    // Método da subclasse que sobrepõe o método da superclasse
    @Override
    public void fazerSom() {
        System.out.println("O cachorro late");
    }

    // Método adicional da subclasse
    public void farejar() {
        System.out.println("O cachorro está farejando");
    }
}
