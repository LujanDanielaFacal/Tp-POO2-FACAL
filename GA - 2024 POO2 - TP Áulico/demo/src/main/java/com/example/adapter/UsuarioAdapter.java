package com.example.adapter;

/**
 * Adaptador que convierte un objeto UsuarioExterno a un formato adecuado para la aplicación,
 * implementando la interfaz Convertible.
 * 
 * <p>Esta clase implementa el patrón Adapter, convirtiendo objetos de tipo UsuarioExterno
 * a un formato que puede ser utilizado internamente en la aplicación. Implementa la interfaz
 * Convertible para cumplir con la conversión.</p>
 */
public class UsuarioAdapter implements Convertidor {

    /**
     * Convierte un objeto UsuarioExterno a un formato adecuado para la aplicación.
     * 
     * <p>En este caso, extrae el ID del usuario, toma el primer nombre del nombre completo
     * y utiliza el correo electrónico para generar una representación adecuada en formato String.</p>
     * 
     * @param externo El usuario en formato externo.
     * @return El usuario convertido en formato adecuado, representado como un String.
     */
    @Override
    public String convertir(Usuario externo) {
        String dni = externo.getId();
        String[] partes = externo.getNombreCompleto().split(" ");
        String nombre = partes[0]; // Solo el primer nombre
        String email = externo.getCorreoElectronico();
        
        // Formato simple para mostrar la conversión
        return "Usuario { DNI: " + dni + ", Nombre: " + nombre + ", Email: " + email + " }";
    }
}