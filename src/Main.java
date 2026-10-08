//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    ServicioLogin servicio = new ServicioLogin();

    AuthPassword password = new AuthPassword();
    AuthBiometrica biometrica = new AuthBiometrica();
    AuthTokenOAuth oauth = new AuthTokenOAuth();

    System.out.println("Autenticacion con Password:");
    servicio.iniciarSesion(password, "Tomas", "1234");

    System.out.println();

    System.out.println("Autenticacion con Password:");
    servicio.iniciarSesion(password, "Tomas", "9999");

    System.out.println();

    System.out.println("Autenticacion Biometrica:");
    servicio.iniciarSesion(
            biometrica,
            "huellaCorrecta",
            "rostroCorrecto"
    );

    System.out.println();

    System.out.println("Autenticacion OAuth:");
    servicio.iniciarSesion(
            oauth,
            "usuarioOAuth",
            "tokenIncorrecto"
    );
}
