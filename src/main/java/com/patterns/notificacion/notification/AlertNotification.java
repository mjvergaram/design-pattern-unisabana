package main.java.com.patterns.notificacion.notification;

import main.java.com.patterns.notificacion.visualizer.IVisualizer;

public class AlertNotification extends Notification{

    public AlertNotification(IVisualizer plataform) {
        super(plataform);
    }

    @Override
    public void mostrar(String notification) {
        System.out.println("AlertNotification: preparing to print notification...");
        plataform.printAlert(notification);
    }
}
