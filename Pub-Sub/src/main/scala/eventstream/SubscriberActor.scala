package eventstream

import akka.actor.Actor

class SubscriberActor extends Actor {

  context.system.eventStream.subscribe(self, classOf[Event])

  def receive: Receive = {

    case evt:Event => println("Event subscribed " + evt)

    case _ =>
  }
}
