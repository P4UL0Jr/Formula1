package TemperaturaMeteorologica;

public class Soma{

    private int numero;
    private String nome;
    private Soma degrau;
    public static Soma degrau(Soma n){
        if(n.degrau==null){
            return null;
        }
        return n.degrau
    }

    public Soma(int numero, String nome, Soma degrau) {
        this.numero = numero;
        this.nome = nome;
        this.degrau = degrau;
    }

    public static void main(String[] args) {

        Soma d1 = new Soma(1,"d",null);
        Soma d2 = new Soma(2,"d",d1);
        Soma d3 = new Soma(3,"d",d2);
        Soma d4 = new Soma(4,"d",d3);
        Soma d5 = new Soma(5,"d",d4);
        System.out.println("Soma: "+ degrau(d5).numero);
    }
}