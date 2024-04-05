package Formula1.GUI;
import Formula1.Entidade.Piloto;
import Formula1.Entidade.VeiculoF1;
import Formula1.Repositorio.EquipeRepositorio;
import Formula1.Entidade.Equipe;
import Formula1.Repositorio.PilotoRepositorio;
import Formula1.Servico.EquipeServico;
import Formula1.Servico.PilotoServico;

import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {

        System.out.println("Bem-Vindo(a) a FormulaF1\n");

        System.out.println("Digite a opção desejada: ");
        System.out.println("[1] Registrar nova Equipe");
        System.out.println("[2] Listar todas equipes registradas");
        System.out.println("[3] Excluir");

        try{
            System.out.print("--> ");

        } catch(Exception e){
            System.out.println("Opção inválida, tente novamente!");
            main(null);
        }

        VeiculoF1 v1 = new VeiculoF1("Ferrari", 442.2, 1.050);
        Piloto p1 = new Piloto("Nome_Piloto","Nacionalidade_Piloto", v1);
        VeiculoF1 v2 = new VeiculoF1("Mercedes", 354.4, 123.3);
        Piloto p2 = new Piloto("Nome_piloto2", "Nacionalidade_piloto2", v2);
        
        EquipeServico.criandoEquipe("Nome_da_equipe", p1, p2);
        principal();

    }

    public static void principal(){
        EquipeRepositorio.print();
    }
    public static void exclusao(){
        System.out.println("Excluir");
        System.out.println("[1] Remover ultimo veiculo");
        System.out.println("[2] Remover primeiro piloto");
    }
}