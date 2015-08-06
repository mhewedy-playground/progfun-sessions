val v = Vector(10, 3, 4)
v.head
v.tail
v :+ 30
40 +: v


"Hello, World" filter ( _.isLower)

Array(1, 3, 5, 7) map (_*2)



1 to 5
1.until(5)

(1 to 10).head

(1 to 10) map (_*2)
val v2 = 1 to 100 by 2 filter ( x => x > 30 && x %5 == 0)

v2 exists ( _ % 55 == 0)
v2 forall ( _ % 55 == 0)


v zip v2

v zip (1 to 10)

List(3, 55, 2) zip "Hello"


"Hello" zip "World"

val p = 1 to 10 zip "aieou"
p.unzip
p unzip

List(1, 3, 5) flatMap (x => List(x * 2))
List(1, 3, 5) map (x => List(x * 2))

"Mohammad" flatMap (List('.', _))

"Mohammad" zip Vector (11, 33, 33)













