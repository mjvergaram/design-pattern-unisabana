package main.java.com.patterns.notificacion.notification;

import main.java.com.patterns.notificacion.visualizer.IVisualizer;

public class MessageNotification extends Notification{

    public MessageNotification(IVisualizer plataform) {
        super(plataform);
    }

    @Override
    public void mostrar(String notification) {
        System.out.println("MessageNotification: preparing to print message...");
        plataform.printMessage(notification);
    }
}
