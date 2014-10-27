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
import java.util.List;
import modelo.Cliente;
import static org.eclipse.persistence.expressions.ExpressionMath.mod;
import static org.eclipse.persistence.expressions.ExpressionMath.mod;

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
        con = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/dbalphahoteis", "alphadm", "852456");

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

    public void InserirProduto(String cod_produto, String nome_produto, String valor_produto, String quantidade_produto) throws SQLException, ClassNotFoundException {
        if (con == null) {
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
       /* PreparedStatement pst = con.prepareStatement("delete from clientes where nome = ?");
        pst.setInt(1,getNome());
        pst.execute();
        JOptionPane.showMessageDialog(null, "Dados excluido com sucesso!");
    }
    catch (SQLException ex) {
JOptionPane.showMessageDialog(null, "Erro na exclusão dos dados!\n Erro:" + ex);*/
    }



public  List<Cliente>  buscarClientes(String nome, String cpf) {
        
        //"SELECT c FROM Cliente c WHERE c.nome=" + nome + " AND c.cpf=" + cpf;
        
        // Pendente: Implementar pesquisa
        return null;
    }

public ResultSet executaSql(String sql) throws ClassNotFoundException, SQLException{
    Statement stm;
    ResultSet rs = null;
    
    if(con == null){
        conectar();
    }

    stm = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    rs = stm.executeQuery(sql);
    
    return rs;
}

    public void deleteCliente(String cpf) throws SQLException, ClassNotFoundException {
        if (con == null) {
            conectar();
        }
        
        PreparedStatement pst = con.prepareStatement("delete from cliente where cpf = ?");
        pst.setString(1,cpf);
        pst.execute();
    }

}
