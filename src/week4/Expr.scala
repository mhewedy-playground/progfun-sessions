package week4

// http://www.wikiwand.com/en/Expression_problem
trait Expr {
    def eval: Int = this match {
        case Num(n)       => n
        case Sum(e1, e2)  => e1.eval + e2.eval
        case Prod(e1, e2) => e1.eval * e2.eval
        case Var(v)       => throw new UnsupportedOperationException("eval.Var.unsupported")
    }

    def show: String = this match {
        case Num(n)                => n.toString
        case Sum(e1, e2)           => e1.show + " + " + e2.show
        case Prod(Sum(e1, e2), e3) => "(" + Sum(e1, e2).show + ") * " + e3.show
        case Prod(e1, Sum(e2, e3)) => e1.show + " * (" + Sum(e2, e3).show + ")"
        case Prod(e1, e2)          => e1.show + " * " + e2.show
        case Var(v)                => v
    }

    override def toString = show
}

case class Num(n: Int) extends Expr

case class Sum(leftOp: Expr, rightOp: Expr) extends Expr

case class Prod(leftOp: Expr, val rightOp: Expr) extends Expr

case class Var(name: String) extends Expr 


