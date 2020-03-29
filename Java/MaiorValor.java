package maiorvalor;

import java.util.Scanner;
public class MaiorValor {

 
    public static void main(String[] args) {
      int maiorValor =0;
int numInformado;
Scanner myObj = new Scanner(System.in);
System.out.println("Informe vinte números");
for (int cont=1; cont<=20; cont++) {
numInformado = myObj.nextInt();
if (cont==1) {
maiorValor = numInformado; }
else if (numInformado>maiorValor) {
maiorValor = numInformado;
}
}
System.out.println("O maior valor informado foi " +maiorValor);
}

}


    
    

