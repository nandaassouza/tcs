package atividade;

public class Carro extends Automoveis implements AutoInterface {

    public Carro(String modelo, String cor){
        setModelo(modelo);
        setCor(cor);
        setLimiteTamque(60);
        setCombustivel(60);
        setPrecoCombustivel(3.23f);
        setStatus(false);
    }
    
    @Override
    public void ligar() {
        if (!isStatus()) {
            setStatus(true);
            System.out.println("Carro ligado.");
        } else {
            System.out.println("O Carro já está ligado.");
        }
    }

    @Override
    public void desligar() {
        if (isStatus()) {
            setStatus(false);
            System.out.println("Carro desligado.");
        } else {
            System.out.println("O Carro já está desligado.");
        }
    }

    @Override
    public void abastecer() {
        float valor = 0f;
        if (!isStatus()) {
            if (getCombustivel() < getLimiteTamque()) {
                while (getCombustivel() < getLimiteTamque()) {
                    setCombustivel(getCombustivel() + 10);
                    valor += 10 * getPrecoCombustivel();
                }
                System.out.println("carro foi abastecido. Valor total R$ = " + valor);
            } else {
                System.out.println("Erro! O tanque já está cheio.");
            }
        } else {
            System.out.println("Erro! O Carro deve estar desligado.");
        }
    }

    @Override
    public void acelerar() {
        if (isStatus()) {
            if (getCombustivel() > 0) {
                setCombustivel(getCombustivel() - 10);
            }
            System.out.println("O Carro acelerou.");
        } else {
            System.out.println("Erro! O Carro deve estar ligado.");
        }
    }

    @Override
    public void status() {
        System.out.println(">>>>> Status do Carro <<<<<");
        System.out.println("Modelo: " + getModelo());
        System.out.println("Cor: " + getCor());
        System.out.println("Combustível: " + getCombustivel());
        System.out.println("Status: " + (isStatus() ? "Ligado" : "Desligado"));
    }
}
