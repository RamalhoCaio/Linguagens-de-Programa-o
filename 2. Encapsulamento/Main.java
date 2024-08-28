public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe Pessoa
        Pessoa pessoa = new Pessoa("João", 25);

        // Acessando atributos através de métodos getters
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());

        // Alterando atributos através de métodos setters
        pessoa.setNome("Maria");
        pessoa.setIdade(30);

        // Exibindo as informações atualizadas
        pessoa.exibirInformacoes();
    }
}
