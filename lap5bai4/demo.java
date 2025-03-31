package lap5bai4;

import java.util.Scanner;

public class demo {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhap thong tin hinh tron:");
        MovableCircle circle = new MovableCircle(0, 0, 0, 0, 0);
        circle.nhap();
        
        System.out.println("Vi tri ban dau: " + circle.toString());
        
        circle.moveUp();
        System.out.println("Sau khi di chuyen len: " + circle.toString());
        
        circle.moveDown();
        System.out.println("Sau khi di chuyen xuong: " + circle.toString());
        
        circle.moveLeft();
        System.out.println("Sau khi di chuyen sang trai: " + circle.toString());
        
        circle.moveRight();
        System.out.println("Sau khi di chuyen sang phai: " + circle.toString());
        
        scanner.close();
    }
}
