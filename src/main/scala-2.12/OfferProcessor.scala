/**
  * Created by ror on 03/02/17.
  */
class OfferProcessor {
  def appleListPrice(list: List[Item]): Int = {
    val length = list.length
    val totalItems = length % 2 match {
      case 0 => length / 2
      case 1 => (length / 2) + 1
    }

    return totalItems * (new Apple().price())
  }

  def orangeListPrice(list: List[Item]): Int = {
    val length = list.length
    val totalOffers = length / 3
    val extra = length % 3
    val price = new Orange().price()
    return totalOffers * 2 * price + extra * price
  }
}