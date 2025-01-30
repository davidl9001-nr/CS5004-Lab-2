// Packages.
package distance;

// Create the class that will initialize values and set up calculations.
public class Point3D {
  // Instance variables for the coordinates.
  private final int x;
  private final int y;
  private final int z;

  // Initializes the point (0,0,0).
  public Point3D() {
    this(0, 0, 0);
  }

  // Constructor initializes point to the specified x, y, and z coordinates.
  public Point3D(int x, int y, int z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  // Create a new 3D object with said coordinates.
  public Point3D(Point3D other) {
    if (other == null) { // Check for null to prevent errors
      throw new IllegalArgumentException("Point3D cannot be null.");
    }
    this.x = other.x;
    this.y = other.y;
    this.z = other.z;
  }

  // Getter methods to return the x, y, and z coordinates.
  public int getX() { return x; }
  public int getY() { return y; }
  public int getZ() { return z; }

  // Calculate the distance between two points.
  public double distanceTo(Point3D other) {
    // Ensure the other point is not null.
    if (other == null) {
      throw new IllegalArgumentException("Point cannot be null.");
    }
    int dx = other.x - this.x;
    int dy = other.y - this.y;
    int dz = other.z - this.z;
    // Calculate the distance and return the result.
    return Math.sqrt(dx * dx + dy * dy + dz * dz);
  }
}