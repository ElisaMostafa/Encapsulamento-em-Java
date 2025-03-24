
package projetojava;
import javax.swing.JOptionPane;

public class ProjetoJava {

    
    public static void main(String[] args) {
       
       //Projeto para cadastrar e exibir dados onde os atributos sejam em parte públicos e em parte privados (encapsulamento)
        
        Produto product = new Produto("Teclado",0,0,0);
        
        
        String nome = JOptionPane.showInputDialog("Digite o nome do produto: ");
   
        product.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto: ")));
        product.setVendido(Integer.parseInt(JOptionPane.showInputDialog("Quantidade de produto vendido: ")));
        product.setEstoque(Integer.parseInt(JOptionPane.showInputDialog("Quantidade em estoque: ")));
        
        
        
        product.Exibir();
        
    }
    
}
