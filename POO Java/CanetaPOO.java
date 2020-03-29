package aula1;
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void status() {
        System.out.print("A caneta " + this.cor);
        System.out.println(" está tampada? " + this.tampada);
        System.out.println("Modelo " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
       
            
        
    }
    void rabiscar (){
    if (this.tampada == true){
        System.out.println("ERRO, não posso rabiscar");
        
    }else{
        System.out.println("Estou rabiscando");
    }
    }

    void tampar (){
    this.tampada = true;
    }

    void destampar(){
    this.tampada = false;
    }        

    
}

   
