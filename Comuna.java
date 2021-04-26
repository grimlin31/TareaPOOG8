public class Comuna {
    public double height;
    public double width;
    Individuo[] totalPerson;

    Comuna() {
        this.height = 1000;
        this.width = 1000;
        this.printClassAttribute();
    }

    Comuna(double width, double height) {
        this.height = height;
        this.width = width;
        this.printClassAttribute();
    }

    void printClassAttribute() {
        System.out.println("\t" + "width Commune: " + this.width);
        System.out.println("\t" + "height Commune: " + this.height);
    }

}