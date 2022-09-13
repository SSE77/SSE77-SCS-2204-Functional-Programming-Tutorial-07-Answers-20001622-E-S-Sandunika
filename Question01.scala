object Q1 extends App
{
    class Rational(numer:Int, denom:Int) 
    {
        //Denominator must be greater than 0
        def numerator = numer
        def denominator = denom

        def add(r:Rational) = new Rational(this.numerator*r.denominator + this.denominator*r.numerator, this.denominator*r.denominator)

        def neg = new Rational(-this.numerator, this.denominator)

        override def toString(): String = s"$numerator/$denominator"
    } 

    val object1 = new Rational(1,4)

    println("The negative of the relevant rational number:" + object1.neg)
}