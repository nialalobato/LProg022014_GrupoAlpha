/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projeto.pkg007;


public class Frigobar {
   private int Cod_produto;
   private String Nome_produto;
   private float Valor_produto;
   private int Quantidade_produto;


    public int getCod_produto() {
        return Cod_produto;
    }


    public void setCod_produto(int Cod_produto) {
        this.Cod_produto = Cod_produto;
    }

   
    public String getNome_produto() {
        return Nome_produto;
    }


    public void setNome_produto(String Nome_produto) {
        this.Nome_produto = Nome_produto;
    }

    
    public float getValor_produto() {
        return Valor_produto;
    }

    
    public void setValor_produto(float Valor_produto) {
        this.Valor_produto = Valor_produto;
    }
    
    
    public float getQuantidade_produto() {
        return Quantidade_produto;
    }

    
    public void setQuantidade_produto(int Quantidade_produto) {
        this.Quantidade_produto = Quantidade_produto;
    }
     
}
