import java.util.Scanner;
public class repaso_parcial {
    public static void main(String[] args) {
        Scanner objeto = new Scanner(System.in);
        int a = 0;

            System.out.println("INGRESA UN NÚMERO ENTERO: ");
             a = objeto.nextInt();
             System.out.println("INGRESA OTRO NÚMERO: ");
             int b = objeto.nextInt();

        if ( a%10 == b%10 ){
            System.out.println("LOS DOS NÚMEROS INGRESADOS TIENEN LA MISMA ÚLTIMA CIFRA");

        } else{

            System.out.println("LA ÚLTIMA CIFRA DE LOS DOS NÚMERO NO ES LA MISMA");

        }
        int c = 99;
        while (c >999 || c <100){
            System.out.println("INGRESA UN NÚMERO DE TRES CIFRAS PARA SABER SI ES CAPICUA: ");
            c = objeto.nextInt();
        }

        if (c%10 == (c/100)){
            System.out.println("EL NÚMERO ES CAPICUA");
        }
        else{
            System.out.println("EL NÚMERO NO ES CAPICUA");
        }


    }
}
