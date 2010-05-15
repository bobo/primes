import sbt._

class HelloWorldProject(info: ProjectInfo) extends DefaultProject(info)
{
  lazy val hi = task { println("Hello World"); None }
 val specs = "org.scala-tools.testing" % "specs_2.8.0.Beta1" % "1.6.2" % "test"
 val junit = "junit" % "junit" % "4.5" % "test"

}
