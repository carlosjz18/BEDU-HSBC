public class RegistrationUtil {

    /**
     * La entrada no es válida si ...
     * ... username/password es vacío
     * ...El username contiene el caracter #
     * ...Las contraseña no coinciden
     * ...La contraseña tiene una longitud menor a 8 caracteres
     */
    /*public boolean valida(String username, String password, String confirmP) {
        return true;
    }*/
    public boolean valida(String username, String password, String confirmP) {
        if (username.isEmpty() || password.isEmpty() || confirmP.isEmpty()) return false;
        if (username.contains("#")) return false;
        if (password != confirmP) return false;
        if (password.length() < 8) return false;
        return true;
    }

}
