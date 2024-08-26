class Programador extends Funcionario{
 int bonus = 10000;
 public static void main(String args[]){  
   Programador p = new Programador();
   System.out.println("Salario do programador:" + p.salario);
   System.out.println("Bonus do programador:" + p.bonus);
 }  
}  

class Funcionario{  
 float salario = 40000;  
}  
