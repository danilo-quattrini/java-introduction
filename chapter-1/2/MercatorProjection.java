/**<h1>1.2.31 Mercator projection</h1>
 * The Mercator projection is a conformal (angle-
 * preserving) projection that maps latitude and longitude to rectangular coordi-
 * nates (x, y). It is widely used—for example, in nautical charts and in the maps that
 * you print from the web. The projection is defined by the equations x 0 and
 * y 1/2 ln ((1 sin ) (1 sin )), where 0 is the longitude of the point in the
 * center of the map. Write a program that takes 0 and the latitude and longitude of
 * a point from the command line and prints its projection.
 * **/
public class MercatorProjection {
    public static void main(String[] args) {
        double latitude = Double.parseDouble(args[0]);
        double longitude = Double.parseDouble(args[1]);
        double delta0 = Double.parseDouble(args[2]); // longitude of the point in the center of the map
        double phi = Math.toRadians(latitude); // That was necessary to convert from gradient to radians and use in Math.sin();
        double x = longitude - delta0;
        double y = 0.5 * (Math.log((1 + Math.sin(phi))/(1 - Math.sin(phi))));
        System.out.println("Projection of the latitude: "+ phi + " and the longitude: " +
                + longitude +" is: (" + x + "," + y +")");

    }
}