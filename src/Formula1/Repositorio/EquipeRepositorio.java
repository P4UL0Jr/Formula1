package Formula1.Repositorio;

import Formula1.Entidade.Piloto;
import Formula1.Entidade.VeiculoF1;
import Formula1.Inteface.IEquipeRepositorio;
import Formula1.Entidade.Equipe;

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
    public static Equipe removerElemento(Equipe equipe, String nomeEquipe, Piloto nomePiloto, VeiculoF1 veiculo){
        if (equipe.getNomeEquipe().equalsIgnoreCase(nomeEquipe) || equipe.getPiloto1().getNome().equalsIgnoreCase(nomePiloto.getNome()) || equipe.getPiloto1().getVeiculo().equals(veiculo)){
            equipe = equipe.getProximaEquipe();
        }else {
            equipe.setProximaEquipe(removerElemento(equipe.getProximaEquipe(), nomeEquipe, nomePiloto, veiculo));
        }
        return equipe;
    }
    
    public static Equipe getEquipePrimeira() {
        return equipePrimeira;
    }
    public static void setEquipePrimeira(Equipe equipePrimeira) {
        EquipeRepositorio.equipePrimeira = equipePrimeira;
    }

    ///////////////////////////////////////////////////////////////////////////////////////
    
}
