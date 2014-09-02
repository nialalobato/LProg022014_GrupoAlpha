/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.pkg007;

/**
 *
 * @author iesb
 */
public class Cliente {
    
   private int Cod_cliente;
   private String cpf;
   private String nome;
   private String email;
   private String telefone;
   private String rg;       

    public Cliente() {
    }

    public Cliente(int Cod_cliente, String cpf, String nome, String email, String telefone, String rg) {
        this.Cod_cliente = Cod_cliente;
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.rg = rg;
    }

  
   
   
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
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

}
