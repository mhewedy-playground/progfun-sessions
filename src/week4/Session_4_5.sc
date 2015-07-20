package week4

object Session_4_5 {

    import week4.{ Expr, Num, Sum, Prod }

    val n1 = new Num(1)                           //> n1  : week4.Num = 1
    val n3 = new Num(3)                           //> n3  : week4.Num = 3
    val n6 = new Num(6)                           //> n6  : week4.Num = 6
    val n10 = new Num(10)                         //> n10  : week4.Num = 10
    val n_m10 = new Num(-10)                      //> n_m10  : week4.Num = -10

    val s1 = new Sum(n3, n6)                      //> s1  : week4.Sum = 3 + 6
    val s2 = new Sum(n10, s1)                     //> s2  : week4.Sum = 10 + 3 + 6
    val s3 = new Sum(s2, n1)                      //> s3  : week4.Sum = 10 + 3 + 6 + 1

    val p1 = new Prod(new Var("a"), new Var("b")) //> p1  : week4.Prod = a * b
    val p2 = new Prod(new Var("a"), new Var("c")) //> p2  : week4.Prod = a * c
    val p3 = new Sum(p1, p2)                      //> p3  : week4.Sum = a * b + a * c

    // --------------------------------

    class A
    class B extends A
    class C extends A

    val b = new B                                 //> b  : week4.Session_4_5.B = week4.Session_4_5$$anonfun$main$1$B$1@880ec60
    b.isInstanceOf[C]                             //> res0: Boolean = false
    b.isInstanceOf[A]                             //> res1: Boolean = true
    b.isInstanceOf[Object]                        //> res2: Boolean = true
    b.isInstanceOf[B]                             //> res3: Boolean = true

    val p = Prod(Num(10), Sum(Num(3), Num(5)))    //> p  : week4.Prod = 10 * (3 + 5)
    p.eval                                        //> res4: Int = 80
    p.show                                        //> res5: String = 10 * (3 + 5)

    // -- ----- Excersise
    Sum(Prod(Num(2), Var("x")), Var("y"))         //> res6: week4.Sum = 2 * x + y
    Prod(Sum(Num(2), Var("x")), Var("y"))         //> res7: week4.Prod = (2 + x) * y
    Prod(Var("y"), Sum(Num(2), Var("x")))         //> res8: week4.Prod = y * (2 + x)

}