// FLOOR.java
public class Floor {
    private double width;
    private double length;
    
    public Floor(double width, double length){
        this.width =width;
        this.length=length;
        
        if (width <0) this.width=0;
        else this.width=width;
        
        if(length<0) this.length=0;
        else this.length=length;
    }
    
    public double getArea(){return (this.width * this.length);}
    
}

// CARPET.java
public class Carpet {
    private double cost;
    
    public Carpet(double cost){
        this.cost = cost;
        if(cost<0) this.cost =0;
        else this.cost=cost;
    }
    public double getCost(){return this.cost; }
}

// CALCULATOR.java
public class Calculator {
    private Floor floor;
    private Carpet carpet;
    
    public Calculator(Floor floor, Carpet carpet){
        this.floor = floor;
        this.carpet = carpet;
    }
    public double getTotalCost(){
        return (floor.getArea()*carpet.getCost());
    }
}
