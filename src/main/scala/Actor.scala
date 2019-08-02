import akka.actor.{Actor, ActorSystem, Props}

class Hello extends Actor{
def receive={
case msg: String => println(msg)
case _ => println("unknown message")
}
}

object Main{
def main(args:Array[String]){
val actorSystem=ActorSystem("ActorSystem")
val actor = actorSystem.actorOf(Props[Hello],"Hello")
actor ! "Hello "
actor ! 100
}
}
