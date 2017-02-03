/**
  * Created by ror on 03/02/17.
  */
import org.scalatest.FlatSpec

class ShoppingCartTest extends FlatSpec {
    "A Scanner" should "Read 3 apples and calculate a total of 180p" in {
      val scanner = new Scanner()
      assert( scanner.scan( List[Item]( new Apple, new Apple, new Apple) ) == 180 )
    }

    "A Scanner" should "Read 4 oranges and calculate a total of 100p" in {
      val scanner = new Scanner()
      assert( scanner.scan( List[Item]( new Orange, new Orange, new Orange, new Orange) ) == 100 )
    }

    "A Scanner" should "Read 2 oranges and 2 apples and calculate a total of 170p" in {
      val scanner = new Scanner()
      assert( scanner.scan( List[Item]( new Orange, new Orange, new Apple, new Apple) ) == 170 )
    }
}
