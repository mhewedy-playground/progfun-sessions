import scala.annotation.tailrec

val xs = List(1, 3, 5, 7)

def sum(xs: List[Int]): Int = xs match {
  case Nil => 0
  case y :: ys => y + sum(ys)
}

sum(xs)

def prod(xs: List[Int]): Int = xs match{
  case Nil => 1
  case y :: ys => y * prod(ys)
}

prod(xs)

/*
def prod2(xs: List[Int]): Int = {
  var r = 1
  for (i <- xs){
    r *= i
  }
  r
}
prod2(xs)
*/







