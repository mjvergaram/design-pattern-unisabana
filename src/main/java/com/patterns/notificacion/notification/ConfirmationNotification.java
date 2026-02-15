package main.java.com.patterns.notificacion.notification;

import main.java.com.patterns.notificacion.visualizer.IVisualizer;

public class ConfirmationNotification extends Notification{

    public ConfirmationNotification(IVisualizer plataform) {
        super(plataform);
    }

    @Override
    public void mostrar(String notification) {
        System.out.println("ConfirmationNotification: preparing to print notification...");
        plataform.printConfirmation(notification);
    }
}
