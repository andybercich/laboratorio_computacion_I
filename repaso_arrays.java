import java.lang.reflect.Array;
import java.util.Arrays;

public class repaso_arrays {
    public  static String contarPares(int array[]){
        int par = 0;
        for(int i = 0; i< array.length;i++){
            if (array[i]%2 == 0 && array[i]!=0){
                par+=1;
            }
        }
        return ("La cantidad de números pares es: "+ par);

    }
    public static String contarMayoresdiez(double array[]){
        int mayores = 0;
        for(int i = 0; i< array.length;i++){
            if(array[i]>10){
                mayores +=1;
            }
        }
        return ("La cantidad de numeros mayores a 10 es: "+ mayores);

    }
    public  static String numeroMayor(int array[]){
        int max = 0;
        for(int i = 0; i<array.length; i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        return ("El número máximo del array es: " + max);

    }
    public static String sumaMultiplos(int array[]){
        int sum_multiplos3 =0;
        for(int i = 0; i< array.length; i++){
            if (array[i]%3 == 0){
                sum_multiplos3 = array[i]+ sum_multiplos3;
            }
        }
        return("La suma de los números que son multiplos de 3 son: "+ sum_multiplos3);
    }
    public static String minimoCadenas(String array[]){
        String min = "";
        Arrays.sort(array);
        for (int i = 0; i <array.length; i++){
            if( i == 0){
                min = array[i];
            }
        }
        return ("La menor cadena es: "+ min);
    }
    public static int[] copiaArray(int array[]){
        int array2[] = new int[array.length];
        for(int i = 0; i<array.length;i++){
            array2[i] = array[i];
        }
        return array2;
    }


    public static void main(String[] args) {
        // Declaración e Inicialización

        //Ejercicio 1
        /*
        int array1 []= new int[10];
        for(int i = 0; i<10;i++){
            array1[i] = i+1;

        }
        for (int i=0;i<10;i++){
            System.out.print(array1[i]+ " ");
        }
        */
        //Ejercicio 2
        /*
        int array2 [] = new int[10], aux2=1, aux1 = 1, div = 0, prim = 0, l = 0;


            while (prim<10) {
                while (aux1 <= aux2) {

                    if (aux2 % aux1 == 0) {
                        div += 1;
                    }
                    aux1 += 1;
                }

                if(div<3){
                    array2[l]=aux2;
                    prim+=1;
                    l+=1;
                }
                aux2+=1;
                div = 0;
                aux1=1;
            }

        for(int i=0; i<10;i++){
            System.out.println(array2[i]);
        }
         */

        //Ejercicio 3
        /*
        int var =0;
        int array3 [][] = new int[10][10];
        for(int i = 0; i<10;i++){
            for (int n = 0; n<10;n++){
                array3[i][n] = var;
                var+=1;
            }
        }
        for(int i = 0; i<10;i++){
            for (int n = 0; n<10;n++){
                System.out.print(array3[i][n] + " ");
            }
            System.out.println(" ");
        }
        */

        //Ejercicio 4
        /*
        int array4 [][][] = new int[3][3][3], var3 = 0;
        for(int i = 0; i<3;i++){
            for(int j = 0; j<3 ; j++) {
                for (int k = 0; k < 3; k++) {
                    array4[i][j][k] = var3;
                    var3 += 1;
                }
                var3 = 1;
            }
            var3 = 2;
        }
        for(int i = 0; i<3;i++){
            for(int j = 0; j<3 ; j++){
                for(int k= 0; k<3;k++){
                    System.out.print(array4[i][j][k]+ " ");
                }
                System.out.println(" ");
            }
        }


        // Lectura y Escritura
        //Ejercicio 1
        int array5 [] = new int[10];
        for(int i = 0; i<array5.length;i++){
            System.out.println(" Ingresa un valor entero para el array " + (i+1+": "));
            array5[i] = objeto.nextInt();

        }
        // Ejercicio 2
        double array6 [] = new double[10];
        for(int i = 0;i < array6.length;i++){
            System.out.println("Ingresa un valor real para el array "+ (i+1)+ " :");
            array6[i] = objeto.nextDouble();
        }

        //Ejercicio 3
        char array7[] = new char[5];
        for(int i = 0;i<array7.length;i++){
            System.out.println("Ingresa un caracter: ");
            array7[i] = objeto.next().charAt(0);
        }

        for(int i = 0; i<array7.length;i++){
            System.out.print (array7[i]+ "  ");
        }

        //Ejercicio 4
        boolean array8[] = new boolean[4];
        for(int i = 0; i<array8.length;i++){
            System.out.println("Ingresa un dato booleano: ");
            array8[i] = objeto.nextBoolean();
        }
        for(int i = 0; i<array8.length;i++){
            System.out.print (array8[i]+ "  ");
        }

        // Operaciones Aritméticas
        // Ejercicio 1
        int array9[] = {12,4,5,8,7,9,54,1,45,125}, sum = 0;
        for(int i = 0;i<array9.length;i++){
            sum+= array9[i];
        }
        System.out.println(sum);
        // Ejercicio 2
        double array10[] = {10.5,10.5,10.45,4.15,12.8,7.125,7.587,8.124,6.12,3.12}, sum_multi = 1 ;
        for(int i = 0; i< array10.length;i++){
            sum_multi+= sum*array10[i];
        }
        System.out.println( sum_multi);
        //Ejercicio 3
        Arrays.sort(array9);
        for(int i = 0; i< array10.length; i++) {
            System.out.println(array9[i]);
        }

        //Ejercicio 4
        String array11[] = {"asdf","hfgds","hrgefd","plioukyj","rthdgfv","yrtgb","awscd","trgvf","esdvf","eadsvx"};
        Arrays.sort(array11);
        for(int i = 0; i< array11.length;i++){
            System.out.println(array11[i]);
        }
        */
        // Ejercicio Adicionales





    }
}
