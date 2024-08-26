public class Main {
  public static void main(String args[]) {

    try {

      System.out.println("Bloco try");

      // Codigo divide por zero
      int data = 25 / 0;
      System.out.println(data);
    }

      // Captura exceção aritmetica
      // Imprime a mensagem de erro
    catch (ArithmeticException e) {
      System.out.println(e);
    }

    finally {
      System.out.println("\nBloco finally");
    }

    System.out.println("\nResto do codigo...");
  }
}
