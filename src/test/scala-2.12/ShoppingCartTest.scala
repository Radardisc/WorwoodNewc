/**
  * Created by ror on 03/02/17.
  */
import org.scalatest.FlatSpec

class ShoppingCartTest extends FlatSpec {
    "A Scanner" should "Read 3 apples and calculate a total of 180p" in {
      val scanner = new Scanner
      assert( scanner.scan( List[Item]( new Apple, new Apple, new Apple) ) == 180 )
    }

    "A Scanner" should "Read 4 oranges and calculate a total of 100p" in {
      val scanner = new Scanner
      assert( scanner.scan( List[Item]( new Orange, new Orange, new Orange, new Orange) ) == 100 )
    }

    "A Scanner" should "Read 2 oranges and 2 apples and calculate a total of 170p" in {
      val scanner = new Scanner
      assert( scanner.scan( List[Item]( new Orange, new Orange, new Apple, new Apple) ) == 170 )
    }


    "A Scanner with an OfferProcessor" should "Read 2 apples and give a price of 60" in {
      val offerProcessor = new OfferProcessor
      val scanner = new Scanner
      assert( scanner.scan( offerProcessor, List[Item](new Apple, new Apple) ) == 60 )
    }

    "A Scanner with an OfferProcessor" should "Read 3 apples and give a price of 120" in {
      val offerProcessor = new OfferProcessor
      val scanner = new Scanner
      assert( scanner.scan( offerProcessor, List[Item](new Apple, new Apple, new Apple) ) == 120 )
    }

    "A Scanner with an OfferProcessor" should "Read 3 oranges and give a price of 50" in {
      val offerProcessor = new OfferProcessor
      val scanner = new Scanner
      assert( scanner.scan( offerProcessor, List[Item](new Orange,new Orange, new Orange) ) == 50 )
    }

    "A Scanner with an OfferProcessor" should "Read 4 oranges and give a price of 75" in {
      val offerProcessor = new OfferProcessor
      val scanner = new Scanner
      assert( scanner.scan( offerProcessor, List[Item](new Orange,new Orange, new Orange, new Orange) ) == 75 )
    }

    "A Scanner with an OfferProcessor" should "Read 5 oranges and give a price of 100" in {
      val offerProcessor = new OfferProcessor
      val scanner = new Scanner
      assert( scanner.scan( offerProcessor, List[Item](new Orange,new Orange, new Orange,new Orange,new Orange) ) == 100 )
    }

    "A Scanner with an OfferProcessor" should "Read 6 oranges and give a price of 100" in {
      val offerProcessor = new OfferProcessor
      val scanner = new Scanner
      assert( scanner.scan( offerProcessor, List[Item](new Orange,new Orange, new Orange,new Orange,new Orange, new Orange) ) == 100 )
    }

  "A Scanner with an OfferProcessor" should "Read 5 oranges and 5 apples and give a price of 100 + 180=280" in {
    val offerProcessor = new OfferProcessor
    val scanner = new Scanner
    assert( scanner.scan( offerProcessor, List[Item](new Orange,new Apple, new Apple,new Orange, new Orange,new Orange,new Apple, new Apple, new Apple, new Orange) ) == 280)
  }
}
