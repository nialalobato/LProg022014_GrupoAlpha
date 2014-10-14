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
public class Produto {
    private int id_produto;
    private int cod_produto;//produto
    private String nome_produto;
    private Float valor_produto;
    private int quantidade_produto;

    public Produto() {
    }

    public Produto(int id_produto, int cod_produto, String nome_produto, Float valor_produto, int quantidade_produto) {
        this.id_produto = id_produto;
        this.cod_produto = cod_produto;
        this.nome_produto = nome_produto;
        this.valor_produto = valor_produto;
        this.quantidade_produto = quantidade_produto;
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

    /**
     * @return the nome_produto
     */
    public String getNome_produto() {
        return nome_produto;
    }

    /**
     * @param nome_produto the nome_produto to set
     */
    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    /**
     * @return the valor_produto
     */
    public Float getValor_produto() {
        return valor_produto;
    }

    /**
     * @param valor_produto the valor_produto to set
     */
    public void setValor_produto(Float valor_produto) {
        this.valor_produto = valor_produto;
    }

    /**
     * @return the quantidade_produto
     */
    public int getQuantidade_produto() {
        return quantidade_produto;
    }

    /**
     * @param quantidade_produto the quantidade_produto to set
     */
    public void setQuantidade_produto(int quantidade_produto) {
        this.quantidade_produto = quantidade_produto;
    }
}
