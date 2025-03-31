package lap5bai4;
import java.util.Scanner;
 class MovablePoint implements Movable{
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;
    
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap x: ");
        x = scanner.nextInt();
        System.out.print("Nhap y: ");
        y = scanner.nextInt();
        System.out.print("Nhap xSpeed: ");
        xSpeed = scanner.nextInt();
        System.out.print("Nhap ySpeed: ");
        ySpeed = scanner.nextInt();
    }
    
    public int getX() {
        return x;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public int getY() {
        return y;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    public int getXSpeed() {
        return xSpeed;
    }
    
    public void setXSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }
    
    public int getYSpeed() {
        return ySpeed;
    }
    
    public void setYSpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }
    
    @Override
    public String toString() {
        return "(" + x + ", " + y + "), speed=(" + xSpeed + ", " + ySpeed + ")";
    }
    
    @Override
    public void moveUp() {
        y = y - ySpeed;
    }
    
    @Override
    public void moveDown() {
        y = y + ySpeed;
    }
    
    @Override
    public void moveLeft() {
        x = x - xSpeed;
    }
    
    @Override
    public void moveRight() {
        x = x + xSpeed;
    }
}