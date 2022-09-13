object Q3 extends App
{

    class Account(id: String, accno: Int, balance: Double)
    {
        val NIC:String = id
        val accountnumber:Int = accno
        var accountbalance:Double = balance

        def moneywithdraw(a:Double) = this.accountbalance = this.accountbalance - a

        def moneydeposit(a:Double) = this.accountbalance = this.accountbalance + a

        def moneytransfer(a:Account, b:Double):Unit = 
        {
            this.moneywithdraw(b)
            a.moneydeposit(b)
        }

        override def toString = "NIC :- " + this.NIC + "   Account Number :- " + this.accountnumber + "   Account Balance :- " + this.accountbalance
    }

    val account01 = new Account("200002437338", 18263716, 75000)
    val account02 = new Account("200009326387", 18267389, 50000)

    println("The account before transfer money:- ")
    println(account01)
    println(account02)

    account01.moneytransfer(account02, 15000)
    println("\nThe account after transfer money:- ")
    println(account01)
    print(account02)
}