import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class declaradores_operadores {
    public static void main (String[] args) throws IOException {
        Scanner objeto = new Scanner(System.in);
       //EJERCICIO 1:
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("INGRESA UN NÚMERO:");
        int a = sc.nextInt();
        System.out.print("INGRESA OTRO NÚMERO:");

        int b = sc.nextInt();
        System.out.println(a);
        System.out.println(b);
            */
        //EJERCICIO 2:
        /*
        Scanner objeto_practica = new Scanner(System.in);
        System.out.println("INGRESA TU NOMBRE: ");
        String c = objeto_practica.nextLine();
        System.out.println("BIENVENID@ "+ c); */
        //EJERCICIO 3:
        /*
        Scanner objeto = new Scanner(System.in);
        System.out.print("INGRESA UN NÚMERO: ");
        int number = objeto.nextInt();
        System.out.println("EL DOBLE DEL NÚMERO "+number+ " ES:" + number*2);
        System.out.println("EL TRIPLE DEL NÚMERO "+number+ " ES:" + number*3);
         */

        //EJERCICIO 4:
        /*
        Scanner objeto = new Scanner(System.in);
        System.out.println("INGRESA LA TEMPERATURA EN GRACOS CELSIUS PARA PASARLO A FARENHEIT: ");
        float grados_celsius = objeto.nextFloat();
        float grados_farenheit = 32+(9*grados_celsius/5);
        System.out.println("ESTOS GRADOS "+grados_celsius +"°C, SE CONVIERTEN EN "+ grados_farenheit+"°F");
            */
        //EJERCICIO 5
        /*

        System.out.println("INGRESE EL RADIO DEL CIRCULO: ");
        float radio = objeto.nextFloat();

        float long_circu = (float) (2*3.1416)*radio;
        System.out.println("LA LONGITUD DE LA CIRCUNFERENCIA ES: "+long_circu);
        float area = (float)3.1416*(radio*radio);
        System.out.println("EL ÁREA DE LA CIRCUNFERENCIA ES: "+area); */


        //EJERCICIO 6
        /*
        System.out.print("INGRESA LA VELOCIDAD EN KM/H: ");
        float km_h = (float)objeto.nextFloat();
        float m_s = (float)(km_h*1000)/3600;
        System.out.println("VA A "+m_s+"m/s"); */

        //EJERCICIO 7
        /*

        System.out.println("INGRESE EL PRIMER CATETO: ");
        float c1 = objeto.nextFloat();
        System.out.println("INGRESE EL SEGUNDO CATETO: ");
        float c2 = objeto.nextFloat();
        float hip = (float) Math.sqrt(Math.pow(c2,2)+Math.pow(c1,2));
        System.out.println("LA HIPOTENUSA VALE: "+ hip); */

        //EJERCICO 8
        /*
        System.out.println("INGRESE EL RADIO DE LA CIRCUNFERENCIA PARA CALCULAR SU VOLUMEN: ");
        float radio = objeto.nextFloat();
        float volumen =(float) ((4.0/3)* Math.PI * Math.pow(radio, 3));
        System.out.println("EL VOLUMEN ES: "+ volumen);*/

        //EJERCICIO 9
        /*
        System.out.println("INGRESE EL LADO 1: ");
        float a = objeto.nextFloat();
        System.out.println("INGRESE EL LADO 2: ");
        float b = objeto.nextFloat();
        System.out.println("INGRESE EL LADO 3: ");
        float c = objeto.nextFloat();
        float p = (a+b+c)/2;
        float area = (float) (Math.sqrt(p*(p-a)*(p-b)*(p-c)));
        System.out.print("EL AREA DEL TRIANGULO ES: " +area);*/

        //EJERCICIO 10
        /*
        System.out.println("INGRESA UN NÚMERO DE TRES CIFRAS: ");
        int number = objeto.nextInt();
        System.out.println(number/100);
        System.out.println((number/10)%10);
        System.out.println(number%10);*/

        //EJERCICIO 11
        /*
        System.out.println("INGRESA UN NÚMERO DE 5 DIGITOS: ");
        int number = objeto.nextInt();
        System.out.println(number/10000);
        System.out.println(number/1000);
        System.out.println(number/100);
        System.out.println(number/10);
        System.out.println(number); */




        //EJERCICIO 12
        /*
        System.out.println("INGRESA UN NÚMERO DE 5 CIFRAS: ");
        int number = objeto.nextInt();
        System.out.println(number%10);
        System.out.println(number%100);
        System.out.println(number%1000);
        System.out.println(number%10000);
        System.out.println(number); */



        //EJERCIO 13
        /*
        System.out.println("INGRESA EL DÍA EN QUE NACISTE: ");
        int a = objeto.nextInt();
        System.out.println("INGRESA EL MES EN EL QUE NACISTE: ");
        int b = objeto.nextInt();
        System.out.println("INGRESA TU AÑO DE NACIMIENTO: ");
        int c = objeto.nextInt();
        int suma = a + b+ c;
        int d = suma/1000+ suma/100%10 + suma/10%10+suma%10;
        System.out.println("TU NÚMERO DE LA SUERTE ES: "+ d); */

        //EJERCICIO 14
        /*
        System.out.println("INGRESE EL PRECIO DEL PRODUCTO: ");
        float precio = objeto.nextFloat();
        System.out.println("INGRESE LA CANTIDAD DE PRODUUCTOS A COMPRAR:");
        int cantidad = objeto.nextInt();
        System.out.println("INGRESE QUE PORCENTAJE DE IVA TIENE EL PRODUCTO: ");
        float iva = objeto.nextFloat();
        float total = (precio*cantidad*(iva/100))+(precio*cantidad);
        System.out.println("LA CANTIDAD TODAL A PAGAR ES: " + total); */

        //EJERCICIO 15
        /*
        System.out.println("INGRESE UN NÚMERO: ");
        int number = objeto.nextInt();
        System.out.println("INGRESE LA CANTIDAD DE ÚLTIMAS CIFRAS QUE DESEA QUITAR: ");
        int ext = objeto.nextInt();

        int number2 = (int) (number/Math.pow(10,ext));
        System.out.println("EL NÚMERO CON LAS CIFRAS QUITADAS ES: "+number2); */

        //EJERCICIO 16
        /*
        System.out.println("INGRESE LOS GRADOS CENTIGRADOS QUE DESEA TRANSFORMAR EN KELVIN Y REAUMUR: ");
        float cel = objeto.nextFloat();
        float rem = (float) (cel*0.8);
        float kel = (float) (cel+273.15);
        System.out.println("LOS GRADOS CELSIUS EN REAMUR SON "+rem + "°R Y EN KELVIN ES " +kel +"°K"); */



    }
}
