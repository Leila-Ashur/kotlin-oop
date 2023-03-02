fun main() {
    var leila =Human("Leila",19,55,)
    leila.eat(1)
    leila.speak("I am honoured to stand before you this day")
    leila.birthday()
    println(leila.age)
    var ceshy = User("Ceshy","Ali","ceshyali@gmail.com","0743049045",888)
      println(ceshy.lastname)
    println(ceshy.email)
}
class Human (var name:String,var age:Int,var wheight:Int){


fun eat(foodWheight:Int){
    println("Iam eating $foodWheight kgs of food")
    wheight+= foodWheight
}
    fun speak(speech:String){
        println(speech)
    }
    fun birthday(){
        age+=1
    }

}
class User(var firstname:String, var lastname:String,var email: String,phoneNumber:String,passwaord:Int )

