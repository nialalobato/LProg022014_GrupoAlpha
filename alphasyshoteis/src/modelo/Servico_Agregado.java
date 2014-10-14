/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author Administrador
 */
public class Servico_Agregado {
    private int id_servico;
    private int id_produto;
    private int id_hospedagem;

    public Servico_Agregado() {
    }

    public Servico_Agregado(int id_servico, int id_produto, int id_hospedagem) {
        this.id_servico = id_servico;
        this.id_produto = id_produto;
        this.id_hospedagem = id_hospedagem;
    }
    
    /**
     * @return the id_servico
     */
    public int getId_servico() {
        return id_servico;
    }

    /**
     * @param id_servico the id_servico to set
     */
    public void setId_servico(int id_servico) {
        this.id_servico = id_servico;
    }

    /**
     * @return the id_produto
     */
    public int getId_produto() {
        return id_produto;
    }

    /**
     * @param id_produto the id_produto to set
     */
    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    /**
     * @return the id_hospedagem
     */
    public int getId_hospedagem() {
        return id_hospedagem;
    }

    /**
     * @param id_hospedagem the id_hospedagem to set
     */
    public void setId_hospedagem(int id_hospedagem) {
        this.id_hospedagem = id_hospedagem;
    }
}
