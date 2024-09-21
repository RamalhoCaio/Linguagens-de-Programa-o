public class Carro {
    private String modelo;
    private Motor motor;

    // Composição: o Carro "tem um" Motor
    public Carro(String modelo, Motor motor) {
        this.modelo = modelo;
        this.motor = motor;
    }

    public void ligarCarro() {
        System.out.println("Ligando o  " + modelo);
        motor.ligarMotor(); // Usando o motor
    }
}
