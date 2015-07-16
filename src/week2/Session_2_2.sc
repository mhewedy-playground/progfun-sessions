package week2

object Session_2_2 {

		// -- Function take another function as argument

    def sum(f: Int => Int, a: Int, b: Int): Int =
        if (a > b) 0 else f(a) + sum(f, a + 1, b) //> sum: (f: Int => Int, a: Int, b: Int)Int

    def sumInts(a: Int, b: Int) = sum(x => x, a, b)
                                                  //> sumInts: (a: Int, b: Int)Int
    def sumCubes(a: Int, b: Int) = sum(x => x * x * x, a, b)
                                                  //> sumCubes: (a: Int, b: Int)Int
    sumInts(1, 3)                                 //> res0: Int = 6

	// -- Function take another function as argument and return a third function

    def sum2(f: Int => Int): (Int, Int) => Int = {
        def sumF(a: Int, b: Int): Int =
            if (a > b) 0 else f(a) + sumF(a + 1, b)

        sumF
    }                                             //> sum2: (f: Int => Int)(Int, Int) => Int
    
    def sumInts2 = sum2(x => x)                   //> sumInts2: => (Int, Int) => Int
    def sumCubes2 = sum2(x => x * x * x)          //> sumCubes2: => (Int, Int) => Int

    sumInts2(1, 3)                                //> res1: Int = 6
    sum2(x => x)(1, 3)                            //> res2: Int = 6
    
    sum2(x => x)                                  //> res3: (Int, Int) => Int = <function2>

    // --------- Currying function

    def sum3(f: Int => Int)(a: Int, b: Int): Int =
        if (a > b) 0 else f(a) + sum3(f)(a + 1, b)//> sum3: (f: Int => Int)(a: Int, b: Int)Int

    sum3(x => x)(1, 3)                            //> res4: Int = 6
    sum3(x => x) _                                //> res5: (Int, Int) => Int = <function2>




}