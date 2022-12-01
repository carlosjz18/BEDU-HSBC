package mx.com.cj.patrones.comportamiento.command.ej2;

public class SaveCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Guardando archivo...");
    }
}
