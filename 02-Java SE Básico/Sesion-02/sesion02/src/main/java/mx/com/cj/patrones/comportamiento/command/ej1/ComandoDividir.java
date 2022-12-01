package mx.com.cj.patrones.comportamiento.command.ej1;

public class ComandoDividir extends ComandoCalculadora implements Comando {

    public ComandoDividir(float acumulador, float valor) {
        super(acumulador, valor);
    }

    public float ejecutar() {
        if (valor != 0) {
            return acumulador / valor;
        } else {
            System.out.println("No se puede dividir entre 0");
            return acumulador;
        }
    }
}
