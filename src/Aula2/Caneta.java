package Aula2;

public class Caneta {

    public String modelo, cor;
    protected int carga;
    //private double ponta;
    private boolean tampada;


    public void status (){
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("\n---------Canetas-------------");
        System.out.printf("Qual modelo? " + this.modelo);
        System.out.println(" " + this.cor);
        //System.out.println("Ponta " + this.ponta);
        System.out.println("Tinta: " + this.carga + " % ");
    }

    public void rabiscar () {
        if (this.tampada == true) {
            System.out.println("Não posso rabiscar" );

        }else {
            System.out.println("Posso rabiscar");
        }
    };

    public void tampar () {
            this.tampada = true;
    };

    public void destampar(){
            this.tampada = false;
    };
}
