import java.util.*;
class Point{
    private int x, y;
public Point(int x,int y){
    this.x = x;
    this.y = y;
}
@Override
public String toString(){
    return "("+x+", "+y+")";
}
@Override
public boolean equals(Object obj){
    if (this == obj){
        return true;
    }
    if (obj == null || getClass() != obj.getClass()){
        return false;
    }
    Point p = (Point)obj;
    return this.x == p.x && this.y == p.y;
}
}

class FClass{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
	    
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
		
        if(p1.equals(p2))
            System.out.println(p1 + "==" + p2);
        else
            System.out.println(p1 + "!=" + p2);
        sc.close();    
    }
}