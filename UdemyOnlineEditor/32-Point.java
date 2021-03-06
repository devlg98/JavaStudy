public class Point {
    private int x;
    private int y;
    
    public Point(){
        
    }
    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    
    // getter
    public int getX(){return this.x;}
    public int getY(){return this.y;}
    
    //setter
    public void setX(int x){this.x=x;}
    public void setY(int y){this.y=y;}
    
    // other
    public double distance(){
        return Math.sqrt( (getX() - 0.0) * ( getX() - 0)  + (getY() - 0) * (getY() - 0));
    }
    public double distance(int x, int y){
        return Math.sqrt( (getX() - x) * ( getX() - x)  + (getY() - y) * (getY() - y));
    }
    public double distance(Point xy){
        return Math.sqrt( (getX() - xy.getX()) * ( getX() - xy.getX())  + (getY() - xy.getY()) * (getY() - xy.getY()));
 
    }
 }