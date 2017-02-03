/**
  * Created by ror on 03/02/17.
  */
class Scanner {
  def scan(items: List[Item]  ): Int ={
    return items.foldLeft(0)((inc, item) => inc+item.price() )
  }

  def scan( offerProcessor: OfferProcessor, items: List[Item]) : Int = {
    val (appleList, orangesList) = items.partition{ _.isInstanceOf[Apple] }

    val appleTotal = offerProcessor.appleListPrice(appleList)
    val orangeTotal = offerProcessor.orangeListPrice(orangesList)

    return appleTotal + orangeTotal
  }
}
