

import java.util.Random;
import java.util.Scanner;

public class Solution
{
    public class ArraysBidimensionals
    {
        Scanner teclat = new Scanner(System.in);

        // 9. Escriu un programa que llegeixi un nombre N i que creï una matriu quadrada d'enters aleatoris entre 0 i 9, i que imprimeixi la matriu original i tot seguit, les posicions de la matriu que formen una N (primera i última columnes i diagonal principal).
//        Per exemple, donada la matriu:
//
//        3 5 6 7
//        2 4 5 7
//        1 4 0 7
//        2 5 6 8
//        El programa escriuria per pantalla:
//
//        3      7
//        2 4   7
//        1   0 7
//        2      8
//        Tingueu en compte que després de cada nombre hi ha un espai.


            System.out.println("Introduce numero de columnas");
        int N =teclat.nextInt();

        int[][] a = new int [N][N];

        for (int i =0 ;i<N; i++){
        for(int j=0;j<N;j++) {
            a[i][j]= teclat.nextInt();
        }
    }

        for (int i =0 ;i<N;i++){
        for(int j=0;j<N;j++) {
            System.out.print(a[i][j]+" ");
        }
        System.out.print("");
    }

        for (int i =0 ;i<N;i++){
        for(int j=0;j<N;j++) {
            if(j==0 || j==N-1 || i==j)
                System.out.print(a[i][j]+" ");
        }
        System.out.print("");
    }

    }
}


    }
}
