/*object calculaterationalno
{
    val x = new Rational(3,4)
    val y = new Rational(5,8)
    val z = new Rational(2,7)
  
    val a = x-y-z
    
    println("The value of x-y-z:" + a)
}

class Rational(numer:Int, denom:Int) 
{
    //require(denom > 0, "Denominator must be greater than 0")
    def numerator = numer
    def denominator = denom
    def neg = new Rational(-this.numerator, this.denominator)

    def add(r:Rational) = new Rational(this.numerator*r.denominator + this.denominator*r.numerator, this.denominator*r.denominator)

    def -(r:Rational) = this.add(r.neg)

    override def toString(): String = numer + "/" + denom
}*/

object Q2 extends App
{
    class Rational(numer:Int, denom:Int) 
    {
        //require(denom > 0, "Denominator must be greater than 0")
        def numerator = numer
        def denominator = denom
        def neg = new Rational(-this.numerator, this.denominator)

        def add(r:Rational) = new Rational(this.numerator*r.denominator + this.denominator*r.numerator, this.denominator*r.denominator)

        def -(r:Rational) = this.add(r.neg)

        override def toString(): String = numer + "/" + denom
    } 

    val x = new Rational(3,4)
    val y = new Rational(5,8)
    val z = new Rational(2,7)
  
    val a = x-y-z
    
    println("The value of x-y-z:" + a)
}