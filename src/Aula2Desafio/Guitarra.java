package Aula2Desafio;

public class Guitarra {
    String modelo, marca, madeira;
    double cordas;
    boolean afinado;


    void status (){
        System.out.println("---------LOJA DE GUITARRAS-----------");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Madeira: " + this.madeira);
        System.out.println("O violão está afinado? " + this.afinado);
        System.out.println("Qual é a numeração da corda: " + this.cordas);
    }

    void tocar (){
        if (this.afinado == true) {
            System.out.println("Está afinado!");
        }else  {
            System.out.println("Não está afinado");
        };
    };
    void afinado (){
        this.afinado = true;
    };
    void desafinado () {
        this.afinado = false;
    };


}
