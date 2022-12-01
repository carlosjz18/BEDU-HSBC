package mx.com.cj.patrones.comportamiento.command.reto2;

public class IncrementCommand implements Command {

    public int execute(int counter) {
        return counter + 1;
    }

    public int unexecute(int counter) {
        return counter - 1;
    }
}
