object Q4 extends App
{

    class Account(id: String, accno: Int, balance: Double)
    {
        val NIC:String = id
        val accountnumber:Int = accno
        var accountbalance:Double = balance

        override def toString = "NIC : "+ NIC +" Account Number : "+ accountnumber +" Account Balance : "+ accountbalance

    }

    val account01= new Account("200003278647",1869234,15000)
    val account02= new Account("200012783627",1827663,-10000)
    val account03= new Account("199993888477",1825553,50000)
    val account04= new Account("199237377377",1825535,-15000)

    var bank:List[Account]=List(account01,account02,account03,account04)

    val bankoverdraft = bank.filter(x=>x.accountbalance<0)
    val moneybalance = bank.map((x)=>(x.accountbalance)).reduce((x,y)=>(x+y))
    val interest = (b:List[Account])=>b.map((x) => (x.NIC,x.accountnumber,if(x.accountbalance>0)  (x.accountbalance+(x.accountbalance*0.5)) else (x.accountbalance+(x.accountbalance*0.1)) ))

    println("The list of the account with negative balances: Rs." + bankoverdraft)
    printf("\n")
    println("The total of all the accounts: Rs." + moneybalance + "0") 
    printf("\n")
    println("The final balance of all the accounts: Rs." + interest(bank))
}