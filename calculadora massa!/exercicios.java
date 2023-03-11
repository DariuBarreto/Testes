
/**
 * Escreva uma descrição da classe exercicios aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;

public class exercicios {
      public static void main(String args[]) {
            double val1, val2, resultado = 0;
            int op = 0;
            Scanner teclado = new Scanner(System.in);

            System.out.print("informe o primeiro valor: ");
            val1 = teclado.nextDouble();

            System.out.print("informe o segundo valor: ");
            val2 = teclado.nextDouble();

            System.out.print("informe a operação desejada: 1 - adição 2 - subtração 3 - multiplicação 4 - divisão");
            op = teclado.nextInt();

            if (op == 1) {
                  resultado = val1 + val2;
            }
            if (op == 2) {
                  resultado = val1 - val2;
            }
            if (op == 3) {
                  resultado = val1 * val2;
            }
            if (op == 4) {
                  resultado = val1 / val2;
            }
            if (op >= 5 || op <= 0) {
                  System.out.print("não existe essa operação seu animal de teta gorda!");
            } else {
                  System.out.println("resultado:" + resultado);
            }

      }
}
