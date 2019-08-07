package atividade;

public class Caminhao extends Automoveis implements AutoInterface {

    public Caminhao(String modelo, String cor){
        setModelo(modelo);
        setCor(cor);
        setLimiteTamque(100);
        setCombustivel(100);
        setPrecoCombustivel(4.33f);
        setStatus(false);
    }
    
    @Override
    public void ligar() {
        if (!isStatus()) {
            setStatus(true);
            System.out.println("Caminhão ligado.");
        } else {
            System.out.println("O Caminhão já está ligado.");
        }
    }

    @Override
    public void desligar() {
        if (isStatus()) {
            setStatus(false);
            System.out.println("Caminhão desligado.");
        } else {
            System.out.println("O Caminhão já está desligado.");
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
                System.out.println("Caminhão foi abastecido. Valor total R$ = " + valor);
            } else {
                System.out.println("Erro! O tanque já está cheio.");
            }
        } else {
            System.out.println("Erro! O Caminhão deve estar desligado.");
        }
    }

    @Override
    public void acelerar() {
        if (isStatus()) {
            if (getCombustivel() > 0) {
                setCombustivel(getCombustivel() - 10);
            }
            System.out.println("O Caminhão acelerou.");
        } else {
            System.out.println("Erro! O Caminhão deve estar ligado.");
        }
    }

    @Override
    public void status() {
        System.out.println(">>>>> Status do Caminhão <<<<<");
        System.out.println("Modelo: " + getModelo());
        System.out.println("Cor: " + getCor());
        System.out.println("Combustível: " + getCombustivel());
        System.out.println("Status: " + (isStatus() ? "Ligado" : "Desligado"));
    }

}
