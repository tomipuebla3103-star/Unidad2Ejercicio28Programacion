public class AuthTokenOAuth implements MetodoaAutenticacion{
    public boolean autenticar(String credencialPrincipal, String credencialSecundaria) {

        if (credencialPrincipal.equals("usuarioOAuth") &&
                credencialSecundaria.equals("token123")) {

            return true;
        }

        return false;
    }
}
