package week4

object Session_4_1 {

    val f = (x: Int) => x + 1                     //> f  : Int => Int = <function1>
    f(20)                                         //> res0: Int = 21
    f.apply(20)                                   //> res1: Int = 21

    // ----------------------
    def f2(x: Int) = x + 1                        //> f2: (x: Int)Int
    f2(20)                                        //> res2: Int = 21
    //f2.apply(20)	// compile error
    val f3 = f2 _                                 //> f3  : Int => Int = <function1>
    f3.apply(20)                                  //> res3: Int = 21

    // ----------------------

    val fx = new Function1[Int, Int] {
        def apply(x: Int) = x + 1
    }                                             //> fx  : Int => Int = <function1>
    fx(20)                                        //> res4: Int = 21
    fx.apply(20)                                  //> res5: Int = 21
    // ----------------------

    import week3.MyList
    
    val list0 = MyList()                          //> list0  : week3.List[Unit] =  > ()

    val list1 = MyList(10)                        //> list1  : week3.List[Int] =  > 10

    val list2 = MyList(10, 20)                    //> list2  : week3.List[Int] =  > 10 > 20
}