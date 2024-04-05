package Formula1.Entidade;

public class VeiculoF1 {
    private String modelo;
    private double velocidadeMaxima;

    public VeiculoF1(String modelo, double velocidademaxima, double peso) {
        this.setModelo(modelo);
        this.setVelocidadeMaxima(velocidademaxima);
    }

    protected VeiculoF1() {
    }


    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public double getVelocidadeMaxima() {
        return this.velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
