package greet

import akka.actor.Actor

class GreetActor extends Actor {
  def receive: Receive = {
    case "morning" => println("Good Morning!!!")
    case "afternoon" => println("Good Afternoon!!!")
    case "evening" => println("Good Evening!!!")
    case _ => println("No greeting message")
  }
}
