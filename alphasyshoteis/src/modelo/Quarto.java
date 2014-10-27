/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;


public class Quarto {
    
    private int id_quarto;
    private int numero_quarto;
    private String tipo_quarto;
    private Float valor_quarto;
    private String status;

    public Quarto() {
    }

    public Quarto(int id_quarto, int numero_quarto, String tipo_quarto, Float valor_quarto) {
        this.id_quarto = id_quarto;
        this.numero_quarto = numero_quarto;
        this.tipo_quarto = tipo_quarto;
        this.valor_quarto = valor_quarto;
    }
    
    public int getId_quarto() {
        return id_quarto;
    }

    
    public void setId_quarto(int id_quarto) {
        this.id_quarto = id_quarto;
    }

    
    public int getNumero_quarto() {
        return numero_quarto;
    }

    
    public void setNumero_quarto(int numero_quarto) {
        this.numero_quarto = numero_quarto;
    }

    
    public String getTipo_quarto() {
        return tipo_quarto;
    }

    
    public void setTipo_quarto(String tipo_quarto) {
        this.tipo_quarto = tipo_quarto;
    }

    
    public Float getValor_quarto() {
        return valor_quarto;
    }

    
    public void setValor_quarto(Float valor_quarto) {
        this.valor_quarto = valor_quarto;
    }
    
    
    public void arrumar_quarto(){
    	
    }
    
    public void alugar(){
    	
    }
    
    public void liberar(){
    	
    }
    
}