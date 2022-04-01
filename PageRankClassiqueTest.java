import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PageRankClassiqueTest {
	
	@Test
	public void test() {
		Configuration configuration = CLIClassique.configuration("-K", "10", "-A", ".9", "-K", "20", "-P", "-K", "30", "-C");
		assertEquals(configuration.toString(), "alpha=0.9, epsilon=-1.0, indice=30, mode=CREUSE");
	}	
}
