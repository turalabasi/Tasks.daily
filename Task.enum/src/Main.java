// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Planet[]planets=Planet.values();
        for (int i = 0; i < planets.length; i++) {
            System.out.println(planets[i].getPlanetName());
            System.out.println("Length of day: " + planets[i].getLengthOfDay());
            System.out.println("Distance from sun: " + planets[i].getDistanceFromSun());
            System.out.println("Area: " + planets[i].getArea());
            System.out.println("--------------------");
        }

        }
    }
