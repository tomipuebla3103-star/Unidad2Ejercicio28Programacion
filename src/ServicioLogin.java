public class ServicioLogin {
    public void iniciarSesion(MetodoaAutenticacion metodo,
                              String credencialPrincipal,
                              String credencialSecundaria) {

        boolean resultado = metodo.autenticar(
                credencialPrincipal,
                credencialSecundaria
        );

        if (resultado) {
            System.out.println("Inicio de sesion exitoso.");
        } else {
            System.out.println("Inicio de sesion fallido.");
        }
    }
}
