package Formula1.Entidade;

public abstract class VeiculoF1 {
    private String modelo;
    private double velocidadeMaxima;
    private  double peso;

    public VeiculoF1(String modelo, double velocidademaxima, double peso) {
        this.setModelo(modelo);
        this.setVelocidadeMaxima(velocidademaxima);
        this.setPeso(peso);
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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
