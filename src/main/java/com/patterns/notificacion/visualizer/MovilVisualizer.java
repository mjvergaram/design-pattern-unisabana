package main.java.com.patterns.notificacion.visualizer;

public class MovilVisualizer implements IVisualizer{
    @Override
    public void printMessage(String message) {
        System.out.println("The message from Movil: "+message);
    }

    @Override
    public void printAlert(String alert) {
        System.out.println("The alert from Movil: "+alert);
    }

    @Override
    public void printAdvent(String advent) {
        System.out.println("The advent from Movil: "+advent);
    }

    @Override
    public void printConfirmation(String confirmation) {
        System.out.println("The confirmation from Movil: "+confirmation);
    }
}
