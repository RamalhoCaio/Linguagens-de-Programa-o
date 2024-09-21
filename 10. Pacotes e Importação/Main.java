import java.util.Scanner; // importa a classe Scanner do pacote java.util

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    String username;
    
    // Digitar o nome de usuario
    System.out.println("Digite o nome de usuario:"); 
    username = myObj.nextLine();   
       
    System.out.println("Nome de usuario: " + username);        
  }
}
