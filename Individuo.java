

public class Individuo {

    private State nextState;
    private String name;

    Individuo(double x, double y, String name){
        nextState = new State(x, y, Math.random() * 360);
        this.name = name;
    }

    Individuo() {
        System.out.println("soy un nuevo individuo :)");
    }
}