package Aula2DesafioAbstrato;

public class Aula2DesafioAbstrato {
    public static void main(String[] args) {

        Curso c1 = new Curso();

        c1.nome = "Java";
        c1.alunos = 71;
        c1.data = "18/09/1999";
        c1.duracao = 20;
        c1.hora = 56;
        c1.vagas();
        c1.status();

        Curso c2 = new Curso();

        c2.nome = "JavaScript";
        c2.alunos = 55;
        c2.data = "18/09/1999";
        c2.duracao = 20;
        c2.hora = 56;
        c2.vagas();
        c2.status();
    }
}
