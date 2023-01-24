import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegistrationUtilTest {

    RegistrationUtil registro = new RegistrationUtil();

    @Test
    @DisplayName("Usuario o contraseña no vacios")
    public void username1() {
        boolean result = registro.valida("", "123", "123");
        assertFalse(result);
    }

    @Test
    @DisplayName("El username no contiene el caracter #")
    public void username2() {
        boolean result = registro.valida("Jose#", "123", "123");
        assertFalse(result);
    }

    @Test
    @DisplayName("La contraseña no tiene una longitud menor a 8 caracteres")
    public void password1() {
        boolean result = registro.valida("Jose", "123", "123");
        assertFalse(result);
    }

    @Test
    @DisplayName("Las contraseñas no coinciden")
    public void password2() {
        boolean result = registro.valida("Jose", "12345678", "abcdefghi");
        assertFalse(result);
    }

    @Test
    @DisplayName("Pasa todos los criterios")
    public void password3() {
        boolean result = registro.valida("Jose", "12345678", "12345678");
        assertTrue(result);
    }

}