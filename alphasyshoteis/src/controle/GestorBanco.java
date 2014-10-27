/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import view.Cliente;

/**
 *
 * @author iesb
 */
public class GestorBanco {

    //variavel
    Connection con = null;    

    private void conectar() throws ClassNotFoundException, SQLException {
        // TODO add your handling code here:
        Class.forName("com.mysql.jdbc.Driver");

        //conexo com o banco
        con = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/dbalphoteis", "alphahoteis", "852456");

    }

    public void inserirCliente(String nome, String sexo, String dataNascimento, String cpf, String rg, String email, String telefone, String celular, String endereco, String bairro, String cidade, String uf) throws ClassNotFoundException, SQLException {

        if (con == null) {
            conectar();
        }

        //string que inseri no banco
        String query = "INSERT INTO cliente (nome, sexo, data_nascimento, cpf, rg, email, telefone, celular, endereco, bairro, cidade, uf) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";

        //cria o comando
        PreparedStatement stmt = con.prepareStatement(query);

        //seta os valores na string de insercao
        stmt.setString(1, nome);
        stmt.setString(2, sexo);
        stmt.setString(3, dataNascimento);
        stmt.setString(4, cpf);
        stmt.setString(5, rg);
        stmt.setString(6, email);
        stmt.setString(7, telefone);
        stmt.setString(8, celular);
        stmt.setString(9, endereco);
        stmt.setString(10, bairro);
        stmt.setString(11, cidade);
        stmt.setString(12, uf);

        //executa o comando no banco de dados
        stmt.executeUpdate();

        //fecha comando e conexao
        stmt.close();

    }
    
    public Cliente ConsultaCliente(String nome) throws SQLException, ClassNotFoundException{
            
        Cliente c1 = new Cliente();
        
        if (con == null) {
            conectar();
        }
        
        PreparedStatement consulta = con.prepareStatement("Select * FROM cliente WHERE nome = ? ");
        consulta.setString(1, nome);
        ResultSet rs = consulta.executeQuery();
                    
        while (rs.next()){
            
            c1.setNome(rs.getString ("nome"));
            
        }
            
        return c1;
        
    }   
    

    public void InserirQuarto(String numero_quarto, String tipo_quarto, String valor_quarto) throws SQLException, ClassNotFoundException {
        if (con == null) {
            conectar();
        }
        //string que inseri no banco
        String query = "INSERT INTO quarto (numero_quarto, tipo_quarto, valor_quarto) VALUES (?,?,?)";

        //cria o comando
        PreparedStatement stmt = con.prepareStatement(query);

        //seta os valores na string de insercao
        stmt.setString(1, numero_quarto);
        stmt.setString(2, tipo_quarto);
        stmt.setString(3, valor_quarto);

        //executa o comando no banco de dados
        stmt.executeUpdate();

        //fecha comando e conexao
        stmt.close();
    }
    
    public void InserirProduto(String cod_produto, String nome_produto, String valor_produto, String quantidade_produto) throws ClassNotFoundException, SQLException{
    	if (con==null){
    		conectar();
    	}
    	
    	String query = "INSERT INTO produto (cod_produto, nome_produto, valor_produto, quantidade_produto) VALUE (?,?,?,?)";
    	
    	//cria o comando
        PreparedStatement stmt = con.prepareStatement(query);

        //seta os valores na string de insercao
       
        stmt.setString(1, cod_produto);
        stmt.setString(2, nome_produto);
        stmt.setString(3, valor_produto);
        stmt.setString(4, quantidade_produto);

        //executa o comando no banco de dados
        stmt.executeUpdate();

        //fecha comando e conexao
        stmt.close();
    }

    public void deleteCliente(String nome, String sexo, String dataNascimento, String cpf, String rg, String email, String telefone, String celular, String endereco, String bairro, String cidade, String uf) throws ClassNotFoundException, SQLException {

        if (con == null) {
            conectar();
        }

        //string que inseri no banco
        String query = "DELETE WHERE cliente (nome, sexo, data_nascimento, cpf, rg, email, telefone, celular, endereco, bairro, cidade, uf) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";

        //cria o comando
        PreparedStatement stmt = con.prepareStatement(query);

        //seta os valores na string de insercao
        stmt.setString(1, nome);
        stmt.setString(2, sexo);
        stmt.setString(3, dataNascimento);
        stmt.setString(4, cpf);
        stmt.setString(5, rg);
        stmt.setString(6, email);
        stmt.setString(7, telefone);
        stmt.setString(8, celular);
        stmt.setString(9, endereco);
        stmt.setString(10, bairro);
        stmt.setString(11, cidade);
        stmt.setString(12, uf);

        //executa o comando no banco de dados
        stmt.executeUpdate();

        //fecha comando e conexao
        stmt.close();

    }    

    
}
