package Static_method;

public class StaticProperty {
    private String name;
    private String engine;

    public static int numberOfCars;

    public StaticProperty(String name, String engine) {
        this.name = name;
        this.engine = engine;
//        numberOfCars++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public static class TestStaticProperty {
        public static void main(String[] args) {
            StaticProperty staticProperty = new StaticProperty("Mec", "G63");
            System.out.println(StaticProperty.numberOfCars);
            StaticProperty staticProperty1 = new StaticProperty("RR", "PhanTom");
            System.out.println(StaticProperty.numberOfCars);
        }
    }

}
