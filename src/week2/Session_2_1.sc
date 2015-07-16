package week2

object Session_2_1 {

    def sumOfInt(a: Int, b: Int): Int =
        if (a > b) 0 else a + sumOfInt(a + 1, b)  //> sumOfInt: (a: Int, b: Int)Int

    def sumIntTail(a: Int, b: Int): Int = {
        def loop(a: Int, t: Int): Int =
            if (a > b) t else loop(a + 1, t + a)
        loop(a, 0)
    }                                             //> sumIntTail: (a: Int, b: Int)Int

    //sumOfInt(1, 100000000) //SO (StackOverflow)
    sumIntTail(1, 3)                              //> res0: Int = 6
    sumIntTail(1, 100000000)                      //> res1: Int = 987459712

    //----

    def sum(f: Int => Int, a: Int, b: Int): Int =
        if (a > b) 0 else f(a) + sum(f, a + 1, b) //> sum: (f: Int => Int, a: Int, b: Int)Int

    def factInt(x: Int): Int = if (x == 0) 1 else x * factInt(x - 1)
                                                  //> factInt: (x: Int)Int
    def sumInts(a: Int, b: Int) = sum(x => x, a, b)
                                                  //> sumInts: (a: Int, b: Int)Int
    def sumCubes(a: Int, b: Int) = sum(x => x * x * x, a, b)
                                                  //> sumCubes: (a: Int, b: Int)Int
    def sumFact(a: Int, b: Int) = sum(factInt, a, b)
                                                  //> sumFact: (a: Int, b: Int)Int
    sumInts(1, 3)                                 //> res2: Int = 6
    sumCubes(1, 3)                                //> res3: Int = 36
    sumFact(1, 3)                                 //> res4: Int = 9
}