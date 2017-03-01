package eventstream

import akka.actor.{ActorSystem, Props}


object Boot1 extends App {

  val system = ActorSystem("Pub-Sub-System")

  val publisherActorRef = system.actorOf(Props[PublisherActor], name = "publisherActor")

  val subscriberActorRef = system.actorOf(Props[SubscriberActor], name = "subscriberActor")

  publisherActorRef ! Event("first")

}
