import java.util.Scanner; // importa a classe Scanner

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    String userName;
    
    // Digitar o nome de usuario
    System.out.println("Digite o nome de usuario:"); 
    userName = myObj.nextLine();   
       
    System.out.println("Username is: " + userName);        
  }
}
