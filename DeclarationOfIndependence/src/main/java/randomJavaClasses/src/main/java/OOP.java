package randomJavaClasses.src.main.java;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dennisthe14th
 */
class Sphere {
    private int diameter;
    private double radius;
    private double circumference;
    private double area;
    private double volume;
    
    
    public Sphere(int diameter)
    {
            
      this.diameter = diameter;
      setSphereRadius();
      setSphereCircumference();
      setSphereVolume();
      setSphereArea();
    }
    public void setSphereDiameter(int diameter)
    {
        this.diameter = diameter;
    }
    public int getSphereDiameter()
    {
        return diameter;
    }
    public double getSphereRadius()
    {
        return radius;
    }
    public void setSphereRadius()
    {
        radius = diameter / 2.0;
    }
    public void setSphereCircumference()
    {
        circumference = Math.PI * (2.0) * radius;
    }
    public double getSphereCircumference()
    {
        return circumference;
    }
    public void setSphereVolume()
    {
        volume = Math.PI * (4.0/3.0) *
                Math.pow((double)diameter/2.0,3);
    }
    public double getSphereVolume()
    {
        return volume;
    }
    public double getSphereArea()
    {
        return area;
    }
    public void setSphereArea()
    {
        area = Math.PI * 4.0 *
                Math.pow((double) diameter/2.0,2);
    }
    
    public String toString()
    {
        String result = Double.toString(radius);
        String result1 = Integer.toString(diameter);
        String result2 = Double.toString(circumference);
        String result3 = Double.toString(area);
        String result4 = Double.toString(volume);
        return "Diameter: " + result1 + "\t" + "Circumference: " +
                result2+ "m" + "\t" + "Area: " + result3 + "\t" + 
                "Volume: " + result4 + "\t" + "Radius: " + result + "cm";
    }
}

public class OOP {

    public static void main(String[] args)
    {
        Sphere sphere1 = new Sphere(7);
        Sphere sphere2 = new Sphere(9);
        Sphere sphere3 = new Sphere(13);
        
//        sphere1.setSphereDiameter(7);
        System.out.println(sphere1.getSphereVolume());
        System.out.println(sphere1.getSphereArea());
        System.out.println(sphere1.getSphereDiameter());
        System.out.println(sphere1.getSphereCircumference());
        System.out.println(sphere1.getSphereRadius());
        
        System.out.println(sphere1);
        System.out.println();
        
        System.out.println(sphere2.getSphereVolume());
        System.out.println(sphere2.getSphereArea());
        System.out.println(sphere2.getSphereDiameter());
        System.out.println(sphere2.getSphereCircumference());
        System.out.println(sphere2.getSphereRadius());
        
        System.out.println(sphere2);
        System.out.println();
        
        System.out.println(sphere3.getSphereVolume());
        System.out.println(sphere3.getSphereArea());
        System.out.println(sphere3.getSphereDiameter());
        System.out.println(sphere3.getSphereCircumference());
        System.out.println(sphere3.getSphereRadius());
        System.out.println(sphere3);
       
    }
    
}
