/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projeto.pkg007;

/**
 *
 * @author guest-D3yr5l
 */
public class Hospedagem {
   private int Cod_hospedagem;
   private int Cod_cliente;
   private int Numero_quarto;
   private float Valor_diaria;   
   private float Valor_total; 

    /**
     * @return the Cod_hospedagem
     */
    public int getCod_hospedagem() {
        return Cod_hospedagem;
    }

    /**
     * @param Cod_hospedagem the Cod_hospedagem to set
     */
    public void setCod_hospedagem(int Cod_hospedagem) {
        this.Cod_hospedagem = Cod_hospedagem;
    }

    /**
     * @return the Cod_cliente
     */
    public int getCod_cliente() {
        return Cod_cliente;
    }

    /**
     * @param Cod_cliente the Cod_cliente to set
     */
    public void setCod_cliente(int Cod_cliente) {
        this.Cod_cliente = Cod_cliente;
    }

    /**
     * @return the Numero_quarto
     */
    public int getNumero_quarto() {
        return Numero_quarto;
    }

    /**
     * @param Numero_quarto the Numero_quarto to set
     */
    public void setNumero_quarto(int Numero_quarto) {
        this.Numero_quarto = Numero_quarto;
    }

    /**
     * @return the Valor_diaria
     */
    public float getValor_diaria() {
        return Valor_diaria;
    }

    /**
     * @param Valor_diaria the Valor_diaria to set
     */
    public void setValor_diaria(float Valor_diaria) {
        this.Valor_diaria = Valor_diaria;
    }
    
    public float getValor_total() {
        return Valor_total;
    }

    /**
     * @param Valor_total the Valor_diaria to set
     */
    public void setValor_total(float Valor_total) {
        this.Valor_total = Valor_total;
    }
}
