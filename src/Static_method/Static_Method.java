package Static_method;

public class Static_Method {
    private int rollono;
    private String name;
    private static String collage = "BBDIT";

    Static_Method(int r, String n) {
        rollono = r;
        name = n;
    }

    static void change(){
        collage="CODEGYM";
    }

    void display(){
        System.out.println(rollono + " " + name + " "+ collage);
    }
}
