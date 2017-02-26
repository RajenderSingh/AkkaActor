# NonDefaultConstructorActor
# Actors with non-default constructor

Boot1 - Sample describes actor creation with non-default constructor.

When actor has a constructor and takes parameters then its not possible
to create it using actorOf(Props[ACTORTYPE]). In such case use actorOf
and pass the argument value in it.

Boot2 - Sample describes actor creation with 2 argument constructor.

Boot3 - Sample describes that the order of invocation of actor does not depend
on the order in which actors are created and message being passed to them. Actors
are automatically started asynchronously when created.
To check this behaviour run Boot3 sample multiple times and note the result. The
output will vary and will not be same through out multiple executions.

