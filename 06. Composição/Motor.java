public class Motor {
    private String tipo;

    public Motor(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void ligarMotor() {
        System.out.println("Motor " + tipo + " está ligado.");
    }
}
