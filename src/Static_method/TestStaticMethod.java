package Static_method;
import Static_method.Static_Method;
    public class TestStaticMethod{
        public static void main(String[] args) {
            Static_Method.change();

            Static_Method s1 = new Static_Method(111, "Hoang");
            Static_Method s2 = new Static_Method(222,"Khanh");
            Static_Method s3 = new Static_Method(333,"Nam");

            s1.display();
            s2.display();
            s3.display();
        }
    }
