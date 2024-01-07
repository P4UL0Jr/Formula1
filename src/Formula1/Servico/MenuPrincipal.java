package Formula1;
import java.util.Scanner;
public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner inputDoMenu = new Scanner(System.in);

        Piloto p1 = new Piloto();
        Piloto p2 = new Piloto();
        Equipe equipe1 = new Equipe();
        EquipeArrayList listaDeEquipes = new EquipeArrayList();

        String loop = "4";
        while (loop != "1") {
            System.out.println("[1] Criar nova equipe");
            System.out.println("[2] Mostrar dados da equipe");
            System.out.println("[3] Remover equipe");
            String escolhaCase = inputDoMenu.nextLine();
            switch (escolhaCase) {
                case "1":
                    p1 = Piloto.salvandoDadosPiloto1();
                    p2 = Piloto.salvandoDadosPiloto2();
                    equipe1 = Equipe.salvandoEquipe(p1,p2);
                    listaDeEquipes.salvandoEquipeNaLista(equipe1);
                    break;
                case "2":
                    listaDeEquipes.mostrandoTodasEquipes();
                    break;
                case "3":
                    listaDeEquipes.removendoEquipeDaLista();
            }

        }
    }
}