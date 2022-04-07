package OOPLopVaDoiTuongTrongJAVA;

public class XayDungLopFan {
    final int SLOW =1,MEDIUM=2,FAST =3;

    private int speed =SLOW;
    private boolean on = false;
    private double radius= 5;
    private String color = "blue";

    public XayDungLopFan(){}

    public XayDungLopFan(int speed, boolean on,double radius,String color){
        this.speed=speed;
        this.on=on;
        this.radius=radius;
        this.color=color;
    }

    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed){
        this.speed=speed;
    }
    public boolean isOn(){
        return on;
    }
    public void setOn(boolean on){
        this.on=on;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public String getColor(){
        return  color;
    }
    public void setColor(String color){
        this.color=color;
    }
    @Override
    public String toString() {
        if (on) {
            return "Fan{" +
                    "speed = " + speed +
                    ", on = " + on +
                    ", radius = " + radius +
                    ", color = '" + color + '\'' +
                    ", fan is on}";
        } else {
            return "Fan{" +
                    "on = " + on +
                    ", radius = " + radius +
                    ", color = '" + color + '\'' +
                    ", fan is off}";
        }
    }

    public static void main(String[] args) {
                XayDungLopFan fan1 = new XayDungLopFan();
               XayDungLopFan fan2 = new XayDungLopFan();

                fan1.setSpeed(fan1.FAST);
                fan1.setRadius(10);
                fan1.setColor("yellow");
                fan1.setOn(true);
                System.out.println("fan1: " + fan1.toString());
                fan2.setSpeed(fan2.MEDIUM);
                fan2.setRadius(5);
                System.out.println("fan2: " + fan2.toString());
            }
        }


