package Aula05;

public class Aula05 {
    public static void main(String[] args) {

        Banco p1 = new Banco ();
        p1.setNumConta(156540);
        p1.setDono("Matheus");
        p1.abrirConta("Cc");
        p1.depositar(200);
        p1.fecharConta();



        Banco p2 = new Banco();
        p2.setNumConta(123540);
        p2.setDono("Claudia");
        p2.abrirConta("Cp");
        p2.depositar(200);
        p2.pagarMensal();
        p2.sacar(300);



        p1.estadoAtual();
        p2.estadoAtual();

    }
}
