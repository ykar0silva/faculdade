import java.util.*;

public class Answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor = 0.0;
        double litros = sc.nextDouble();
        char tipo = sc.next().charAt(0);

        if(litros <= 0 || !(tipo == 'A' || tipo == 'G')) {
            System.out.println("Entrada inválida.");
            sc.close();
            return;
        }
        
        if(tipo == 'A'){
            if(litros <= 20){
                valor = (litros * 4.20) * 0.97;   
            }else{
                valor = (litros * 4.20) * 0.95;
            }
        }else if(tipo == 'G'){
            if(litros <= 20){
                valor = (litros * 5.80) * 0.96;   
            }else{
                valor = (litros * 5.80) * 0.94;
            }
        }

        
        System.out.printf("Valor a pagar: R$ %.2f%n", valor);

        sc.close();
    }
}