package week5

object Session_5_4 {

    def squareList(xs: List[Int]): List[Int] = xs match {
        case Nil     => xs
        case y :: ys => y * y :: squareList(ys)
    }                                             //> squareList: (xs: List[Int])List[Int]

    def squareList2(xs: List[Int]): List[Int] =
        xs map (x => x * x)                       //> squareList2: (xs: List[Int])List[Int]

    val xs = List(1, 3, 5, 7)                     //> xs  : List[Int] = List(1, 3, 5, 7)
    squareList(xs)                                //> res0: List[Int] = List(1, 9, 25, 49)
    squareList2(xs)                               //> res1: List[Int] = List(1, 9, 25, 49)

    xs filter { x => x > 5 }                      //> res2: List[Int] = List(7)

    /// ---------------------

    def pack_[T](xs: List[T]): List[List[T]] = xs match {
        case Nil => Nil
        case x :: xs1 => {
            val p = pack_(xs1)
            if (!p.isEmpty && p.head.head == x) {
                (x :: p.head) :: p.tail
            } else {
                List(x) :: p
            }
        }
    }                                             //> pack_ : [T](xs: List[T])List[List[T]]

    def pack[T](xs: List[T]): List[List[T]] = xs match {
        case Nil => Nil
        case x :: xs1 =>
            val (first, rest) = xs.span { y => y == x }
            first :: pack(rest)
    }                                             //> pack: [T](xs: List[T])List[List[T]]

    pack(List("a", "a", "a", "b", "c", "c", "a")) //> res3: List[List[String]] = List(List(a, a, a), List(b), List(c, c), List(a))
                                                  //| 
    
    
    //List(List(a, a, a), List(b), List(c, c), List(a))
		def encode[T](xs: List[List[T]]): List[(T, Int)] = xs match {
        case Nil => Nil
        case x :: xs1 => (x.head, x.length) :: encode(xs1)
    }                                             //> encode: [T](xs: List[List[T]])List[(T, Int)]
    
     encode(pack(List("a", "a", "a", "b", "c", "c", "a")))
                                                  //> res4: List[(String, Int)] = List((a,3), (b,1), (c,2), (a,1))

}