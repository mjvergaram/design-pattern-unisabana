package main.java.com.patterns.notificacion.visualizer;

public class WebVisualizer implements IVisualizer{
    @Override
    public void printMessage(String message) {
        System.out.println("The message from Web: "+message);
    }

    @Override
    public void printAlert(String alert) {
        System.out.println("The message from Web: "+alert);
    }

    @Override
    public void printAdvent(String advent) {
        System.out.println("The message from Web: "+advent);
    }

    @Override
    public void printConfirmation(String confirmation) {
        System.out.println("The message from Web: "+confirmation);
    }
}
