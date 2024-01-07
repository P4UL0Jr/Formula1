package Formula1;

import java.util.ArrayList;
import java.util.Scanner;

public class EquipeArrayList {
    ArrayList <Equipe> EquipeList = new ArrayList<>();



    Scanner inputDaEquipe = new Scanner(System.in);
    public void salvandoEquipeNaLista(Equipe novaEquipe){
        System.out.println("Salvando nova equipe");
        EquipeList.add(novaEquipe);
        System.out.println("Equipe adicionada com sucesso!");

    }
    public void removendoEquipeDaLista() {
        System.out.println("Digite o nome da equipe que vai excluir");
        String equipeExcluida = inputDaEquipe.nextLine();
        for (Equipe localizador : EquipeList) {
            if (localizador.getNomeEquipe().equalsIgnoreCase(equipeExcluida)) {
                EquipeList.remove(localizador);
                System.out.println("removeu equipe");

                break;
            }


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
            System.out.println(" Modelo - "+ EquipeList.get(index).getPiloto1().getModelo());
            System.out.println(" Velocidade - "+ EquipeList.get(index).getPiloto1().getVelocidadeMaxima());
            System.out.println(" Peso - "+ EquipeList.get(index).getPiloto1().getPeso());
            System.out.println("|||||PILOTO 2|||||");
            System.out.println("2° Piloto - "+ EquipeList.get(index).getPiloto2().getNome());
            System.out.println(" Nacionalidade - "+ EquipeList.get(index).getPiloto2().getNacionalidade());
            System.out.println(" Experiencia- "+ EquipeList.get(index).getPiloto2().getExperiencia());
            System.out.println(" Modelo - "+ EquipeList.get(index).getPiloto2().getModelo());
            System.out.println(" Velocidade - "+ EquipeList.get(index).getPiloto2().getVelocidadeMaxima());
            System.out.println(" Peso - "+ EquipeList.get(index).getPiloto2().getPeso());
            i = i+1;
        }

    }
}
