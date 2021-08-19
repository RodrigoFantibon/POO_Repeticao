import java.util.Random;
public class ExemploRepeticao {


    public static void main (String []args){

        double nota1, nota2;
        Random gerador = new Random();
        //repeticão controlada por contador
        int totalAlunos = 1;

        while (totalAlunos <=5){

            nota1 = gerador.nextDouble() * 10; 
            nota2 = gerador.nextDouble() * 10;

            double resultado = (nota1 + nota2) / 2;
            System.out.printf("Média: %.2f\n", resultado);
            totalAlunos = totalAlunos + 1;
        }

        System.out.println("Até mais");
    }
}
