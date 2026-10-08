public class AuthBiometrica implements MetodoaAutenticacion {
    public boolean autenticar(String credencialPrincipal, String credencialSecundaria) {

        if (credencialPrincipal.equals("huellaCorrecta") &&
                credencialSecundaria.equals("rostroCorrecto")) {

            return true;
        }

        return false;
    }
}
