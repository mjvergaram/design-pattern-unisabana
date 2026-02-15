package model;

import mediator.ChatMediator;

import java.util.*;

public class Usuario {
    private final String nombre;
    private final ChatMediator mediator;

    public Usuario(String nombre, ChatMediator mediator) {
        this.nombre = Objects.requireNonNull(nombre);
        this.mediator = Objects.requireNonNull(mediator);
    }

    public String nombre() {
        return nombre;
    }

    public void enviarBroadcast(String contenido) {
        mediator.enviarBroadcast(new Mensaje(nombre, contenido));
    }

    public void enviarDirecto(String destinatario, String contenido) {
        mediator.enviarDirecto(destinatario, new Mensaje(nombre, contenido));
    }

    public void recibir(Mensaje mensaje) {
        System.out.printf("[%s at %s] recibió de %s: %s%n",
                this.nombre, mensaje.timestamp(), mensaje.emisor(), mensaje.contenido());
    }
}