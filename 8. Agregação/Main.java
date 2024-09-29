public class Main {
    public static void main(String[] args) {
        // Criando estudantes
        Estudante estudante1 = new Estudante("Alice");
        Estudante estudante2 = new Estudante("Bob");

        // Criando um curso e adicionando estudantes
        Curso cursoJava = new Curso("Curso de Java");
        cursoJava.adicionarEstudante(estudante1);
        cursoJava.adicionarEstudante(estudante2);

        // Listando estudantes do curso
        cursoJava.listarEstudantes();
    }
}
