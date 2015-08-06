def isLessThan[T](x: T, y: T)(ord: Ordering[T]): Boolean = ord.lt(x, y)

//isLessThan(5, 6) //(Ordering.Int)

// -----------------------------------------------------------

def scaleList(xs: List[Double], factor: Double): List[Double] = xs match {
  case Nil => xs
  case y :: ys => y * factor :: scaleList(ys, factor)
}

def scaleList2(xs: List[Double], factor: Double) = xs map (x => (x * factor).asInstanceOf[Int])

scaleList(List(1.5, 2.0), 3.0)
scaleList2(List(1.5, 2.0), 3.0)

// -----------------------------------------------------------

def squareList(xs: List[Int]): List[Int] = xs match {
  case Nil => Nil
  case y :: ys => y * y :: squareList(ys)
}

squareList(List(1, 3, 5))

def squareList2(xs: List[Int]) = xs map (x => x * x)

squareList2(List(1, 3, 5))


List(-1, -3, 4, -5, 7) filter (x => x > 0)

// -----------------------------------------------------------

List(-1, -3, 4, -5, 7) partition { x => x > 0}

/// -----------------------------------

def pack[T](xs: List[T]): List[List[T]] = xs match {
  case Nil => Nil
  case y :: _ =>
    val (f, l) = xs span (x => x == y)
    f :: pack(l)
}


pack(List('a', 'a', 'a', 'b', 'b', 'c', 'c', 'a'))


def encode1[T](xs: List[T]): List[(T, Int)] = xs match {
  case Nil => Nil
  case y :: _ =>
    val (f, l) = xs span (x => x == y)
    (y, f.length) :: encode1(l)
}

def encode2[T](xs: List[T]): List[(T, Int)] = {
  val ys = pack(xs)
  ys map (zs => (zs.head, zs.length))
}

encode1(List('a', 'a', 'a', 'b', 'b', 'c', 'c', 'a'))
encode2(List('a', 'a', 'a', 'b', 'b', 'c', 'c', 'a'))
