
package projetojava;

import javax.swing.JOptionPane;


public class Produto {
    public int id;
    private String nome;
    public double preco;
    private int estoque;
    private int vendido;
    
    // Construtor
    public Produto(String Nome, double Preco, int Estoque, int Vendido) {
        this.nome = Nome;
        this.preco = Preco;
        this.estoque = Estoque;
        this.vendido = Vendido;
       
    }
    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    
    public int getVendido() {
        return vendido;
    }

    public void setVendido(int vendido) {
        this.vendido = vendido;
    }
    
    public void Exibir() {
       JOptionPane.showMessageDialog(null,
               "nome: "+this.nome+
               "\npreço: "+this.preco+
               "\nQuantidade em estoque: "+this.estoque+
               "\nVendido: "+this.vendido+
               "\nid"+this.id);
   }
    
}
