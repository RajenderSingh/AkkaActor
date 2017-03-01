package eventbus

import akka.actor.Actor


class EventSubscriberActor extends Actor {

  def receive:Receive = {

    case filterEvent:FilterEvent => println("Subscriber " + self.path.name + " got event " + filterEvent)

    case _ =>

  }

}
