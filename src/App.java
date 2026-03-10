import java.util.Scanner;
public class App {
 
    public static void main(String[] args) {

        Scanner palabra=new Scanner(System.in);

        System.out.println("ingrese  su nombre: ");
        String nombre=palabra.nextLine();

        Humano jose=new Humano(nombre,"cuervo",(byte)24);
        jose.hablar(nombre);
        System.out.println("la edad de " +jose.nombre+" es:"+jose.edad);




    

    palabra.close();
    }





 
}
