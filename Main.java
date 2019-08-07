package atividade;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Caminhao cam = new Caminhao("A345", "verde");
        Carro car = new Carro("D345", "roxo");
        Moto mot = new Moto("Z345", "preto");

        Scanner entrada = new Scanner(System.in);
        int acao = 0;
        int veiculo = 0;

        do {
            menu();
            System.out.println("Insira a ação: ");
            acao = entrada.nextInt();
            System.out.println("Insira o veículo: ");
            veiculo = entrada.nextInt();
            switch (veiculo) {
                case 1:
                    switch (acao) {
                        case 1:
                            cam.abastecer();
                            break;
                        case 2:
                            cam.acelerar();
                            break;
                        case 3:
                            cam.trocarPneu();
                            break;
                        case 4:
                            cam.ligar();
                            break;
                        case 5:
                            cam.desligar();
                            break;
                        case 6:
                            cam.status();
                            break;
                        default:
                            System.out.println("Este não é um numero válido!");
                    }
                    break;
                case 2:
                    switch (acao) {
                        case 1:
                            car.abastecer();
                            break;
                        case 2:
                            car.acelerar();
                            break;
                        case 3:
                            car.trocarPneu();
                            break;
                        case 4:
                            car.ligar();
                            break;
                        case 5:
                            car.desligar();
                            break;
                        case 6:
                            car.status();
                            break;
                        default:
                            System.out.println("Este não é um numero válido!");
                    }
                    break;
                case 3:
                    switch (acao) {
                        case 1:
                            mot.abastecer();
                            break;
                        case 2:
                            mot.acelerar();
                            break;
                        case 3:
                            mot.trocarPneu();
                            break;
                        case 4:
                            mot.ligar();
                            break;
                        case 5:
                            mot.desligar();
                            break;
                        case 6:
                            mot.status();
                            break;
                        default:
                            System.out.println("Este não é um numero válido!");
                    }
                    break;
                default:
                    System.out.println("Este não é um numero válido!");
            }

        } while (acao!=7);
    }
        
    
    

    static void menu() {
        System.out.println(">>>>> Menu <<<<<\n");
        System.out.println("Ações:\n1 - Abastecer\n2 - Acelerar\n3 - Trocar Pneu\n4 - Ligar\n5 - Desligar\n6 - Status\n7 - Sair\n");
        System.out.println("Veículo:\n1 - Caminhão\n2 - Carro\n3 - Moto\n");

    }

}
