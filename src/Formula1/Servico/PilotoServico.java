package Formula1.Servico;

import Formula1.Entidade.Piloto;
import Formula1.Repositorio.PilotoRepositorio;

public class PilotoServico {

    public static Piloto adicionandoPiloto(String nome, String nacionalidade, String experiencia, String veiculo){
        Piloto novoPiloto = new Piloto();
        novoPiloto.setNome(nome);
        novoPiloto.setNacionalidade(nacionalidade);
        novoPiloto.setExperiencia(experiencia);
        novoPiloto.setVeiculo(veiculo);
        novoPiloto.setProximoPiloto(PilotoRepositorio.primeiro);
        PilotoRepositorio.primeiro=novoPiloto;
        return PilotoRepositorio.primeiro;


    }
}
