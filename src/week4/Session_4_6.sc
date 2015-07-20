package week4

object Session_4_6 {

    List("apple", "orange", "pears")              //> res0: List[String] = List(apple, orange, pears)

    3 :: 5 :: List()                              //> res1: List[Int] = List(3, 5)
    "Hello" :: "World" :: Nil                     //> res2: List[String] = List(Hello, World)
    "hemogenous" :: 3 :: Nil                      //> res3: List[Any] = List(hemogenous, 3)
    3 :: 3.5 :: Nil                               //> res4: List[AnyVal] = List(3, 3.5)
    3.0 :: 3.5 :: List()                          //> res5: List[Double] = List(3.0, 3.5)

    val diag = List(List(0, 1, 0), List(1, 1, 0), List(0, 0, 1))
                                                  //> diag  : List[List[Int]] = List(List(0, 1, 0), List(1, 1, 0), List(0, 0, 1))

    val days = List("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
                                                  //> days  : List[String] = List(Sunday, Monday, Tuesday, Wednesday, Thursday, Fr
                                                  //| iday, Saturday)

    /*List()*/ days match {
        case firstDay :: restOfDays => println("first day is: " + firstDay + ", rest are: " + restOfDays)
        case List()                 => println("Emtpy days")
    }                                             //> first day is: Sunday, rest are: List(Monday, Tuesday, Wednesday, Thursday, F
                                                  //| riday, Saturday)

    val x: List[Nothing] = Nil                    //> x  : List[Nothing] = List()

    val ll: List[Int] = List(30)                  //> ll  : List[Int] = List(30)

    List()                                        //> res6: List[Nothing] = List()
    week3.List()                                  //> res7: week3.List[Nothing] = nil

    val numbers = 1 :: 2 :: 3 :: 4 :: 5 :: Nil    //> numbers  : List[Int] = List(1, 2, 3, 4, 5)
    val n = Nil.::(5).::(4).::(3).::(2).::(1)     //> n  : List[Int] = List(1, 2, 3, 4, 5)
    numbers == n                                  //> res8: Boolean = true

    3.min(10) :: Nil == (3 min 10) :: Nil         //> res9: Boolean = true

    //Nil.head                   // java.util.NoSuchElementException: head of empty list

    def isort(xs: List[Int]): List[Int] = {
        println("isort xs: " + xs)
        xs match {
            case List()  => List()
            case y :: ys => insert(y, isort(ys))
        }
    }                                             //> isort: (xs: List[Int])List[Int]
    def insert(x: Int, xs: List[Int]): List[Int] = {
        println("insert x: " + x + ", xs: " + xs)
        xs match {
            case List()  => List(x)
            case y :: ys => if (x > y) y :: insert(x, ys) else x :: xs
        }
    }                                             //> insert: (x: Int, xs: List[Int])List[Int]

    isort(3 :: 5 :: 2 :: 7 :: 99 :: 1 :: -9 :: Nil)
                                                  //> isort xs: List(3, 5, 2, 7, 99, 1, -9)
                                                  //| isort xs: List(5, 2, 7, 99, 1, -9)
                                                  //| isort xs: List(2, 7, 99, 1, -9)
                                                  //| isort xs: List(7, 99, 1, -9)
                                                  //| isort xs: List(99, 1, -9)
                                                  //| isort xs: List(1, -9)
                                                  //| isort xs: List(-9)
                                                  //| isort xs: List()
                                                  //| insert x: -9, xs: List()
                                                  //| insert x: 1, xs: List(-9)
                                                  //| insert x: 1, xs: List()
                                                  //| insert x: 99, xs: List(-9, 1)
                                                  //| insert x: 99, xs: List(1)
                                                  //| insert x: 99, xs: List()
                                                  //| insert x: 7, xs: List(-9, 1, 99)
                                                  //| insert x: 7, xs: List(1, 99)
                                                  //| insert x: 7, xs: List(99)
                                                  //| insert x: 2, xs: List(-9, 1, 7, 99)
                                                  //| insert x: 2, xs: List(1, 7, 99)
                                                  //| insert x: 2, xs: List(7, 99)
                                                  //| insert x: 5, xs: List(-9, 1, 2, 7, 99)
                                                  //| insert x: 5, xs: List(1, 2, 7, 99)
                                                  //| insert x: 5, xs: List(2, 7, 99)
                                                  //| insert x: 5, xs: List(7, 99)
                                                  //| insert x: 3, xs: List(-9, 1, 2, 5, 7, 99)
                                                  //| insert x: 3, xs: List(1, 2, 5, 7, 99)
                                                  //| insert x: 3, xs: List(2, 5, 7, 99)
                                                  //| insert x: 3, xs: List(5, 7, 99)
                                                  //| res10: List[Int] = List(-9, 1, 2, 3, 5, 7, 99)

}