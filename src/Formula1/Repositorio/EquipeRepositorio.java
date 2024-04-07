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
    /*public static Equipe removerElemento(Equipe equipe, String nomeEquipe, Piloto nomePiloto, String veiculo){
        if (equipePrimeira.getNomeEquipe().equalsIgnoreCase(nomeEquipe) || equipePrimeira.getPiloto1().getNome().equalsIgnoreCase(nomePiloto.getNome()) || equipePrimeira.getPiloto1().getVeiculo().getModelo().equalsIgnoreCase(veiculo)){
            equipe = equipe.getProximaEquipe();
        }else {
            equipe.setProximaEquipe(removerElemento(equipePrimeira.getProximaEquipe(), nomeEquipe, nomePiloto, veiculo));
        }
        return equipe;
    }*/
    
    @SuppressWarnings("unlikely-arg-type")
    public static void removerElemento(Equipe proxEquipe, String equipe){

    String equipeMinuscula = equipe.toLowerCase(); // Convertendo para minúsculas

    if (equipePrimeira != null && equipePrimeira.getNomeEquipe().toLowerCase().equals(equipeMinuscula) ) {
        equipePrimeira = equipePrimeira.getProximaEquipe();
        System.out.println("Equipe removida com sucesso!");
    } else {
        Equipe current = equipePrimeira;
        while (current != null && current.getProximaEquipe() != null) {
            if (current.getProximaEquipe().getNomeEquipe().toLowerCase().equals(equipeMinuscula)) {
                current.setProximaEquipe(current.getProximaEquipe().getProximaEquipe());
                System.out.println("Equipe removida com sucesso!");
                return;
            }
            current = current.getProximaEquipe();
        }
        System.out.println("Equipe não encontrada!");
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
