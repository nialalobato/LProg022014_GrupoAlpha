
package projeto.pkg007;

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

    
    public void setCod_cliente(int Cod_cliente) {
        this.Cod_cliente = Cod_cliente;
    }

    
    public String getCpf() {
        return cpf;
    }

    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getEmail() {
        return email;
    }

    
    public void setEmail(String email) {
        this.email = email;
    }

    
    public String getTelefone() {
        return telefone;
    }

    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    
    public String getRg() {
        return rg;
    }

    
    public void setRg(String rg) {
        this.rg = rg;
    }

}
