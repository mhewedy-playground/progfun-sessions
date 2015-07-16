package week4

object Session_4_2 {
    println("Welcome to the Scala worksheet")     //> Welcome to the Scala worksheet

    import week4.{ Nat, Zero, Succ }

    val zero: Nat = Zero                          //> zero  : week4.Nat = 0
    val one = new Succ(Zero)                      //> one  : week4.Succ = 1
    val five = new Succ(Zero).succ.succ.succ.succ //> five  : week4.Nat = 5

    zero.succ                                     //> res0: week4.Nat = 1

    zero.succ.succ.succ                           //> res1: week4.Nat = 3

    one.succ                                      //> res2: week4.Nat = 2
    one.succ.succ                                 //> res3: week4.Nat = 3
    one.succ.succ.predecessor                     //> res4: week4.Nat = 2

    zero + one                                    //> res5: week4.Nat = 1

    zero + zero                                   //> res6: week4.Nat = 0

    //one + one

    zero - zero                                   //> res7: week4.Nat = 0

    one + zero                                    //> res8: week4.Nat = 1

    one + five                                    //> res9: week4.Nat = 6
    five + five                                   //> res10: week4.Nat = 10

    one + five                                    //> res11: week4.Nat = 6
    five + five                                   //> res12: week4.Nat = 10
    one + one                                     //> res13: week4.Nat = 2

    (five + five) - one                           //> res14: week4.Nat = 9

}