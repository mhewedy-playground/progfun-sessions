package week3

sealed trait List[+T] {
    def isEmpty: Boolean
    def head: T
    def tail: List[T]
    // to protect LSP
    def ::[U >: T](elem: U): List[U] = new Cons(elem, this)
}

class Cons[T](val head: T, val tail: List[T]) extends List[T] {
    def isEmpty = false

    override def toString = {
        def loop(acc: String, list: List[T]): String =
            if (list.isEmpty) acc else loop(acc + " > " + list.head, list.tail)
        loop("", this)
    }
}

object Nil extends List[Nothing] {
    def isEmpty: Boolean = true
    def head: Nothing = throw new NoSuchElementException("Nil.head")
    def tail: Nothing = throw new NoSuchElementException("Nil.tail")

    override def toString = "nil"
}

object List {
    def apply[T](): List[T] = Nil

    def apply[T](e1: T): List[T] = new Cons(e1, Nil)

    def apply[T](e1: T, e2: T): List[T] = new Cons(e1, new Cons(e2, Nil))

}
