
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import  java.lang.String;
import  java.util.Scanner;

public class tp7_java {

    //BURBUJA
    public static void burbuja(int[] A) {
        int i, j, aux;
        for (i = 0; i < A.length - 1; i++) {
            for (j = 0; j < A.length - i - 1; j++) {
                if (A[j + 1] < A[j]) {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
            }
        }
    }

    //SELECCION
    public static void seleccion(int A[]) {
        int i, j, menor, pos, tmp;
        for (i = 0; i < A.length - 1; i++) {
            menor = A[i];
            pos = i;
            for (j = i + 1; j < A.length; j++){
                if (A[j] < menor) {
                    menor = A[j];
                    pos = j;
                }
            }
            if (pos != i){
                tmp = A[i];
                A[i] = A[pos];
                A[pos] = tmp;
            }
        }
    }

    //INSERCIÓN
    public static void insercionDirecta(int A[]){
        int p, j;
        int aux;
        for (p = 1; p < A.length; p++){
            aux = A[p];
            j = p - 1;
            while ((j >= 0) && (aux < A[j])){
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = aux;
        }
    }

    //POR MEZCLA O QUICKSORT
    public static void quicksort(int A[], int izq, int der) {

        int pivote=A[izq];
        int i=izq;
        int j=der;
        int aux;

        while(i < j){
            while(A[i] <= pivote && i < j) i++;
            while(A[j] > pivote) j--;
            if (i < j) {
                aux= A[i];
                A[i]=A[j];
                A[j]=aux;
            }
        }

        A[izq]=A[j];
        A[j]=pivote;

        if(izq < j-1)
            quicksort(A,izq,j-1);
        if(j+1 < der)
            quicksort(A,j+1,der);

    }

    //SHELL
    public static void shell(int A[]) {

        int salto, aux, i;
        boolean cambios;

        for (salto = A.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {
                cambios = false;
                for (i = salto; i < A.length; i++)
                {
                    if (A[i - salto] > A[i]) {
                        aux = A[i];
                        A[i] = A[i - salto];
                        A[i - salto] = aux;
                        cambios = true;
                    }
                }
            }
        }
    }



    public static void main(String [] args){
        Scanner objeto = new Scanner(System.in);
        //Tp numero 7

        // Ejercicio 1
        int max = 0;
        Double b[] = new Double[10];
        Integer a[] = new Integer[10];
        for (int i = 0; i < 10; i++) {

            a[i] = (int) ((Math.random()) * 100);

        }
        Arrays.sort(a);
        ;
        for (int i = 0; i < 10; i++) {
            System.out.println(a[i]);
        }

        // Ejercicio 2
        Arrays.sort(a, Collections.reverseOrder());
        ;
        for (int i = 0; i < 10; i++) {
            System.out.println(a[i]);
        }

        // Ejercicio 3

        for (int i = 0; i < 10; i++) {
            b[i] = (Double) (Math.random() * 10);
        }
        Arrays.sort(b);
        for (int i = 0; i < 10; i++) {
            System.out.println(b[i]);
        }

        // Ejercicio 4
        Arrays.sort(b, Collections.reverseOrder());
        for (int i = 0; i < 10; i++) {
            System.out.println(b[i]);
        }

        //Ejercicio 5

        String c[] = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingresa una palabra: ");
            c[i] = objeto.nextLine();
        }
        Arrays.sort(c);
        for (int i = 0; i < 5; i++) {
            System.out.println(c[i]);
        }

        //Ejercicio 6
        Arrays.sort(c, Collections.reverseOrder());
        for (int i = 0; i < 5; i++) {
            System.out.println(c[i]);
        }

        // Ejercicio 9
        int array9[] = {5, 8, 9, 15, 12};
        int n = array9.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (array9[j] > array9[j + 1]) {
                    int temp = array9[j];
                    array9[j] = array9[j + 1];
                    array9[j + 1] = temp;
                }


            }


        }
        for (int i = 0; i < n - 1; i++) {
            System.out.println(array9[i] + " ");
        }

        // Ejercicio 10

        int array10[] = {15, 25, 4, 1, 48, 12}, menor, pos, tmp,r;
        r = array10.length;
        for (int i = 0; i < array10.length - 1; i++) {
            menor = array10[i];
            pos = i;
            for (int j = i + 1; j < array10.length; j++) {
                if (array10[j] < menor) {
                    menor = array10[j];
                    pos = j;
                }
            }
            if (pos != i) {
                tmp = array10[i];
                array10[i] = array10[pos];
                array10[pos] = tmp;
            }
        }

        for (int l = 0; l < r; l++) {
            System.out.println(array10[l] + " ");
        }

        // Ejercicio 11

            int array11 [] = {8,4,5,6,2,1} , p, h;
            int aux;
            for (p = 1; p < array11.length; p++){
                aux = array11[p];
                h = p - 1;
                while ((h >= 0) && (aux < array11[h])){
                    array11[h + 1] = array11[h];
                    h--;
                }
                array11[h + 1] = aux;
            }
        for (int l = 0; l < array11.length; l++) {
            System.out.println(array11[l] + " ");
        }

        // Ejercicio 12
        //EJERCICIO 12


        int [] array = new int[10];

        for (int i = 0; i < array.length; i++){
            array[i] =(int) (Math.random()*100);
        }

        quicksort(array, 0, array.length-1);

        System.out.println("El array ordenado es: ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

        //EJERCICIO 13


        int [] array13 = new int[10];

        for (int i = 0; i < array13.length; i++){
            array13[i] = (int)(Math.random()*100);
        }

        shell(array13);

        System.out.println("El array ordenado es: ");
        for (int i = 0; i < array13.length; i++){
            System.out.print(array13[i] + " ");
        }

        //EJERCICIO 14


        int [] array14 = new int[20];
        int optionAorD, optionMetod;

        for (int i = 0; i < array14.length; i++){
            array14[i] = (int)(Math.random()*100);
        }

        System.out.println("El arreglo desordenado es: ");

        for (int i : array14){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("[1] Para inserción \n" +
                "[2] Para burbuja \n" +
                "[3] Para selección \n" +
                "Que metodo desea utilizar: ");

        optionMetod = objeto.nextInt();

        if(optionMetod == 1){
            insercionDirecta(array14);
        } else if (optionMetod == 2) {
            burbuja(array14);
        } else if (optionMetod == 3) {
            seleccion(array14);
        }else {
            System.out.println("Opción ingresada incorrecta");
        }

        System.out.print("[1] Para ascendente \n" +
                "[2] Para descendente \n" +
                "¿De que manera desea ordenar el array?: ");

        optionAorD = objeto.nextInt();

        System.out.println("El arreglo ordenado es: ");
        if(optionAorD == 1){
            for (int i : array14){
                System.out.print(i + " ");
            }
        } else if (optionAorD == 2) {
            int j, k;
            j = 0;
            k = array14.length-1;

            int [] arrayAux = new int[20];

            while (j < array14.length){
                arrayAux[j] = array14[k];
                j++;
                k--;
            }

            for (int i : arrayAux){
                System.out.print(i + " ");
            }
        }

    }
}
