package week4

abstract class MyBoolean {

    def ifThenElse(t: MyBoolean, e: MyBoolean): MyBoolean

    def &&(that: => MyBoolean) = ifThenElse(that, False)

    def ||(that: => MyBoolean) = ifThenElse(True, that)

    def unary_! : MyBoolean = ifThenElse(False, True)

    def ==(that: MyBoolean): MyBoolean = ifThenElse(that, !that)

    def !=(that: MyBoolean): MyBoolean = ifThenElse(!that, that)

//     giving that: false < true
    def <(that: => MyBoolean): MyBoolean = ifThenElse(False, that)

    def toNative: scala.Boolean
}

object True extends MyBoolean {
    def ifThenElse(t: MyBoolean, e: MyBoolean) = t
    override def toString = "true"
    def toNative = true
}

object False extends MyBoolean {
    def ifThenElse(t: MyBoolean, e: MyBoolean) = e
    override def toString = "false"
    def toNative = false
}

object Test extends App {
    val t = True
    val f = False

    assert(((t && t) == True).toNative)
    assert((t && t).toNative)
    assert((t || f).toNative)
    assert((!t == False).toNative)
    assert((!f).toNative)
    assert((!(t == f)).toNative)
    assert((t == !f).toNative)
    assert((t != f).toNative)
    assert(!((t < t)).toNative)
    assert(!((f < f)).toNative)
    assert(!((t < f)).toNative)
    assert((f < t).toNative)
}
