package eventstream

import akka.actor.Actor

class SubscribersActor(name:String) extends Actor {

  //part of constructor
  context.system.eventStream.subscribe(self, classOf[Event])

  def receive: Receive = {

    case evt:Event => println(name + " subscribes event  " + evt)

    case _ =>
  }
}