// Packages.
package distance;

// Create the class that will be used to perform velocity calculations.
class Physics {
  // Calculate the velocity.
  public static double velocity(distance.Point3D one, distance.Point3D two, double elapsedTime) {
    // Check if either is null.
    if (one == null || two == null) {
      throw new IllegalArgumentException("Points cannot be null.");
    }
    // Ensure time is a positive value.
    if (elapsedTime <= 0) {
      throw new IllegalArgumentException("Elapsed time must be positive.");
    }
    // Using the velocity formula, return the velocity.
    return one.distanceTo(two) / elapsedTime;
  }
}