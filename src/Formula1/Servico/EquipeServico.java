package Formula1.Servico;

import Formula1.Entidade.Equipe;
import Formula1.Entidade.Piloto;
import Formula1.Entidade.VeiculoF1;
import Formula1.Repositorio.EquipeRepositorio;
import Formula1.Repositorio.PilotoRepositorio;


public class EquipeServico {

    public static Equipe criandoEquipe(String nome, Piloto piloto1, Piloto piloto2){
        Equipe equipeNova = new Equipe();
        equipeNova.setNomeEquipe(nome);
        equipeNova.setPiloto1(piloto1);
        equipeNova.setPiloto2(piloto2);
        equipeNova.setProximaEquipe(EquipeRepositorio.equipePrimeira);
        
        EquipeRepositorio.equipePrimeira = equipeNova;
        return EquipeRepositorio.equipePrimeira;
    }
}
