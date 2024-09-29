import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private List<Estudante> estudantes;

    public Curso(String nome) {
        this.nome = nome;
        this.estudantes = new ArrayList<>();
    }

    public void adicionarEstudante(Estudante estudante) {
        estudantes.add(estudante);
    }

    public void listarEstudantes() {
        System.out.println("Estudantes no curso " + nome + ":");
        for (Estudante estudante : estudantes) {
            System.out.println(estudante.getNome());
        }
    }
}
