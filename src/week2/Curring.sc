package week2

object Curring {

    {
        def add(a: Int, b: Int) = a + b

        add(3, 4)
    }                                             //> res0: Int = 7

    {
        def add(a: Int): Int => Int = {
            def addF(b: Int) = a + b; addF
        }

        add(3)(4)

        def add3 = add(3)
        add3(4)
    }                                             //> res1: Int = 7

    {
        def add(a: Int)(b: Int) = a + b

        add(3)(4)

        def add3 = add(3) _
        add3(4)
    }                                             //> res2: Int = 7

    {
        def add(a: Int)(b: Int)(c: Int)(d: Int)(e: Int) = a + b + c + d + e

        def add123 = add(1)(2)(3) _

        def add12310 = add123(10)
        add12310(10)
    }                                             //> res3: Int = 26
}