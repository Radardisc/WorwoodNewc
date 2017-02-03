/**
  * Created by ror on 03/02/17.
  */
trait Item {
  def price() : Int
}

class Apple extends Item {
  def price() = { 60 }
}

class Orange extends Item {
  def price() = { 25 }
}
