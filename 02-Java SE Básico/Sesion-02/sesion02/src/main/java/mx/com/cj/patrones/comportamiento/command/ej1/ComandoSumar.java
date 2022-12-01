package mx.com.cj.patrones.comportamiento.command.ej1;

public class ComandoSumar extends ComandoCalculadora implements Comando {
  public ComandoSumar(float acumulador, float valor) {
    super(acumulador, valor);
  }

  public float ejecutar() {
    return acumulador + valor;
  }
}
