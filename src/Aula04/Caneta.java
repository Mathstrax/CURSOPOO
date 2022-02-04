package Aula04;

public class Caneta {
    private String modelo;
    private double ponta;
    private boolean tampada;
    private String cor;


    public Caneta(String m, double p,  String c) {
        this.setModelo(m) ;
        this.setPonta(p);
        this.tampar();
        this.setCor(c);
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public double getPonta() {
        return this.ponta;
    }

    public void setPonta(double p) {
        this.ponta = p;
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampada() {
        this.tampada = false;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    public void status(){
        System.out.println("---------CANETAS---------");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor " + this.getCor());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Tampada: " + this.tampada);
    }
}
