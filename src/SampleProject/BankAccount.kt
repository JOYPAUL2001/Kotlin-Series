package SampleProject

import jdk.jfr.DataAmount

fun main(){

    var init65467 = BankAccountHolder("Joydeep Paul", 65478.9)
    init65467.deposite(400.8)
   // init65467.displayTransactionHistory()
    init65467.withdraw(700.6)
    init65467.displayTransactionHistory()
}

class BankAccountHolder(var accountHolder: String, var balance: Double){

    private val transactionHistory = mutableListOf<String>()

    fun deposite(amount: Double){
        balance+=amount
        transactionHistory.add("$accountHolder deposited $$amount dollar and the current balance is $balance")
    }

    fun withdraw(amount: Double){
        if (amount<=balance){
            balance-=amount
            transactionHistory.add("$accountHolder withdraw $$amount dollar and the current balance is $balance")
        }else{
            println("Sorry you don't have enough funding!")
        }
    }

    fun displayTransactionHistory(){
        println("Transaction history for $accountHolder ->")
        for (i in transactionHistory){
            println(i)
        }
    }


}