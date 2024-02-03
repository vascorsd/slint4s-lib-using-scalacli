Experiments in generating slint bindings for scala.

First experiment is trying to bind the npm slint-ui 
library with scala.js.

The library is published with typescript types.

This was the first attempt, trying to use scala-cli
conditional compilation for multiple platforms
and trying to use the scalblytyped generator published
and available through coursier.

I gave up on this approach since it is an uphill battle
of undocumented stuff and nothig seems to work.

I'm not smart enough for this.

Conclusion: This is a failure.

There's too many moving parts that I don't know or understand.

----

I abandoned this approach and went to try using sbt to generate
stuff after this.

That attempt is called - slint4s-lib-using-sbt
