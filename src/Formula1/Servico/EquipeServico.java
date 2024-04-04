package Formula1.Servico;

import Formula1.Entidade.Equipe;
import Formula1.Entidade.Piloto;

import java.util.Scanner;

public class EquipeServico {
    static Equipe salvandoEquipe(Piloto piloto1, Piloto piloto2){
        Scanner inputEquipe = new Scanner(System.in);
        System.out.println("Digite o nome da equipe");
        String nomeEquipe = inputEquipe.nextLine();
        Equipe EquipeNova = new Equipe(nomeEquipe, piloto1,piloto2);
        return  EquipeNova;
    }
    public void exibirInformacoesEquipe(){
        System.out.println("Nome da equipe: ");
        System.out.println("Piloto 1: ");
        System.out.println("Piloto 2: ");
    }
}
