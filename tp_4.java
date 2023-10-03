import java.util.Random;
import java.util.Scanner;
import  java.util.Random;
public class tp_6 {
    public static int[] numeroAleatorio(int minimo,int maximo,int tamanioArray){
        int [] array = new int [tamanioArray];
        int n=0;
        Random rm=new Random();

        for(int i=0;i<tamanioArray;i++){
            n =rm.nextInt(minimo,maximo);


            array[i]=n;
        }
        return array;
    }
    public static int numeroEntero() {
        Scanner sc = new Scanner(System.in);

        int number;

        System.out.print("Ingrese un número entero: ");
        number = sc.nextInt();

        return number;
    }

    public static int[][] generarMatriz() {
        Scanner sc = new Scanner(System.in);
        int numFilas, numColumnas;

        System.out.print("Ingrese el número de filas: ");
        numFilas = sc.nextInt();

        System.out.print("Ingrese el número de columnas: ");
        numColumnas = sc.nextInt();

        int[][] matriz = new int[numFilas][numColumnas];
        return matriz;
    }

    public static void llenarMatriz(int matriz[][]) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Llenar la matriz en la posicion [" + (i + 1) + "] [" + (j + 1) + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
    }

    public static void mostrarMatriz(int matriz[][]) {
        System.out.println("La matriz es: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void sumarMatrices(int matrizA[][], int matrizB[][]) {
        int matrizC[][] = new int[matrizA.length][];

        System.out.println("La suma de las matrices es: ");
        for (int i = 0; i < matrizA.length; i++) {
            matrizC[i] = new int[matrizA[i].length];
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
                System.out.print(matrizC[i][j] + " ");
            }
            System.out.println();
        }
    }


        public static void main(String[] args) {
            Random random = new Random();
            Scanner objeto = new Scanner(System.in);
            Scanner sc = new Scanner(System.in);


            //EJERCICIO 1
        /*
        int array[] = new int[10];
        int positivos = 0, negativos = 0;

        for (int i : array) {
            System.out.print("Ingrese un número: ");
            array[i] = sc.nextInt();

            if (array[i] > 0) {
                positivos += 1;
            } else if (array[i] < 0) {
                negativos += 1;
            }
        }
            System.out.println("La media de números negativos ingresados es de: " +
                    ((negativos * 100) / 10) + "%" + "\n" + "La media de números positivos ingresados es de: " + ((positivos * 100) / 10) + "%"); */

            //EJERCICIO 2
        /*

        int array[] = new int[10];
        int positivos = 0, negativos = 0;

        for (int i : array) {
            System.out.print("Ingrese un número: ");
            array[i] = sc.nextInt();

            if (i % 2 == 0) {
                if (array[i] > 0) {
                    positivos += 1;
                } else if (array[i] < 0) {
                    negativos += 1;
                }
            }
        }
        System.out.println("La media de números negativos pares ingresados es de: " +
                ((negativos * 100) / 10) + "%" + "\n" + "La media de números positivos pares ingresados es de: " + ((positivos * 100) / 10) + "%"); */

            //EJERCICIO 3
        /*

        int numAlumnos;
        float contadorNotas = 0;

        System.out.print("Ingrese la cantidad de alumnos: ");
        numAlumnos = sc.nextInt();

        float arrayAlumnos [] = new float[numAlumnos];

        for(int i=0; i < numAlumnos; i++){
            System.out.print("Ingrese la nota del alumnos: ");
            arrayAlumnos[i] = sc.nextFloat();

            contadorNotas += arrayAlumnos[i];
        }
        contadorNotas = contadorNotas/numAlumnos;

        System.out.println("La media es: " + (contadorNotas));
        for(int i=0; i < numAlumnos; i++){

            if(arrayAlumnos[i] > contadorNotas){
                System.out.println("El almumno ["+(i+1)+"] tiene una nota mas alta que la media");
            }
        } */


        // Ejercicio 4
            /*
        int pares [] = new int [20];
        int a = 0;
        for(int i = 1; i<41;i++){

            if(i%2==0){
                pares[a] = i;
                a+=1;
            }

        }
        for (int i = 0; i<20;i++){
            System.out.print(pares[i]+ " ");
        }
        */



        // Ejercicio 5
            /*
        int positivos,negativos,cero;
        positivos=0;
        negativos=0;
        cero = 0;
         int lista1[] = new int[10];

         for (int i = 0; i<10;i++){
             System.out.println("Ingresa un número entero: ");
             lista1[i]= objeto.nextInt();
         }
         for (int i = 0; i<10;i++){
             if (lista1[i]>0){
                 positivos +=1;
             } else if (lista1[i]<0) {
                 negativos +=1;
             } else if (lista1[i]==0) {
                 cero+=1;
             }

         }

         System.out.println("La cantidad de números positivos que se ingresó son: "+positivos+ "\n"+ "La cantidad de números negativos es: "+ negativos+"\n"+"La cantidad de número igual a cero es: "+ cero );
        */


        // Ejercicio 6
            /*
        int positiv,negativ;
        positiv=0;
        negativ=0;
        int lista2[] = new int[10];

        for (int i = 0; i<10;i++) {
            System.out.println("Ingresa un número entero: ");
            lista2[i] = objeto.nextInt();
            if (lista2[i]>0){
                positiv+=1;
            } else if (lista2[i]<0) {
                negativ+=1;
            }
        }
        System.out.println("El porcentaje de números negativos ingresados es de: " + ((negativ*100)/10) +"%"+ "\n" + "El porcentaje de números positivos ingresados es de: " + ((positiv*100)/10)+"%");
        */

            //Ejercicio 7

        /*int i,altInf,altSup;
        double sumaAlturas = 0;
        altSup=altInf=0;

        System.out.println("Ingrese la cantidad de personas: ");
        int cant =sc.nextInt();
        double [] altura = new double[cant];

        for(i=0;i<cant;i++){
            System.out.println("Ingrese la altura de la persona "+ (i+1) +": ");
            altura[i] =sc.nextFloat();
        }

        for ( i = 0; i < cant; i++) {
            sumaAlturas += altura[i];
        }
        double altMedia = sumaAlturas / cant;

        for ( i = 0; i < cant; i++) {
            if(altura[i]>altMedia){
                altSup+=1;
            }else if (altura[i]<altMedia){
                altInf+=1;
            }
        }

        System.out.println("Altura media: " + altMedia);
        System.out.println("Personas con altura superior a la media: " + altSup);
        System.out.println("Personas con altura inferior a la media: " + altInf);*/

            //Ejercicio 8
        /*double sueldoMayor=0;
        int indiceEmpleado=0;

        double [] sueldo_empleados = new double[20];
        String [] nombre_empleados = new String[20];

        for (int i=0;i<20;i++){
            System.out.println("Ingrese el nombre del empleado "+ (i+1) +": ");
            nombre_empleados[i] =sc.nextLine();

            System.out.println("Ingrese el sueldo del empleado "+ (i+1) +": ");
            sueldo_empleados[i] =sc.nextDouble();
            sc.nextLine();

            if (sueldo_empleados[i]>sueldoMayor){
                sueldoMayor=sueldo_empleados[i];
                indiceEmpleado=i;
            }
        }

        System.out.println("El empleado con el mayor sueldo es:");
        System.out.println("Nombre: " + nombre_empleados[indiceEmpleado]);
        System.out.println("Sueldo: " + sueldo_empleados[indiceEmpleado]);*/

            //Ejercicio 9
            /*
            int tamanioArray,minimo,maximo;
            minimo=0;
            maximo=100;
            tamanioArray=10;


            int [] arrayAleatorio= numeroAleatorio(minimo,maximo,tamanioArray);
            for(int i=0;i<tamanioArray;i++){
                System.out.print(arrayAleatorio[i]+" ");
            }
            */


            //EJERCICIO 10

            //A
            /*
            int numFilas, numColumnas;

            System.out.print("Ingrese el número de filas: ");
            numFilas = sc.nextInt();

            System.out.print("Ingrese el número de columnas: ");
            numColumnas = sc.nextInt();

            int[][] matrizA = new int[numFilas][numColumnas];
            int[][] matrizB = new int[numFilas][numColumnas];
            int[][] matrizC = new int[numFilas][numColumnas];
            for (int i = 0; i < numFilas; i++) {
                for (int j = 0; j < numColumnas; j++) {
                    matrizA[i][j] = random.nextInt(100);
                    matrizB[i][j] = random.nextInt(100);

                    matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
                }
            }

            System.out.println("La matriz A es: ");
            for (int i = 0; i < numFilas; i++) {
                for (int j = 0; j < numColumnas; j++) {
                    System.out.print(matrizA[i][j] + " ");
                }
                System.out.println("");
            }

            System.out.println("La matriz B es: ");
            for (int i = 0; i < numFilas; i++) {
                for (int j = 0; j < numColumnas; j++) {
                    System.out.print(matrizB[i][j] + " ");
                }
                System.out.println("");
            }

            System.out.println("La matriz C es: ");
            for (int i = 0; i < numFilas; i++) {
                for (int j = 0; j < numColumnas; j++) {
                    System.out.print(matrizC[i][j] + " ");
                }
                System.out.println("");
            }
            */
            //B

        /*
        int num = numeroEntero();
        System.out.println("El número entero es: "+num);

        int matriz[][] = generarMatriz();
        int matriz2[][] = generarMatriz();
        llenarMatriz(matriz);
        mostrarMatriz(matriz);
        llenarMatriz(matriz2);
        mostrarMatriz(matriz2);

        sumarMatrices(matriz, matriz2);
        */
        //EJERCICIO 11
        /*
        int numFilas, numColumnas;

        System.out.print("Ingrese el número de filas: ");
        numFilas = sc.nextInt();

        System.out.print("Ingrese el número de columnas: ");
        numColumnas = sc.nextInt();

        int [][] matrizA = new int[numFilas][numColumnas];
        for (int i = 0; i < numFilas; i++){
            for(int j = 0; j < numColumnas; j++){
                matrizA[i][j] = random.nextInt(100);
            }
        }

        System.out.println("La matriz A es: ");
        for (int i = 0; i < numFilas; i++){
            for(int j = 0; j < numColumnas; j++){
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("La matriz transpuesta es: ");
        for (int i = 0; i < numColumnas; i++){
            for(int j = 0; j < numFilas; j++){
                System.out.print(matrizA[j][i] + " ");
            }
            System.out.println();
        }  */


        }
    }


