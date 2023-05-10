
public class Main {
    public static void main(String[] args) {


        MovablePoint m1=new MovablePoint(2,3,4,6);
        System.out.println("moving down");
        m1.movedown();

        System.out.println("moving left");
        m1.moveleft();

        System.out.println("moving up");
        m1.moveup();

        System.out.println("moving right");
        m1.moveright();

        System.out.println("--Display info---");
        m1.displayinfo();
    }
}