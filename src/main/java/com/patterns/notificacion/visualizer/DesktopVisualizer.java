package main.java.com.patterns.notificacion.visualizer;

public class DesktopVisualizer implements IVisualizer{

    @Override
    public void printMessage(String message) {
        System.out.println("The message from Desktop: "+message);
    }

    @Override
    public void printAlert(String alert) {
        System.out.println("The alert from Desktop: "+alert);
    }

    @Override
    public void printAdvent(String advent) {
        System.out.println("The advent from Desktop: "+advent);
    }

    @Override
    public void printConfirmation(String confirmation) {
        System.out.println("The confirmation from Desktop: "+confirmation);
    }
}
