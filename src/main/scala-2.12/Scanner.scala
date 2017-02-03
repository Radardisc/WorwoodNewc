/**
  * Created by ror on 03/02/17.
  */
class Scanner {
  def scan(items: List[Item]  ): Int ={
    items.foldLeft(0)((inc, item) => inc+item.price() )
  }
}
