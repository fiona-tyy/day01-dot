package dotpdt;

import java.io.Console;

public class Main{

    public static void main(String[] args) {

        Console cons = System.console();

        int eqnCount = Integer.parseInt(cons.readLine("Enter number of equations:"));
        int terms = Integer.parseInt(cons.readLine("Enter number of terms: "));

        int[][] equation = new int[eqnCount][terms];
        int[] coefficient = new int[terms];
        int[] dot = new int[eqnCount];

        String input;
        String[] splitInput;

        int i = 0;
        int j = 0;
        int dotProd = 0;

        while (i < equation.length){
            input = cons.readLine("Equation (%d): ", i+1);
            splitInput = input.split(" ");

            j = 0;
            while (j < equation[i].length){
                equation[i][j] = Integer.parseInt(splitInput[j]);
                j++;
            }
            i++;
        }

        input = cons.readLine("Enter weight: ");
        splitInput = input.split(" ");

        j=0;

        while (j < coefficient.length ){
            coefficient[j] = Integer.parseInt(splitInput[j]);
            j++;
        }

        i = 0;
        while (i < equation.length){
            j = 0;
            dotProd = 0;
            while (j < equation[i].length){
                dotProd += equation[i][j] * coefficient[j];
                j++;
            }
            dot[i] = dotProd;
            i++;
        }

        System.out.println("Dot product");
        i = 0;
        while (i < dot.length) {
            System.out.printf("%d, ", dot[i]);
            i++;
        }
        System.out.println();


    }


}
