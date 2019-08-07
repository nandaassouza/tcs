package projeto;

public class Projeto {

    public static void main(String[] args) {
        Notebook n1 = new Notebook();  
        Notebook n2 = new Notebook("Vermelho", "A232", 13);
        Notebook n3 = new Notebook("Roxo", "D232", 14);
        
        n1.MostrarCaract();
        System.out.println("\n");
        n2.Ligar();
        n2.InstallLinux();
        n2.Navegar();
        n2.MostrarCaract();
        
        System.out.println("\n");
        n3.Ligar();
        n3.Desligar();
        n3.InstallLinux();
        n3.Navegar();
        n3.MostrarCaract();
    }
    
}
