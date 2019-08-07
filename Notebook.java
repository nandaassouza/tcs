package projeto;

public class Notebook {

    private String cor;
    private String modelo;
    private int tela;
    private float preco;
    private boolean status;
    private String so;

    public Notebook() {
        setCor("azul");
        setModelo("z112");
        setTela(15);
        setPreco(500.90f);
        setStatus(false);
    }

    public Notebook(String cor, String modelo, int tela) {
        setCor(cor);
        setModelo(modelo);
        setTela(tela);
        setPreco(500.90f);
        setStatus(false);
    }

    public void MostrarCaract() {
        System.out.println("Cor: " + getCor());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Tela: " + getTela());
        System.out.println("Preco: " + getPreco());
        System.out.println("Status: " + (isStatus() ? "Ligado" : "Desligado"));
        System.out.println("S.O: " + getSo());
    }

    public void Ligar() {
        if (!isStatus()) {
            this.status = true;
            System.out.println("Notebook ligado com sucesso.");
        } else {
            System.out.println("O notebook já está ligado.");
        }

    }

    public void Desligar() {
        if (isStatus()) {
            this.status = false;
            System.out.println("Notebook desligado com sucesso.");
        } else {
            System.out.println("O notebook já está desligado.");
        }
    }

    public void InstallLinux() {
        if (isStatus()) {
            this.so = "Linux";
            System.out.println("Linux instalado com sucesso.");
        } else {
            System.out.println("Não foi possível instalar.");
        }

    }

    public void Navegar() {
        if (isStatus()) {
            System.out.println("Você está navegando.");
        } else {
            System.out.println("Não foi possível navegar.");
        }
    }

    public String getCor() {
        return cor;
    }

    private void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    private void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTela() {
        return tela;
    }

    private void setTela(int tela) {
        this.tela = tela;
    }

    public float getPreco() {
        return preco;
    }

    private void setPreco(float preco) {
        this.preco = preco;
    }

    public boolean isStatus() {
        return status;
    }

    private void setStatus(boolean status) {
        this.status = status;
    }

    public String getSo() {
        return so;
    }

    private void setSo(String so) {
        this.so = so;
    }

}
