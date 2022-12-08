package mx.com.cj.sesion04.beans.model;

public class Greeting {

    private String name;

    public Greeting(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String greeting(String name) {
        return "Hello, " + name;
    }
}
