name := "scalajs-fabricjs"

organization := "com.outr.fabric"

version := "1.0.0-SNAPSHOT"

scalaVersion := "2.11.8"

sbtVersion := "0.13.11"

enablePlugins(ScalaJSPlugin)

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.0"

pomExtra :=
  <url>https://github.com/outr/scalajs-fabricj</url>
  <licenses>
    <license>
      <name>Apache-2.0</name>
      <url>https://www.apache.org/licenses/LICENSE-2.0.html</url>
    </license>
  </licenses>
  <scm>
    <url>git://github.com/outr/scalajs-fabricjs.git</url>
  </scm>
  <developers>
    <developer>
      <id>darkfrog</id>
      <name>Matt Hicks</name>
      <url>http://github.com/darkfrog26/</url>
    </developer>
  </developers>
