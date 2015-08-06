val xs = List(1, 3, 5)

def sum(xs: List[Int]) = (0 :: xs) reduceLeft(_ + _)
sum(List())


def mapFun[T, U](xs: List[T], f: T=>U): List[U] =
  (xs foldRight List[U]()) (f(_) :: _)

def reverse[T, U](xs: List[T]): List[U] = {
  (xs foldLeft List[U]())((x, y) => y.asInstanceOf[U]:: x)
}

mapFun(xs, (x: Int) => x * 2)
reverse(xs)


def lengthFun[T](xs: List[T]): Int =
  (xs foldRight 0)( (x, y) => 1 + y )

lengthFun(xs)

