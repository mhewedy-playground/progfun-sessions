val pair = List(1, 3, 5, 7) zip "Hello yes"
pair.unzip


1 to 5
1 to 5 map { _ * 2}

1 to 5 map {x => List( x * 2)}

1 to 5 flatMap {x => List( x * 2)}

1 to 5 sum

List(1, 3, 5) sum

"Hello, World" map (x => (x + 1).toChar)
val pair1 = List('a', 'b', 'c') zip List(1, 2, 3)
pair1 unzip



val N = 2
val M = 3

(1 to M) flatMap { x=> List((x, 1)) }
(1 to M) flatMap { x=> (1 to N) map (y => (x, y) ) }

(1 to M) foreach { x=> (1 to N) foreach (y => println (x, y) ) }
for (x <- 1 to M) for (y <- 1 to N) println (x, y)


def scalarProduct(v1: Vector[Int], v2: Vector[Int]): Int = {
  v1 zip v2 map {case (x, y) => x * y} sum
}

scalarProduct(Vector(1, 2, 3), Vector(3, 4, 5))


List('a', 'b').max
List(1, 3, 5).max

"Hello, World".toList.max


def isPrime(n: Int): Boolean = (2 until n) forall(x =>n % x != 0)

isPrime(13)
isPrime(26)

1 until 20 by 2



