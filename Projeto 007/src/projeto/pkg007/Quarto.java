
package projeto.pkg007;

public class Quarto {
 
    private int Numero_quarto;
    private String Tipo_quarto;//simples - duplo
    private float Valor_quarto;
    private int cod_produto; //frigobar

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
     * @return the Tipo_quarto
     */
    public String getTipo_quarto() {
        return Tipo_quarto;
    }

    /**
     * @param Tipo_quarto the Tipo_quarto to set
     */
    public void setTipo_quarto(String Tipo_quarto) {
        this.Tipo_quarto = Tipo_quarto;
    }

    /**
     * @return the Valor_quarto
     */
    public float getValor_quarto() {
        return Valor_quarto;
    }

    /**
     * @param Valor_quarto the Valor_quarto to set
     */
    public void setValor_quarto(float Valor_quarto) {
        this.Valor_quarto = Valor_quarto;
    }

    /**
     * @return the cod_produto
     */
    public int getCod_produto() {
        return cod_produto;
    }

    /**
     * @param cod_produto the cod_produto to set
     */
    public void setCod_produto(int cod_produto) {
        this.cod_produto = cod_produto;
    }
}
