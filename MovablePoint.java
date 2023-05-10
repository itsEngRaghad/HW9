public class MovablePoint implements Movable{
    private int x,y,xSpeed,ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveup() {
        y-=ySpeed;
        System.out.println(y);

    }

    @Override
    public void movedown() {
        y+=ySpeed;
        System.out.println(y);

    }

    @Override
    public void moveleft() {
        x-=xSpeed;
        System.out.println(x);

    }

    @Override
    public void moveright() {
        x+=xSpeed;
        System.out.println(x);

    }

    @Override
    public void displayinfo() {
        movedown();
        moveleft();
        moveup();
        moveright();
    }
}
