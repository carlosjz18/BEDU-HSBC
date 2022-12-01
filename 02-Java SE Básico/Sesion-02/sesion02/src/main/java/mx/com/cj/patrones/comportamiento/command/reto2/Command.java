package mx.com.cj.patrones.comportamiento.command.reto2;

public interface Command {
    public int execute(int counter);

    public int unexecute(int counter);
}