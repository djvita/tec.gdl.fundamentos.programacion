import static org.junit.Assert.*;
import org.junit.Test;
  
  public class RectangularTest {
  @Test 
  public void testFromRectangularToPolar() {
      Rectangular myRectangular = new Rectangular(3.0, 4.0); 
      assertEquals("The two polars should be the same", "5.0 @ 53.1 grados", myRectangular.toPolarString());
      myRectangular = new Rectangular(4.0, 3.0); 
      assertEquals("The two polars should be the same", "5.0 @ 36.9 grados", myRectangular.toPolarString());
      myRectangular = new Rectangular(10.0, 2.0); 
      assertEquals("The two polars should be the same", "10.2 @ 11.3 grados", myRectangular.toPolarString());
  }
}