package Formula1.Servico;

import java.util.Scanner;

import Formula1.Entidade.Equipe;
import Formula1.Entidade.Piloto;
import Formula1.Entidade.VeiculoF1;
import Formula1.Inteface.IPilotoServico;
import Formula1.Repositorio.PilotoRepositorio;

public class PilotoServico implements IPilotoServico{

    static Piloto salvandoPiloto(Piloto piloto){
        
        PilotoRepositorio.pilotoList.addLast(piloto);
        return  piloto;
        
    }
    
}
