  import org.junit.*;
  import static org.junit.Assert.*;

  import java.util.*;
  
  public class RectangularTest {
	@Test 
	public void testFromRectangularToPolar() {
	    Rectangular myRectangular= new Rectangular(3.0, 4.0); 
	    assertTrue(myRectangular.toPolarString() == "5 @ 53.1 grados");
	}
}