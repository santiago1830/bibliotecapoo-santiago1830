package com.mycompany.bibliotecapoo;


import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1) Ingresar libro");
            System.out.println("2) Mostrar todos los libros");
            System.out.println("3) Buscar libro");
            System.out.println("4) Marcar libro como leído");
            System.out.println("5) Mostrar libros no leídos");
            System.out.println("6) Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Indique el año de publicación del libro: ");
                    int annioPublicacion = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Escriba el título del libro: ");
                    String titulo = sc.nextLine();
                    System.out.println("Escriba el nombre del autor del libro: ");
                    String autor = sc.nextLine();
                    System.out.println("Indique el género del libro: ");
                    String genero = sc.nextLine();
                    boolean leido = false;
                    Libro nuevoLibro = new Libro(annioPublicacion, titulo, autor, genero, leido);
                    biblioteca.registrarLibro(nuevoLibro);
                    break;

                case 2:
                    biblioteca.mostrarLibros();
                    break;

                case 3:
                    System.out.println("Ingrese la palabra clave para buscar el libro: ");
                    sc.nextLine();
                    String palabraBusqueda = sc.nextLine();
                    Libro libroEncontrado = biblioteca.buscarLibro(palabraBusqueda);
                    if (libroEncontrado != null) {
                        System.out.println("Libro encontrado: " + libroEncontrado.mostrarInformación());
                    } else {
                        System.out.println("No se encontró ningún libro con esa palabra clave.");
                    }
                    break;

                case 4:
                    System.out.println("Ingrese el título del libro que desea marcar como leído: ");
                    sc.nextLine();
                    String tituloMarcarLeido = sc.nextLine();
                    Libro libroMarcarLeido = biblioteca.buscarLibro(tituloMarcarLeido);
                    if (libroMarcarLeido != null) {
                        libroMarcarLeido.marcarLeido();
                        System.out.println("Libro marcado como leído correctamente.");
                    } else {
                        System.out.println("No se encontró ningún libro con ese título.");
                    }
                    break;

                case 5:
                    biblioteca.mostrarLibrosNoLeidos();
                    break;

                case 6:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        }
    }
}
