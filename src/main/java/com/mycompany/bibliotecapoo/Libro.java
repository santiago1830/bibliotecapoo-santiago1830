package com.mycompany.bibliotecapoo;

public class Libro {
    private int anoPublicacion;
    private String titulo;
    private String autor;
    private String genero;
    private boolean leido;
    
    public Libro(int annioPublicacion, String titulo,String autor, String genero, boolean leido){
        this.anoPublicacion = annioPublicacion;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.leido = leido;
    }
    
    public String mostrarInformación(){
        return ("Título: " + titulo + ", Autor: " + autor + ", Año de publicación: " + anoPublicacion + ", Género: " + genero);
    }
    
    public void marcarLeido(){
        leido = true;
    }
    
    public boolean esAntiguo(){
        return (2024 - anoPublicacion > 50);
    }
    
    public boolean getLeido(){
        return this.leido;
    }
}
