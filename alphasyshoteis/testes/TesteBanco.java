/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import controle.GestorBanco;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import view.CadastroCliente;


/**
 *
 * @author iesb
 */
public class TesteBanco {

    //variavel

    Connection con = null;

    public TesteBanco() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() throws SQLException, ClassNotFoundException {
        // TODO add your handling code here:
        Class.forName("com.mysql.jdbc.Driver");

        //conexo com o banco
        con = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/dbalphahoteis", "alphadm", "852456");
        String query = "DELETE FROM cliente WHERE nome='testeunitario'";

        //cria o comando
        PreparedStatement stmt = con.prepareStatement(query);

        //executa o comando no banco de dados
        stmt.executeUpdate();

        //fecha comando e conexao
        stmt.close();
        con.close();
    }

    @After
    public void tearDown() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");

        //conexo com o banco
        con = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/dbalphahoteis", "alphadm", "852456");
        String query = "DELETE FROM cliente WHERE nome='testeunitario'";

        //cria o comando
        PreparedStatement stmt = con.prepareStatement(query);

        //executa o comando no banco de dados
        stmt.executeUpdate();

        //fecha comando e conexao
        stmt.close();
        con.close();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testaInsercao_e_Delecao() throws Exception {
        GestorBanco bd = new GestorBanco();
        
        ResultSet rs = bd.executaSql("SELECT * from cliente where cpf='000.000.000-00'");
        assertFalse(rs.next());
        
        bd.inserirCliente("testeunitario", "", "", "000.000.000-00", "", "", "", "", "", "", "", "");
        
        rs = bd.executaSql("SELECT * from cliente where cpf='000.000.000-00'");
        assertTrue(rs.next());
        
        bd.deleteCliente("000.000.000-00");
        rs = bd.executaSql("SELECT * from cliente where cpf='000.000.000-00'");
        assertFalse(rs.next());
        
    }  
}
