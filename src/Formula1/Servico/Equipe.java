package Formula1;

import java.util.Scanner;

public class Equipe {
    private String nomeEquipe;
    private Piloto piloto1;
    private Piloto piloto2;

    public Equipe(String nomeEquipe, Piloto piloto1, Piloto piloto2) {
        this.nomeEquipe = nomeEquipe;
        this.piloto1 = piloto1;
        this.piloto2 = piloto2;
    }

    public Equipe() {

    }

    static Equipe salvandoEquipe(Piloto piloto1, Piloto piloto2){
        Scanner inputEquipe = new Scanner(System.in);
        System.out.println("Digite o nome da equipe");
        String nomeEquipe = inputEquipe.nextLine();
        Equipe EquipeNova = new Equipe(nomeEquipe, piloto1,piloto2);
        return  EquipeNova;
    }
    public void exibirInformacoesEquipe(){
        System.out.println("Nome da equipe: "+this.getNomeEquipe());
        System.out.println("Piloto 1: "+ this.getPiloto1());
        System.out.println("Piloto 2: "+ this.getPiloto2());
    }

    public String getNomeEquipe() {
        return nomeEquipe;
    }

    public void setNomeEquipe(String nomeEquipe) {
        this.nomeEquipe = nomeEquipe;
    }

    public Piloto getPiloto1() {
        return piloto1;
    }

    public void setPiloto1(Piloto piloto1) {
        this.piloto1 = piloto1;
    }

    public Piloto getPiloto2() {
        return piloto2;
    }

    public void setPiloto2(Piloto piloto2) {
        this.piloto2 = piloto2;
    }
}
