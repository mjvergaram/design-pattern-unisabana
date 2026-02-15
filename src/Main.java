import mediator.*;
import model.Usuario;

public class Main {
    static void main(String[] args) {
        ChatMediator sala1 = new ChatSala();
        ChatMediator sala2 = new ChatSala();

        Usuario jorge = new Usuario("Jorge", sala1);
        Usuario ana = new Usuario("Ana", sala1);
        Usuario carlos = new Usuario("Carlos", sala1);

        Usuario andres = new Usuario("Andres", sala2);
        Usuario juliana = new Usuario("Juliana", sala2);
        Usuario manuel = new Usuario("Manuel", sala2);

        sala1.registrar(jorge);
        sala1.registrar(ana);
        sala1.registrar(carlos);

        sala2.registrar(andres);
        sala2.registrar(juliana);
        sala2.registrar(manuel);

        jorge.enviarBroadcast("Hola a todos.");
        ana.enviarDirecto("Carlos", "¿Terminaste el informe?");
        carlos.enviarDirecto("Ana", "Sí, lo envío ahora.");

        sala1.remover("Ana");


        andres.enviarBroadcast("Buenos días.");
        juliana.enviarBroadcast("¡Buenos días!");
        manuel.enviarBroadcast("¿nos vemos ahora?");
        juliana.enviarDirecto("Manuel", "Manuel yo no puedo, lo siento");
        manuel.enviarDirecto("Juliana", "Vale, no hay problema");

        sala2.remover("Manuel");
    }
}
