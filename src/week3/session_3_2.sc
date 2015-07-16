package week3

// wildcard imports
import week3.pkgs._
import week3.pkgs.Hello._

// named imports
import week3.pkgs.MyRational
import week3.pkgs.Hello
import week3.pkgs.{ MyRational, Hello }
import week3.pkgs.Hello.WORLD
import java.lang.Exception

object session_3_2 {

    val x = new MyRational(1, 3)                  //> x  : week3.pkgs.MyRational = 1 / 3
    Hello.WORLD                                   //> res0: String = HELLO WORLD
    WORLD                                         //> res1: String = HELLO WORLD

    WORLD.##                                      //> res2: Int = 568232580

    WORLD.isInstanceOf[String]                    //> res3: Boolean = true

    1.toString                                    //> res4: String = 1

    System.currentTimeMillis().##                 //> res5: Int = 2122911256

    val l = Long.MaxValue                         //> l  : Long = 9223372036854775807
    val f: Float = l                              //> f  : Float = 9.223372E18
    val d: Double = l                             //> d  : Double = 9.223372036854776E18

    l == f                                        //> res6: Boolean = true
    f == d                                        //> res7: Boolean = true
    l == d                                        //> res8: Boolean = true

    val n: String = null                          //> n  : String = null
    def err(e: Exception): Nothing = throw e      //> err: (e: Exception)Nothing

    //err(new NullPointerException("npe"))

    math.abs(-3)                                  //> res9: Int = 3
    scala.sys.`package`.env("HOME")               //> res10: String = /Users/mhewedy
    scala.math.`package`.max(1, 4)                //> res11: Int = 4
    scala.math.max(3, 5)                          //> res12: Int = 5
    scala.sys.env("USER")                         //> res13: String = mhewedy
    
    val db: Double = 1.0                          //> db  : Double = 1.0
    val in: Int = 1                               //> in  : Int = 1
    
    db == in                                      //> res14: Boolean = true
    db.equals(in)                                 //> res15: Boolean = false
    
    in == db                                      //> res16: Boolean = true
    in.equals(db)                                 //> res17: Boolean = false
    
    def fxx = throw new Exception                 //> fxx: => Nothing

}

class PersonC

object PersonO




///