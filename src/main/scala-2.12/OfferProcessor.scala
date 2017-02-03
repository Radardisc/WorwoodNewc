/**
  * Created by ror on 03/02/17.
  */
class OfferProcessor {
  def twoForOne(list: List[Item]): Int = {
    val result = list match {
      case _ :: _ =>
        val length = list.length
        val totalItems = length % 2 match {
          case 0 => length / 2
          case 1 => (length / 2) + 1
        }

         totalItems * (list.head.price())

      case _ => 0
    }

    return result
  }

  def threeForTwo(list: List[Item]): Int = {
    val result = list match {
      case _ :: _ =>
        val length = list.length
        val totalOffers = length / 3
        val extra = length % 3
        val price = list.head.price()
        return totalOffers * 2 * price + extra * price
      case _ => 0
    }

    return result

  }
}