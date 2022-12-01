package mx.com.cj.patrones.estructurales.decorator.postwork;

public class MermeladaDecorator implements Helado {

    private Helado helado;

    public MermeladaDecorator(Helado helado) {
        this.helado = helado;
    }

    @Override
    public String getDescription() {
        return helado.getDescription() + ", con Mermelada extra";
    }

    @Override
    public int getPrice() {
        return helado.getPrice() + 10;
    }
}