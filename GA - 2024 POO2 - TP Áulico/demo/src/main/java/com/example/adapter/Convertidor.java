package com.example.adapter;

/**
 * Interfaz que define un método para convertir objetos de un formato a otro.
 * 
 * <p>Esta interfaz permite la conversión de objetos de un tipo a otro,
 * lo que permite la adaptación de objetos provenientes de sistemas externos
 * a un formato que es manejado por la aplicación.</p>
 */
public interface Convertidor {

    /**
     * Convierte un objeto de tipo UsuarioExterno a un formato adecuado para la aplicación.
     * 
     * <p>Este método debe ser implementado por las clases que deseen realizar la conversión de 
     * un objeto de tipo UsuarioExterno a un formato que la aplicación pueda manejar internamente.</p>
     * 
     * @param externo El usuario en formato externo.
     * @return El usuario convertido en el formato adecuado para la aplicación.
     */
    public String convertir(Usuario externo);
}