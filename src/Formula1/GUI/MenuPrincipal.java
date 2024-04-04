package Formula1.GUI;
import Formula1.Entidade.Piloto;
import Formula1.Repositorio.EquipeRepositorio;
import Formula1.Entidade.Equipe;
import Formula1.Repositorio.PilotoRepositorio;
import Formula1.Servico.PilotoServico;

import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {
        PilotoRepositorio listaPiloto = new PilotoRepositorio();
        listaPiloto.lista();

       // PilotoServico.adicionandoPiloto("Qqqqq", "Wwww", "12", "Ffff");
       // PilotoServico.adicionandoPiloto("Rrr", "Eeeeeee", "34", "Ggg");
        System.out.println("Nome da equipe: Mmmm");
        String nomeEquipe = "Mmmm";
        //Scanner inputDoMenu = new Scanner(System.in);

        EquipeRepositorio listaDeEquipes = new EquipeRepositorio();
        listaDeEquipes.salvandoEquipeNaLista(nomeEquipe, PilotoServico.adicionandoPiloto("Qqqqq", "Wwww", "12", "Ffff"),PilotoServico.adicionandoPiloto("Rrr", "Eeeeeee", "34", "Ggg"));
        listaPiloto.print();

    }
}