// Packages.
package distance;

// Imports.
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Test the Point3D class.
class Point3DTest {
  // Test the default constructor.
  @Test
  void testConstructor() {
    Point3D point = new Point3D();
    assertEquals(0, point.getX());
    assertEquals(0, point.getY());
    assertEquals(0, point.getZ());
  }

  // Test the constructor parameters.
  @Test
  void testConstructorParameters() {
    Point3D point = new Point3D(2, 3, 4);
    assertEquals(2, point.getX());
    assertEquals(3, point.getY());
    assertEquals(4, point.getZ());
  }

  // Test that the copy constructor throws an exception when given null.
  @Test
  void testConstructorNull() {
    Exception exception = assertThrows(IllegalArgumentException.class, () -> new Point3D(null));
    assertEquals("Point3D cannot be null.", exception.getMessage());
  }

  // Test the distance calculations.
  @Test
  void testDistanceCalculation() {
    Point3D point1 = new Point3D(2, 3, 4);
    Point3D point2 = new Point3D(6, 7, 8);
    assertEquals(6.9282, point1.distanceTo(point2), 0.0001);
  }

  // Test that the distance calculation throws an exception when given null.
  @Test
  void testDistanceNull() {
    Point3D point = new Point3D(2, 2, 2);
    Exception exception = assertThrows(IllegalArgumentException.class, () -> point.distanceTo(null));
    assertEquals("Point cannot be null.", exception.getMessage());
  }
}