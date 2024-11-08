package com.example.adapter;


/**
 * Clase que representa el usuario en el formato del sistema externo.
 * 
 * Esta clase contiene los atributos del usuario en un sistema externo,
 * como su ID, nombre completo y correo electrónico.
 * 
 * <p>La clase es usada para representar la información que llega desde un sistema externo
 * que debe ser convertida al formato interno de la aplicación.</p>
 */
public class Usuario {
    private String id;
    private String nombreCompleto;
    private String correoElectronico;

    /**
     * Constructor que inicializa los atributos del usuario.
     * 
     * @param id El identificador único del usuario en el sistema externo.
     * @param nombreCompleto El nombre completo del usuario en el sistema externo.
     * @param correoElectronico El correo electrónico del usuario en el sistema externo.
     */
    public Usuario(String id, String nombreCompleto, String correoElectronico) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.correoElectronico = correoElectronico;
    }

    /**
     * Obtiene el ID del usuario en el sistema externo.
     * 
     * @return El ID del usuario.
     */
    public String getId() { 
        return id; 
    }

    /**
     * Obtiene el nombre completo del usuario en el sistema externo.
     * 
     * @return El nombre completo del usuario.
     */
    public String getNombreCompleto() { 
        return nombreCompleto; 
    }

    /**
     * Obtiene el correo electrónico del usuario en el sistema externo.
     * 
     * @return El correo electrónico del usuario.
     */
    public String getCorreoElectronico() { 
        return correoElectronico; 
    }
}