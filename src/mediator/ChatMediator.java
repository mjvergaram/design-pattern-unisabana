package mediator;

import message.Mensaje;
import user.Usuario;

public interface ChatMediator {
    void registrar(Usuario usuario);
    void remover(String nombreUsuario);
    void enviarDirecto(String destinatario, Mensaje mensaje);
    void enviarBroadcast(Mensaje mensaje);
}