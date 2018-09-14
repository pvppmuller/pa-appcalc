 package pa.app;

import java.util.Scanner;
import java.util.logging.Logger;

public class App 
{
	private static Logger logger = Logger.getLogger(App.class.getName());
	
	

    public static void main (String args[]){ 
      
        int opcao = 5;  
        int num1;  
        int num2;  
		Scanner input = new Scanner(System.in);
		logger.info("-Escolha uma opcao-");  
		logger.info("1. Soma");    
		logger.info("2. Subtracao");    
		logger.info("3. Multiplicacao");    
		logger.info("4. Divisao");    
        System.out.println("0. Sair");    
        System.out.println("Operacao: ");    
        opcao = input.nextInt();  
        while (opcao != 0) {
			Scanner input1 = new Scanner(System.in);    
			logger.info("Qual o primeiro numero: ");  
			num1 = input1.nextInt();  
			logger.info("Qual o segundo numero: ");  
			num2 = input1.nextInt();
			if ( opcao == 1 ) {
				int operacao = som(num1, num2);
                System.out.printf("\nO resultado da soma é: %d\n", operacao);  
                break;  
            }  
            else if (opcao == 2) { 
				int operacao = sub(num1, num2);
				System.out.printf("\nO resultado da subtracao é: %d\n", operacao);  
				break;  
			}  
			else if (opcao == 3) {
				int operacao = mult(num1, num2); 
				System.out.printf("\nO resultado da multiplicacao é: %d\n", operacao);    
				break;  
			}  
			else if (opcao == 4) {  
				int operacao = div(num1, num2);  
				System.out.printf("\nO resultado da divisao é: %d\n", operacao);   
				break;  
			}  
			else{  
				System.out.println("????");  
				break;  
			}      
        } 
    }  

      
    public static int som(int num1, int num2) {
        return num1 + num2;
    }  
    public static int sub(int num1, int num2){
        return num1 - num2;
    }  
    public static int div(int num1,int num2){
        return num1 / num2;
    }  
    public static int mult(int num1, int num2){
        return num1 * num2;
    }  
}

