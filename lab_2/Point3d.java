package com.company;

public class Point3d {
    /** координата X **/
    private double xCoord;
    /**  координата Y**/
    private double yCoord;
    /**  координата Z**/
    private double zCoord;

    /** Конструктор инициализации **/
    public Point3d(double x,  double y, double z)
    {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }
    public void setX (double val){
        xCoord = val;
    }

    public void setY (double val){
        yCoord = val;
    }

    public void setZ (double val){
        zCoord = val;
    }

    public double getX(){
        return xCoord;
    }

    public double getY(){
        return yCoord;
    }

    public double getZ(){
        return zCoord;
    }

    public static boolean rav(Point3d a, Point3d b){
        if ((a.getX() == b.getX()) && (a.getY() == b.getY()) && (a.getZ() == b.getZ()))
            return true;
        else
            return false;
    }

    public static double distanceTo(Point3d a, Point3d b) {
        return Math.abs(Math.sqrt(Math.pow(a.getX()-b.getX(),2) + Math.pow(a.getY()-b.getY(),2) + Math.pow(a.getZ()-b.getZ(),2)));
    }

    public static double computeArea(Point3d a, Point3d b, Point3d c) {
        double v1,v2,v3,p,s;
        v1 = distanceTo(a,b);
        v2 = distanceTo(b,c);
        v3 = distanceTo(c,a);
        p = (v1 + v2 + v3) / 2;
        s = Math.sqrt(p*(p-v1)*(p-v2)*(p-v3));
        return s;
    }



}
