package greet

import akka.actor.{ActorSystem, Props}

object Boot3 extends App {

  val system = ActorSystem("GreetActorSystem")
  val greetActor = system.actorOf(Props(classOf[GreetActor]), "greet")

  greetActor ! "morning"
  greetActor ! "afternoon"
  greetActor ! "evening"
  greetActor ! "hello"


}
