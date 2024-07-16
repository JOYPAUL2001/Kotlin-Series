package SampleProject

fun main(){
    var MyChoice = ""
    var CompChoice = ""
    var t = 1
    do{
        println("Would you like to play the Game? Enter 1 to continue, Enter 0 to terminate!")
        var r1 = readln()
        t = r1.toInt()
        if(t==0){
            break;
        }
        println("Rock, Paper or Scissor? Enter your choice!")
        MyChoice = readln()
        val randomNum = (1..3).random()
        if(randomNum == 1){
            CompChoice = "Rock"
        }else if(randomNum == 2){
            CompChoice ="Paper"
        }else{
            CompChoice = "Scissor"
        }
        println("Computer choice is : ")
        println(CompChoice)
        var ans = when{
            MyChoice == CompChoice -> "Tie"
            MyChoice == "Rock" && CompChoice == "Scissor" -> "Me"
            MyChoice == "Scissor" && CompChoice == "Paper" -> "Me"
            MyChoice == "Paper" && CompChoice == "Rock" -> "Me"
            else -> "Computer"
        }

        if(ans == "Me"){
            println("You won!")
        }
        else if(ans == "Computer"){
            println("Computer won!")
        }
        else{
            println("Tie")
        }
    }while(t==1)
}