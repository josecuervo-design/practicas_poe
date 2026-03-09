public class Humano {
String nombre;
String apellido;
byte edad;
int numeroTelefono;
 

public Humano (String Nombre,String Apellido){

nombre=Nombre;
apellido=Apellido;
};



public void  hablar(String nombre){

    if(nombre.equals("jose")){
        System.out.println("hola "+nombre);

    }else {
        System.out.println("adios");
    };

};
}
