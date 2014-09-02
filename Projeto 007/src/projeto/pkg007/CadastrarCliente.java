
package projeto.pkg007;


public class CadastrarCliente {
    
    public static void main(String[] args){
    
        Cliente cliente = new Cliente(001, "111.222.333-44", "cliente teste", "cliente@teste.com", "(61)3333-2211", "11112222 ssp/df");
                
                System.out.println(cliente.getCod_cliente());
                System.out.println(cliente.getNome());
                System.out.println(cliente.getCpf());
                System.out.println(cliente.getEmail());
                System.out.println(cliente.getRg());
                System.out.println(cliente.getTelefone());                    
        
    }
    
}
