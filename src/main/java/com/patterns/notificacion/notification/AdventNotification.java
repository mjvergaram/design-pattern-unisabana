package main.java.com.patterns.notificacion.notification;

import main.java.com.patterns.notificacion.visualizer.IVisualizer;

public class AdventNotification extends Notification{

    public AdventNotification(IVisualizer plataform) {
        super(plataform);
    }

    @Override
    public void mostrar(String notification) {
        System.out.println("AdventNotification: preparing to print notification...");
        plataform.printAdvent(notification);
    }
}
