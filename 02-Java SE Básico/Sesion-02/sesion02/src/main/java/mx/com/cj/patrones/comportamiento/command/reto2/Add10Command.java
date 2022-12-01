package mx.com.cj.patrones.comportamiento.command.reto2;

public class Add10Command implements Command {

    public int execute(int counter) {
        return counter + 10;
    }

    public int unexecute(int counter) {
        return counter - 10;
    }
}
