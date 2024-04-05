package Formula1.Inteface;

import Formula1.Entidade.Piloto;

public interface IPilotoRepositorio {
    public void mostrandoTodosPilotos();
    public void removendoPilotoDaLista();
    static Piloto salvandoPiloto(Piloto piloto){return null;}
}
