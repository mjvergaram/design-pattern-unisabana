package mediator;

import model.Mensaje;
import model.Usuario;

import java.util.*;

public class ChatSala implements ChatMediator {

    private final Map<String, Usuario> usuarios = new HashMap<>();

    @Override
    public void registrar(Usuario usuario) {
        Objects.requireNonNull(usuario);
        if (usuarios.containsKey(usuario.nombre())) {
            throw new IllegalArgumentException("Usuario ya registrado: " + usuario.nombre());
        }
        usuarios.put(usuario.nombre(), usuario);
    }

    @Override
    public void remover(String nombreUsuario) {
        usuarios.remove(nombreUsuario);
        System.out.printf("[TODOS]: %s salió del chat. %n", nombreUsuario);
    }

    @Override
    public void enviarBroadcast(Mensaje mensaje) {
        for (Usuario u : usuarios.values()) {
            if (!u.nombre().equals(mensaje.emisor())) {
                u.recibir(mensaje);
            }
        }
    }

    @Override
    public void enviarDirecto(String destinatario, Mensaje mensaje) {
        Usuario u = usuarios.get(destinatario);
        if (u != null) {
            u.recibir(mensaje);
        }
    }
}