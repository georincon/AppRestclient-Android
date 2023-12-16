package com.example.apirest.Model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import com.example.apirest.Model.Persona;

public class PersonaTest {

    @Test
    public void testPersonaGetterSetter() {
        // Crear una instancia de Persona
        Persona persona = new Persona();

        // Configurar valores de prueba
        int id = 1;
        String nombres = "John";
        String apellidos = "Doe";

        // Establecer valores utilizando los setters
        persona.setId(id);
        persona.setNombres(nombres);
        persona.setApellidos(apellidos);

        // Verificar que los valores se han establecido correctamente utilizando los getters
        assertEquals(id, persona.getId());
        assertEquals(nombres, persona.getNombres());
        assertEquals(apellidos, persona.getApellidos());
    }

    @Test
    public void testPersonaConstructor() {
        // Configurar valores de prueba
        int id = 1;
        String nombres = "John";
        String apellidos = "Doe";

        // Crear una instancia de Persona utilizando el constructor
        Persona persona = new Persona(id, nombres, apellidos);

        // Verificar que los valores se han establecido correctamente
        assertEquals(id, persona.getId());
        assertEquals(nombres, persona.getNombres());
        assertEquals(apellidos, persona.getApellidos());
    }

    @Test
    public void testPersonaDefaultConstructor() {
        // Crear una instancia de Persona utilizando el constructor por defecto
        Persona persona = new Persona();

        // Verificar que los valores iniciales son los esperados (por ejemplo, 0 para int, null para String)
        assertEquals(0, persona.getId());
        assertNull(persona.getNombres());
        assertNull(persona.getApellidos());
    }
}
