package Aula2Desafio;

public class Aula2Desafio {
    public static void main(String[] args) {

        Guitarra m1 = new Guitarra();

        m1.cordas = 0.9;
        m1.desafinado();
        m1.madeira = "Mogno";
        m1.marca = "Yamaha";
        m1.modelo = "Les Paul";
        m1.status();
        m1.tocar();

        Guitarra m2 = new Guitarra();
        m1.cordas = 0.12;
        m1.afinado();
        m1.madeira = "Les Paul";
        m1.marca = "Di Giorgio";
        m1.modelo = "Classic";
        m1.status();
        m1.tocar();



    }
}
