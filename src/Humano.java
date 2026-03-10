public class Humano {
private String nombre;
private String apellido;
private byte edad;
private int numeroTelefono;

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
    
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getApellido() {
    return apellido;
}

public void setApellido(String apellido) {
    this.apellido = apellido;
}

public byte getEdad() {
    return edad;
}

public void setEdad(byte edad) {
    this.edad = edad;
}

public int getNumeroTelefono() {
    return numeroTelefono;
}

public void setNumeroTelefono(int numeroTelefono) {
    this.numeroTelefono = numeroTelefono;
};

}
 