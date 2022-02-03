package Aula2;

public class Aula2 {
    public static void main(String[] args) {


        Caneta c1 = new Caneta();

        c1.cor = "Azul";
        c1.carga = 50;
        c1.modelo = "Bic";
        c1.ponta = 0.5;
        c1.destampar();
        c1.status();
        c1.rabiscar();


        Caneta c2 = new Caneta();
        c2.cor = "Preta";
        c2.carga = 60;
        c2.modelo = "Bic";
        c2.ponta = 1.0;
        c2.tampar();
        c2.status();
        c2.rabiscar();




    }
}
