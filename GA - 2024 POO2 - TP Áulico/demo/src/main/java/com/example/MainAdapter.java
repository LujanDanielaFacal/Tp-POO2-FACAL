package com.example;

import com.example.adapter.Usuario;
import com.example.adapter.UsuarioAdapter;

/**
 * Clase principal que utiliza el adaptador para convertir usuarios.
 * 
 * <p>Esta clase es responsable de crear un objeto UsuarioExterno, convertirlo utilizando
 * el adaptador UsuarioAdapter (a través de la interfaz Convertible) y luego mostrar el
 * resultado de la conversión.</p>
 */
public class MainAdapter {
    /**
     * Método principal que ejecuta la aplicación.
     * 
     * <p>En este método, se crea un objeto UsuarioExterno con datos ficticios, luego se
     * utiliza el adaptador UsuarioAdapter para convertirlo al formato adecuado y finalmente
     * se imprime el resultado.</p>
     * 
     * @param args Argumentos de la línea de comandos (no se usan en este caso).
     */
    public static void main(String[] args) {
        // Información obtenida del sistema externo
        Usuario externo = new Usuario("12345", "Juan Pérez", "juan.perez@mail.com");
        
        // Crear el adaptador (a través de la interfaz Convertible)
        UsuarioAdapter adapter = new UsuarioAdapter();
        
        // Convertimos al formato adecuado usando el adaptador
        String interno = adapter.convertir(externo);
        
        // Usamos el usuario convertido
        System.out.println(interno);
    }
}
