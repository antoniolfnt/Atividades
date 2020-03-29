package aula05;
public class ContaBanco {
    //atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    //Métodos Personalizados
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.saldo = 50;                           
        } else if (t == "CP") {
            this.saldo == 150;
        }
    }
    public void fecharConta(){
        
    }
    public void depositar(){
        
    }
    public void sacar(){
        
    }
    public void pagarMensalidade(){
        
    }
    //Atributos espéciais
    public ContaBanco() {
    this.saldo = 0;
    this.status = false;
    
    }

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

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
