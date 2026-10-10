<img width="386" height="279" alt="image" src="https://github.com/user-attachments/assets/640e0b6c-73c2-497a-8ff0-237a07384299" />

El Sistema de Autenticación de Usuarios

Descripción
Este proyecto consiste en un sistema en Java que permite validar el acceso de los usuarios mediante diferentes métodos de autenticación, como usuario y contraseña, huella dactilar o tokens OAuth. Cada método tiene su propia lógica de verificación, pero todos utilizan una operación común para validar la identidad.

Clases
- **MetodoAutenticacion:** interfaz que define el método `autenticar(String credencialPrincipal, String credencialSecundaria)`, encargado de verificar las credenciales y devolver `true` si son válidas o `false` si son incorrectas.
- **AuthPassword:** simula la autenticación mediante usuario y contraseña.
- **AuthBiometrica:** simula la verificación de la identidad mediante datos biométricos.
- **AuthTokenOAuth:** simula la validación de un token de autenticación externo.
- **ServicioLogin:** recibe un método de autenticación y utiliza sus resultados para determinar si permite o rechaza el acceso.

Funcionamiento
En el `main` se crea el servicio de login y se prueban los diferentes métodos de autenticación. Se simulan accesos exitosos y fallidos para comprobar cómo responde el sistema según las credenciales recibidas. Finalmente, se muestran los resultados por consola.

Recorrido del mensaje
1. El programa crea los distintos métodos de autenticación.
2. Se prepara el servicio de login con el mecanismo que se desea utilizar.
3. El usuario intenta iniciar sesión proporcionando las credenciales necesarias.
4. El servicio invoca el método `autenticar()` del mecanismo seleccionado.
5. El mecanismo verifica las credenciales según su propia lógica.
6. El método devuelve `true` si la autenticación es correcta o `false` si falla.
7. Finalmente, el servicio informa por consola si el acceso fue autorizado o rechazado.

Validaciones
El sistema debe comprobar que las credenciales sean válidas y rechazar el acceso cuando la autenticación falle. Cada mecanismo debe aplicar sus propias reglas de verificación.

Objetivo
Practicar el uso de interfaces, la abstracción, el polimorfismo y la separación de responsabilidades para permitir distintos métodos de autenticación sin modificar la lógica principal del inicio de sesión.
