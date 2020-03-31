public class AreaCalculator {
    private static double PI=Math.PI;
    private static double ERRMESSAGE=-1.0d;

    public static double area(double radius){
        if(radius<0){
            return ERRMESSAGE;
        }
        return radius*radius*PI;
    }
    public static double area(double x,double y){
        if(x<0||y<0){
            return ERRMESSAGE;}
        return x*y;

    }

    }
