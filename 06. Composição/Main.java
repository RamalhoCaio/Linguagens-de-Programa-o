public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor("1.0");  //definindo "motor"
        Carro carro = new Carro("Kwid branco", motor); //Instanciando o carro sendo composto com o elemento "motor" definido acima

        carro.ligarCarro();  // Metodo para usar as classes
    }
}
