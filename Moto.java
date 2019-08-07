package atividade;

public class Moto extends Automoveis implements AutoInterface {

    public Moto(String modelo, String cor){
        setModelo(modelo);
        setCor(cor);
        setLimiteTamque(40);
        setCombustivel(40);
        setPrecoCombustivel(2.73f);
        setStatus(false);
    }
    
    @Override
    public void ligar() {
        if (!isStatus()) {
            setStatus(true);
            System.out.println("Moto ligada.");
        } else {
            System.out.println("A Moto já está ligada.");
        }
    }

    @Override
    public void desligar() {
        if (isStatus()) {
            setStatus(false);
            System.out.println("Moto desligada.");
        } else {
            System.out.println("A Moto já está desligada.");
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
                System.out.println("Moto foi abastecida. Valor total R$ = " + valor);
            } else {
                System.out.println("Erro! O tanque já está cheio.");
            }
        } else {
            System.out.println("Erro! A Moto deve estar desligada.");
        }
    }

    @Override
    public void acelerar() {
        if (isStatus()) {
            if (getCombustivel() > 0) {
                setCombustivel(getCombustivel() - 10);
            }
            System.out.println("A Moto acelerou.");
        } else {
            System.out.println("Erro! A Moto deve estar ligada.");
        }
    }

    @Override
    public void status() {
        System.out.println(">>>>> Status da Moto <<<<<");
        System.out.println("Modelo: " + getModelo());
        System.out.println("Cor: " + getCor());
        System.out.println("Combustível: " + getCombustivel());
        System.out.println("Status: " + (isStatus() ? "Ligada" : "Desligada"));
    }
}
