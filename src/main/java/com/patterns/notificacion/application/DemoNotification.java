package main.java.com.patterns.notificacion.application;

import main.java.com.patterns.notificacion.notification.AlertNotification;
import main.java.com.patterns.notificacion.notification.ConfirmationNotification;
import main.java.com.patterns.notificacion.notification.MessageNotification;
import main.java.com.patterns.notificacion.notification.Notification;
import main.java.com.patterns.notificacion.visualizer.DesktopVisualizer;
import main.java.com.patterns.notificacion.visualizer.IVisualizer;
import main.java.com.patterns.notificacion.visualizer.MovilVisualizer;
import main.java.com.patterns.notificacion.visualizer.WebVisualizer;

public class DemoNotification {

    public static void main(String[] args) {
        IVisualizer movilVisualizer = new MovilVisualizer();
        Notification messageNotification = new MessageNotification(movilVisualizer);
        messageNotification.mostrar("Hello via movil");

        IVisualizer desktopVisualizer = new DesktopVisualizer();
        Notification  alertNotification = new AlertNotification(desktopVisualizer);
        alertNotification.mostrar("Hello via desktop");


        IVisualizer webVisualizer = new WebVisualizer();
        Notification confirmatioNotification = new ConfirmationNotification(webVisualizer);
        confirmatioNotification.mostrar("Hello via web");

    }
}
