// Packages.
package distance;

// Imports.
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Test the Physics class.
class PhysicsTest {
  // Test the velocity calculations.
  @Test
  void testVelocityCalculation() {
    Point3D point1 = new Point3D(0, 0, 0);
    Point3D point2 = new Point3D(5, 12, 0);
    assertEquals(13.0, Physics.velocity(point1, point2, 1.0), 0.0001);
  }

  // Test that the velocity calculation throws an exception with negative time.
  @Test
  void testVelocityNegativeTime() {
    Point3D point1 = new Point3D(0, 0, 0);
    Point3D point2 = new Point3D(3, 4, 0);
    Exception exception = assertThrows(IllegalArgumentException.class, () -> Physics.velocity(point1, point2, -1));
    assertEquals("Elapsed time must be positive.", exception.getMessage());
  }

  // Test the velocity calculation throws an exception when a point is null.
  @Test
  void testVelocityNull() {
    Point3D point = new Point3D(0, 0, 0);
    Exception exception = assertThrows(IllegalArgumentException.class, () -> Physics.velocity(point, null, 1));
    assertEquals("Points cannot be null.", exception.getMessage());
  }
}