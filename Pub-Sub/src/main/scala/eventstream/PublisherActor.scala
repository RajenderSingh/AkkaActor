package eventstream

import akka.actor.Actor

class PublisherActor extends Actor {
  def receive: Receive = {
    case evt:Event =>
      println("Event published " + evt)
      context.system.eventStream.publish(evt)

    case _ =>
  }
}
