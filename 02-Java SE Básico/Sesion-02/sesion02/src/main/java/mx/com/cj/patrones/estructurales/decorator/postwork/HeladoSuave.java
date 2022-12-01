package mx.com.cj.patrones.estructurales.decorator.postwork;

public class HeladoSuave implements Helado {

    @Override
    public String getDescription() {
        return "Helado Suave";
    }

    @Override
    public int getPrice() {
        return 30;
    }
}