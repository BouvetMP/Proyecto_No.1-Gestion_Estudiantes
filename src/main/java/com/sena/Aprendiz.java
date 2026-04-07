package com.sena;

public class Aprendiz {

    private String documento;
    private String nombre;
    private String correo;
    private int edad;

    //public Aprendiz(){}

    public Aprendiz(String documento, String nombre, String correo, int edad){
        this.documento = documento;
        this.nombre = nombre;

        setCorreo(correo);
        setEdad(edad);

    }

        public String getDocumento() {return documento;}
        public String getNombre() {return nombre;}
        public String getCorreo() {return correo;}
        public int getEdad() {return edad;}

        public void setNombre(String nombre){
         this.nombre = nombre;
        }

        public void setDocumento(String documento){
         this.documento = documento;
        }

        public void setCorreo(String correo){
            if (correo == null || !correo.contains("@")) {
                throw new IllegalArgumentException("Correo inválido. Debe contener '@'.");
        }
        this.correo = correo;
        }

        public void setEdad(int edad){
            if(edad < 0) {
                throw new IllegalArgumentException("La edad no puede ser negativa.");
            }
        this.edad = edad;
        }
    
        public String presentarse() {
            return "Aprendiz {" +  "documento ='" + documento + '\'' + ", nombre ='" + nombre + '\'' + ", correo ='" + correo + '\'' + ", edad=" + edad +
        '}';

        }
} 
