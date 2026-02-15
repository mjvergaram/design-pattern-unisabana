package main.java.com.patterns.notificacion.notification;

import main.java.com.patterns.notificacion.visualizer.IVisualizer;

public abstract class Notification {

    protected IVisualizer plataform;

    public Notification(IVisualizer plataform){
        this.plataform = plataform;
    }

    public abstract void mostrar(String notification);
}
