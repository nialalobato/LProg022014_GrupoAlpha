
package projeto.pkg007;

public class Quarto {
 
    private int Numero_quarto;
    private String Tipo_quarto;//simples - duplo
    private float Valor_quarto;
    private int cod_produto; //frigobar

    
    public int getNumero_quarto() {
        return Numero_quarto;
    }

    
    public void setNumero_quarto(int Numero_quarto) {
        this.Numero_quarto = Numero_quarto;
    }

    
    public String getTipo_quarto() {
        return Tipo_quarto;
    }

    
    public void setTipo_quarto(String Tipo_quarto) {
        this.Tipo_quarto = Tipo_quarto;
    }

    
    public float getValor_quarto() {
        return Valor_quarto;
    }

    
    public void setValor_quarto(float Valor_quarto) {
        this.Valor_quarto = Valor_quarto;
    }

    
    public int getCod_produto() {
        return cod_produto;
    }

    
    public void setCod_produto(int cod_produto) {
        this.cod_produto = cod_produto;
    }
}
