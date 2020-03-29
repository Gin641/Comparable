public class comparable extends circle implements Comparable<comparable> {
    public comparable(){
    }
    public comparable(double radius){
        super(radius);
    }
    public comparable(double radius,String color, boolean filled){
        super(radius,color,filled);
    }
    @Override
    public int compareTo(comparable o){
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;
    }
}
