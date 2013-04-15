Processing in Scala
===================

Template project for developing [Processing](http://www.processing.org) with [Scala](http://www.scala-lang.org) and [IntelliJ IDEA](http://www.jetbrains.com/idea/)

    $ git clone git@github.com:stnly/scala-processing.git
    $ cd scala-processing
    $ sbt 'gen-idea no-classifiers' compile

Open IntelliJ IDEA and navigate to your new Processing project. You can run the project from within IDEA with the SBT console and the `run` command.

For those just using plain sbt to develop,

    $ git clone git@github.com:stnly/scala-processing.git
    $ cd scala-processing
    $ sbt run
    
## TODO

Make this into a giter8 template for more flexibility.
