
val xs = List(1, 2, 3, 6, 5, 7)
xs.map { x => x * x }

xs.splitAt(2)

xs filter { x => x % 2 == 1 }
xs filterNot { x => x % 2 == 1 }
xs.partition { x => x % 2 == 1 }

xs.takeWhile { x => x % 2 == 1 }
xs dropWhile { x => x % 2 == 1 }

xs.span { x => x % 2 == 1 }

def msort(xs: List[Int]): List[Int] = {
  val n = xs.length / 2
  if (n == 0) xs
  else {
    def merge(xs1: List[Int], xs2: List[Int]): List[Int] = (xs1, xs2) match {
      case (List(), zs) => zs
      case (ys, List()) => ys
      case (y :: ys, z :: zs) => if (y < z) y :: merge(ys, xs2) else z :: merge(xs1, zs)
    }
    val (f, l) = xs splitAt n
    merge(msort(f), msort(l))
  }
}

msort(List(3, 21, 3, -7, 1, 3, 8))

val (label, value) = ("answer", 42)


val label2, value2 = ("answer", 42)


val labelvalue = ("answer", 42)
val (d, c) = labelvalue


