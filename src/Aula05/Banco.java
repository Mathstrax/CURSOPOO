package Aula05;



public class Banco {
    // atributos
    public int numConta;
    protected String tipo, dono;
    private double saldo;
    private boolean status;


    public void estadoAtual () {
        System.out.println("----------BANCO CANÁRIO----------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }


    public Banco () {
        this.setSaldo(0);
        this.setStatus(false);
    }
    public void abrirConta(String t) {
        this.setTipo(t);
         this.setStatus(true);
           if (t == "Cc") {
            this.setSaldo(50);
                 } else if (t == "Cp") {
                      this.setSaldo(150);
                }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro");
               }else if (this.getSaldo() < 0) {
                 System.out.println("Conta em débito");
                   }else setStatus(false);  }

    public void depositar (double v) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
              } else System.out.println("Impossivel depositar");
                System.out.println("Deposito realizado na conta de " + this.getDono());

                }
    public void sacar (double v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                     System.out.println("Saque realizado na conta de " + this.getDono());
                          }else {
                            System.out.println("SALDO INSUFICIENTE");}
                                   }else System.out.println("Impossivel sacar"); }

        public void pagarMensal () {
            int v = 0;
                if(this.getTipo() == "Cc"){
                    v = 12;
                        }else if (this.getTipo() == "Cp"){
                            v = 20; }
                                if (this.getStatus()) {
                                    this.setSaldo(this.getSaldo() - v);
                                        System.out.println("Mensalidade paga com sucesso");
                                            } else {
                                                System.out.println("Impossivel pagar uma conta fechada!");  }
                                            }



    // Métodos especiais
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    /*  Métodos
    public Banco() {
        this.setNumConta(n);
        this.setTipo(t);
        this.setDono(d);
        this.abrirConta(t);


    }






    // Métodos personalizados


    void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t == "Cc") {
            this.saldo = 50;
        }else {
            this.saldo = 100;
        }
    }
    void fecharConta(){
        if ( this.saldo > 0) {
            System.out.println("Conta com dinheiro");

                  } else if (saldo < 0) {

                     }else  setStatus(false);
    }
    void depositar (double v) {
        if (status = true) {
            saldo = saldo + v;

        }else System.out.println("ERROR CONTA");
    }
    void sacar (double v){
        if (status = true) {
            if (saldo > v) {
                saldo = saldo - v;
                     }else System.out.println("Saldo insuficiente");


        } else System.out.println("Conta fechada");



    }
    void pagarMensal(){
        double v;
        if ( this.tipo = "Cc") {
            v = 12;
        }else if (this.tipo = "CP") {
            v = 20;
        }
        if ( status = true) {
            if (saldo > v) {
                saldo = saldo - v;
            }else System.out.println("Saldo Insuficiente");
        }else System.out.println("Impossivel pagar");
    }

     void status (){
        System.out.println("Qual é sua conta: " + this.getTipo());
        System.out.println("Numero da conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Nome: " + this.getDono());
        System.out.println("Saldo:  " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    } */








}


