package greet

import akka.actor.{ActorSystem, Props}

object Boot1 extends App {

  val system = ActorSystem()
  val greetActor = system.actorOf(Props[GreetActor])

  greetActor ! "morning"
  greetActor ! "afternoon"
  greetActor ! "evening"
  greetActor ! "hello"


}
