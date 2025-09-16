package bibliotecadigital;

import java.util.*;

public class usuario {
    Scanner sc = new Scanner(System.in);
    List<datosUsuario> usuarios = new ArrayList<>();

    public void registrar() {
        long idUsuario = (long) (Math.random() * 90000000) + 10000000;

        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Ingrese su correo: ");
        String email = sc.nextLine();

        System.out.println("Cree una contraseña (Minimo 8 digitos): ");
        String contraseña = sc.nextLine();

        if (contraseña.length() < 8) {
        System.out.println("La contraseña es demasiado corta.");
            } else {

        datosUsuario nuevo = new datosUsuario(idUsuario, nombre, email, contraseña);
        nuevo.setEstado(datosUsuario.estadoUsuario.activo);
        usuarios.add(nuevo);

        System.out.println("Usuario registrado bajo el id: " + idUsuario);
        System.out.println("Usuario registrado: " + nuevo);
        }

    }
    
    public void darDebaja() {
        
    }
}


