package greet

import akka.actor.{ActorSystem, Props}

object Boot2 extends App {

  val system = ActorSystem("GreetActorSystem")
  val greetActor = system.actorOf(Props[GreetActor], "greet")

  greetActor ! "morning"
  greetActor ! "afternoon"
  greetActor ! "evening"
  greetActor ! "hello"


}
