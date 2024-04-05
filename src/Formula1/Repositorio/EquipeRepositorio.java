package Formula1.Repositorio;

import Formula1.Entidade.Piloto;
import Formula1.Inteface.IEquipeRepositorio;
import Formula1.Entidade.Equipe;

import java.util.ArrayList;
import java.util.Scanner;

public class EquipeRepositorio implements IEquipeRepositorio {
    public static Equipe equipePrimeira;

    public static void lista(){
        equipePrimeira=null;
    }
    public static void print(){
        for(Equipe n = equipePrimeira; n != null; n = n.getProximaEquipe()){
           System.out.println("| nome: "+n.getNomeEquipe()+" | Piloto 1: "+n.getPiloto1().getNome()+ " | Piloto 2: "+ n.getPiloto2().getNome());
        }
    }
    
    public static Equipe getEquipePrimeira() {
        return equipePrimeira;
    }
    public static void setEquipePrimeira(Equipe equipePrimeira) {
        EquipeRepositorio.equipePrimeira = equipePrimeira;
    }

    ///////////////////////////////////////////////////////////////////////////////////////
    
}
