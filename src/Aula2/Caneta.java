package Aula2;

public class Caneta {

    String modelo, cor;
    int carga;
    double ponta;
    boolean tampada;
    void status (){
        System.out.println("---------Canetas-------------");
        System.out.printf("Qual modelo? " + this.modelo);
        System.out.println(" " + this.cor);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("Ponta " + this.ponta);
        System.out.println("Tinta: " + this.carga + " % ");
    }

    void rabiscar () {
        if (this.tampada == true) {
            System.out.println("Não posso rabiscar");
                }else {System.out.println("Posso rabiscar");
        }
    };

    void tampar () {
            this.tampada = true;
    };

    void destampar(){
            this.tampada = false;
    };
}
