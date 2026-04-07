package com.sena;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        
        Aprendiz aprendiz1 = new Aprendiz("123456789", "Juan Perez", "juan@gmail.com", 25);
        Aprendiz aprendiz2 = new Aprendiz("987654321", "Maria Gomez", "maria@gmail.com", 22);
        Aprendiz aprendiz3 = new Aprendiz("823417461", "Carlos Lopez", "Carlos@gmail.com", 23);

        ArrayList <Aprendiz> ficha = new ArrayList<>();
        ficha.add(aprendiz1);
        ficha.add(aprendiz2);
        ficha.add(aprendiz3);

        for(Aprendiz aprendiz : ficha){
            System.out.println(aprendiz.presentarse());
        }

        aprendiz1.setCorreo("juan.perez@outlook.com");

        System.out.println("Información actualizada de aprendiz1: " + aprendiz1.presentarse());

        try {
        aprendiz2.setCorreo("mariagmail.com");
        } 
        
        catch (IllegalArgumentException e) {
        System.out.println("Error al actualizar correo de aprendiz2: " + e.getMessage());
        }
    }
} 