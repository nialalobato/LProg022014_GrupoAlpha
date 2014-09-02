

package projeto.pkg007;


public class Hospedagem {
   private int Cod_hospedagem;
   private int Cod_cliente;
   private int Numero_quarto;
   private float Valor_diaria;   
   private float Valor_total; 

    
    public int getCod_hospedagem() {
        return Cod_hospedagem;
    }

   
    public void setCod_hospedagem(int Cod_hospedagem) {
        this.Cod_hospedagem = Cod_hospedagem;
    }

   
    public int getCod_cliente() {
        return Cod_cliente;
    }

    
    public void setCod_cliente(int Cod_cliente) {
        this.Cod_cliente = Cod_cliente;
    }

    
    public int getNumero_quarto() {
        return Numero_quarto;
    }

    
    public void setNumero_quarto(int Numero_quarto) {
        this.Numero_quarto = Numero_quarto;
    }

    
    public float getValor_diaria() {
        return Valor_diaria;
    }

    
    public void setValor_diaria(float Valor_diaria) {
        this.Valor_diaria = Valor_diaria;
    }
    
    public float getValor_total() {
        return Valor_total;
    }

    
    public void setValor_total(float Valor_total) {
        this.Valor_total = Valor_total;
    }
}
