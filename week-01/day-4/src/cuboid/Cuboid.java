package cuboid;

public class Cuboid {
    public static void main(String[] args){
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        double x = 7;
        double y = 9;
        double z = 12;
        // The program should write the surface area and volume of the cuboid like:
        // Surface Area: 600
        // SurfaceArea = 2ab + 2bc + 2ac;
        double SurfaceArea = (( 2 * x * y ) + ( 2 * y * z) + (2 * x * z));
        System.out.println(SurfaceArea);

        // Volume: 1000
        // Volume: a * b * c
        double Volume = (x * y * z);
        System.out.println(Volume);



    }


}
