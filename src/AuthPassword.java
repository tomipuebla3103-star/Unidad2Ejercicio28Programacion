public class AuthPassword implements MetodoaAutenticacion {
    public boolean autenticar(String credencialPrincipal, String credencialSecundaria) {

        if (credencialPrincipal.equals("Tomas") &&
                credencialSecundaria.equals("1234")) {

            return true;
        }

        return false;
    }
}
