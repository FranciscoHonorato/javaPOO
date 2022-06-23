
package banco;

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

 
    public void setMarca(String marca) {
        this.marca = marca;
    }

   
    public String getModelo() {
        return modelo;
    }

 
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

   
    public String getTipo() {
        return tipo;
    }

 
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

   
    public String getEfiEnergetica() {
        return efiEnergetica;
    }

   
    public void setEfiEnergetica(String efiEnergetica) {
        this.efiEnergetica = efiEnergetica;
    }

    
    public String getVoltagem() {
        return voltagem;
    }

  
    public void setVoltagem(String voltagem) {
        this.voltagem = voltagem;
    }

   
    public String getCapacidade() {
        return capacidade;
    }

    /**
     * @param capacidade the capacidade to set
     */
    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }

  
    public String getDimensoes() {
        return dimensoes;
    }

 
    public void setDimensoes(String dimensoes) {
        this.dimensoes = dimensoes;
    }

 
    public double getPeso() {
        return peso;
    }

  
    public void setPeso(double peso) {
        this.peso = peso;
    }

   
    public int getQuantidade() {
        return quantidade;
    }

 
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

  
    public double getValor() {
        return valor;
    }

  
    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
