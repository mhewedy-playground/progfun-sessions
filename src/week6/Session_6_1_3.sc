
val s = "Hello, World"
s flatMap (Array(_, '.'))
s flatMap (List(_, '.'))

Vector(1, 3, 5) ++ Array(2, 3)

Vector(1, 3) ++ List(3, 5)

1 +: List(3, 5)
1 +: Vector(3, 5)


(1 to 10 by 2) flatMap (x => (10 to 100 by 10) map (y => (x, y)) )