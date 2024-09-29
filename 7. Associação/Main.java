public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua das Flores", "São Paulo");
        Pessoa pessoa = new Pessoa("João", endereco);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Endereço: " + pessoa.getEndereco().getRua() + ", " + pessoa.getEndereco().getCidade());
    }
}