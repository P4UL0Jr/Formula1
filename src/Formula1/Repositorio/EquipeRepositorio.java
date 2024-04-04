package Formula1.Repositorio;

import Formula1.Entidade.Piloto;
import Formula1.Inteface.IEquipeRepositorio;
import Formula1.Entidade.Equipe;

import java.util.ArrayList;
import java.util.Scanner;

public class EquipeRepositorio implements IEquipeRepositorio {
    ArrayList <Equipe> EquipeList = new ArrayList<>();

    Scanner inputDaEquipe = new Scanner(System.in);
    public void salvandoEquipeNaLista(String nomeEquipe, Piloto Piloto1, Piloto Piloto2){
        Equipe novaEquipe = new Equipe(nomeEquipe, Piloto1, Piloto2);
        System.out.println("Salvando nova equipe");
        EquipeList.addLast(novaEquipe);
        System.out.println("Equipe adicionada com sucesso!");
    }
    public void removendoEquipeDaLista() {
        if(EquipeList.isEmpty()) {
            System.out.println("A fila esta vazia");
        }else {
            System.out.println("removeu a equipe: "+EquipeList.get(0).getNomeEquipe());
            EquipeList.removeFirst();
        }
    }

    public void mostrandoTodasEquipes(){
        System.out.println("Mostarando equipes!");
        int i = 1;
        for (int index = 0; index<EquipeList.size(); index++){

            System.out.println("---"+ i + "° Equipe - "+ EquipeList.get(index).getNomeEquipe()+" ---");
            System.out.println("|||||PILOTO 1||||||");
            System.out.println("1° Piloto - "+ EquipeList.get(index).getPiloto1().getNome());
            System.out.println(" Nacionalidade - "+ EquipeList.get(index).getPiloto1().getNacionalidade());
            System.out.println(" Experiencia- "+ EquipeList.get(index).getPiloto1().getExperiencia());
            System.out.println(" Modelo - "+ EquipeList.get(index).getPiloto1().getVeiculo().getModelo());
            System.out.println(" Velocidade - "+ EquipeList.get(index).getPiloto1().getVeiculo().getVelocidadeMaxima());
            System.out.println(" Peso - "+ EquipeList.get(index).getPiloto1().getVeiculo().getPeso());
            System.out.println("|||||PILOTO 2|||||");
            System.out.println("2° Piloto - "+ EquipeList.get(index).getPiloto2().getNome());
            System.out.println(" Nacionalidade - "+ EquipeList.get(index).getPiloto2().getNacionalidade());
            System.out.println(" Experiencia- "+ EquipeList.get(index).getPiloto2().getExperiencia());
            System.out.println(" Modelo - "+ EquipeList.get(index).getPiloto2().getVeiculo().getModelo());
            System.out.println(" Velocidade - "+ EquipeList.get(index).getPiloto2().getVeiculo().getVelocidadeMaxima());
            System.out.println(" Peso - "+ EquipeList.get(index).getPiloto2().getVeiculo().getPeso());
            i = i+1;
        }
    }
}
