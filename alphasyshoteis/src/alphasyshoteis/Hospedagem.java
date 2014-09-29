/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package alphasyshoteis;

import java.sql.Time;
import java.util.*;

/**
 *
 * @author Administrador
 */
public class Hospedagem {
	private Quarto quarto;
	// Pendente: Incluir o objeto "Cliente" e não seu identificador
	private int id_cliente;
	private Date data_entrada;
	private Date data_saida;
	private Time hora_entrada;
	private Time hora_saida;
	private int quantidade_diaria;
	private float total_hospedagem;
	private int id_hospedagem;

	public Hospedagem() {
	}

	public Hospedagem(int id_hospedagem, int id_cliente, int id_quarto,
			Date data_entrada, Date data_saida, Time hora_entrada,
			Time hora_saida, Float valor_diaria, int quantidade_diaria,
			float total_hospedagem) {
		this.id_hospedagem = id_hospedagem;
		this.id_cliente = id_cliente;
		// Pendente: Buscar o quarto do banco
		this.quarto = new Quarto();
		quarto.setId_quarto(id_quarto);
		
		this.data_entrada = data_entrada;
		this.data_saida = data_saida;
		this.hora_entrada = hora_entrada;
		this.hora_saida = hora_saida;
		this.quantidade_diaria = quantidade_diaria;
		this.total_hospedagem = total_hospedagem;
	}

	/**
	 * @return the id_hospedagem
	 */
	public int getId_hospedagem() {
		return id_hospedagem;
	}

	/**
	 * @param id_hospedagem
	 *            the id_hospedagem to set
	 */
	public void setId_hospedagem(int id_hospedagem) {
		this.id_hospedagem = id_hospedagem;
	}

	/**
	 * @return the id_cliente
	 */
	public int getId_cliente() {
		return id_cliente;
	}

	/**
	 * @param id_cliente
	 *            the id_cliente to set
	 */
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	/**
	 * @return the id_quarto
	 */
	public int getId_quarto() {
		return quarto.getId_quarto();
	}

	/**
	 * @param id_quarto
	 *            the id_quarto to set
	 */
	public void setId_quarto(int id_quarto) {
		this.quarto.setId_quarto(id_quarto);
	}

	/**
	 * @return the data_entrada
	 */
	public Date getData_entrada() {
		return data_entrada;
	}

	/**
	 * @param data_entrada
	 *            the data_entrada to set
	 */
	public void setData_entrada(Date data_entrada) {
		this.data_entrada = data_entrada;
	}

	/**
	 * @return the data_saida
	 */
	public Date getData_saida() {
		return data_saida;
	}

	/**
	 * @param data_saida
	 *            the data_saida to set
	 */
	public void setData_saida(Date data_saida) {
		this.data_saida = data_saida;
	}

	/**
	 * @return the hora_entrada
	 */
	public Time getHora_entrada() {
		return hora_entrada;
	}

	/**
	 * @param hora_entrada
	 *            the hora_entrada to set
	 */
	public void setHora_entrada(Time hora_entrada) {
		this.hora_entrada = hora_entrada;
	}

	/**
	 * @return the hora_saida
	 */
	public Time getHora_saida() {
		return hora_saida;
	}

	/**
	 * @param hora_saida
	 *            the hora_saida to set
	 */
	public void setHora_saida(Time hora_saida) {
		this.hora_saida = hora_saida;
	}

	/**
	 * @return the valor_diaria
	 */
	public Float getValor_diaria() {
		return quarto.getValor_quarto();
	}

	/**
	 * @param valor_diaria
	 *            the valor_diaria to set
	 */
	public void setValor_diaria(Float valor_diaria) {
		this.quarto.setValor_quarto(valor_diaria);
	}

	/**
	 * @return the quantidade_diaria
	 */
	public int getQuantidade_diaria() {
		return quantidade_diaria;
	}

	/**
	 * @param quantidade_diaria
	 *            the quantidade_diaria to set
	 */
	public void setQuantidade_diaria(int quantidade_diaria) {
		this.quantidade_diaria = quantidade_diaria;
	}

	/**
	 * @return the total_hospedagem
	 */
	public float getTotal_hospedagem() {
		return total_hospedagem;
	}

	/**
	 * @param total_hospedagem
	 *            the total_hospedagem to set
	 */
	public void setTotal_hospedagem(float total_hospedagem) {
		this.total_hospedagem = total_hospedagem;
	}
}
