import java.util.Scanner;
public class TesteDinossauro {
	
	public static void imprimirDados(Dinossauro dino) {
		System.out.println("Status do Dinossauro Skeep");
		System.out.println("Energia: "+dino.getEnergia());
		System.out.println("Velocidade: "+dino.getVelocidade());
		System.out.println("Temperatura: "+dino.getTemperatura());
		System.out.println("Humor: "+dino.getHumor());
	}

	public static void main(String[] args) {
		
		Dinossauro skeep = new Dinossauro();
		
		Scanner sc = new Scanner(System.in);
		
		boolean sair = false;
		
		while(!sair) {
			imprimirDados(skeep);
			
			System.out.println("Escolha qual opção deseja: ");
            System.out.println("(P)ular\t(C)orrer\tCo(M)er");
            System.out.println("C(A)ntar/\tTomar (S)ol\tFicar na S(O)mbra   (X)Sair");
            
            String opcao = sc.nextLine();
            
            if ("P".equalsIgnoreCase(opcao)) {
                skeep.pular();
            }
            
            if ("C".equalsIgnoreCase(opcao)) {
                skeep.correr();
            }
            
            if ("M".equalsIgnoreCase(opcao)) {
                skeep.comer();
            }
            
            if ("A".equalsIgnoreCase(opcao)) {
                skeep.cantar();
            }
            
            if ("S".equalsIgnoreCase(opcao)) {
                skeep.tomarSol();
            }
            
            if ("O".equalsIgnoreCase(opcao)) {
                skeep.ficarNaSombra();
            }

            if ("X".equalsIgnoreCase(opcao)) {
                sair = true;
            }
			
		}
		

	}

}
