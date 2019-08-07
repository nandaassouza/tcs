
package atividade;

public abstract class Automoveis {
    private String modelo;
    private String cor;
    private int limiteTamque;
    private int combustivel;
    private float precoCombustivel;
    private boolean status;
    
    public void trocarPneu() {
        System.out.println("Pneu trocado com sucesso.");
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getLimiteTamque() {
        return limiteTamque;
    }

    public void setLimiteTamque(int limiteTamque) {
        this.limiteTamque = limiteTamque;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(int combustivel) {
        this.combustivel = combustivel;
    }

    public float getPrecoCombustivel() {
        return precoCombustivel;
    }

    public void setPrecoCombustivel(float precoCombustivel) {
        this.precoCombustivel = precoCombustivel;
    }
   
    
}
