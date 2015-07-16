package week4

object Session_4_3 {
    println("Welcome to the Scala worksheet")     //> Welcome to the Scala worksheet

    import week3.{ List, Nil, Cons }

    def print[A >: Nothing <: List[Int]](l: A) = println(l)
                                                  //> print: [A <: week3.List[Int]](l: A)Unit

    print(new Cons(10, new Nil))                  //>  > 10

}