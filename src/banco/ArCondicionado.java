/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Prosperar1 - RIO
 */
public class ArCondicionado {
    private String marca;
    private String modelo; 
    private String tipo;
    private String efiEnergetica;
    private String voltagem;
    private String capacidade;
    private String dimensoes;
    private double peso;
    private int quantidade;
    private double valor;
    public double total;
    
  
    public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the efiEnergetica
     */
    public String getEfiEnergetica() {
        return efiEnergetica;
    }

    /**
     * @param efiEnergetica the efiEnergetica to set
     */
    public void setEfiEnergetica(String efiEnergetica) {
        this.efiEnergetica = efiEnergetica;
    }

    /**
     * @return the voltagem
     */
    public String getVoltagem() {
        return voltagem;
    }

    /**
     * @param voltagem the voltagem to set
     */
    public void setVoltagem(String voltagem) {
        this.voltagem = voltagem;
    }

    /**
     * @return the capacidade
     */
    public String getCapacidade() {
        return capacidade;
    }

    /**
     * @param capacidade the capacidade to set
     */
    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }

    /**
     * @return the dimensoes
     */
    public String getDimensoes() {
        return dimensoes;
    }

    /**
     * @param dimensoes the dimensoes to set
     */
    public void setDimensoes(String dimensoes) {
        this.dimensoes = dimensoes;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
