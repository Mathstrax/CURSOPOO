package Aula2DesafioAbstrato;



public class Curso {
    String  nome, data;
    int hora, duracao, alunos, vagas;




    void status (){
        System.out.println("------------ CURSO ---------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Hora: " + this.hora);
        System.out.println("Data: " + this.data);
        System.out.println("Duração: " + this.duracao);
        System.out.println("Vagas: " + this.alunos);
    }


    void vagas (){
        if (this.alunos >= 60) {
            System.out.print("Não tem mais vagas");
        } else {
            System.out.println("Você conseguiu se inscrever, Parabéns!");
        }
    }


}
