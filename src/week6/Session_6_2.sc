//Lecture 6.2 - Combinatorial Search and For-Expressions (13:12)


def isPrime(n: Int) = (2 until n) forall(x => n%x != 0)


val n = 7

(1 until n ) flatMap (i =>
  (1 until i) map (j =>
    (i, j)) ) filter{case (x, y) => isPrime(x + y) }


for {
  i <- 1 until n
  j <- 1 until i
  if isPrime(i + j)
}yield (i, j)


def scalarProductv1(xs: List[Double], ys: List[Double]) : Double =
  xs zip ys map {case (x, y) => x * y} sum

def scalarProductv2(xs: List[Double], ys: List[Double]) : Double =
  (for( (x, y) <- xs zip ys) yield x * y) sum

scalarProductv1(List(1, 3, 5), List(0, 1, 0, 6)) ==  scalarProductv2(List(1, 3, 5), List(0, 1, 0, 6))






