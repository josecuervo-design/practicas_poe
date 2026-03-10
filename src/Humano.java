public class Humano {
String nombre;
String apellido;
byte edad;
int numeroTelefono;

public Humano (String nombre,String apellido,byte edad){
this.nombre=nombre;
this.apellido=apellido;
this.edad=edad;
}

public void  hablar(String nombre){

    if(nombre.equals("jose")){
        System.out.println("hola "+nombre);

    }else {
        System.out.println("PROGRAMMING  IS VERY EASY FOR ME BECAUSE IT IS MY NATIVE  LANGUAGE ");
    };
    
};
}
 