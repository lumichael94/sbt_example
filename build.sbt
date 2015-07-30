  name:= "eliza"

  version:= "0.0.1"

  scalaVersion := "2.11.7"

  resolvers += "HyperGraphDB" at "http://www.hypergraphdb.org/maven"

  libraryDependencies += "org.hypergraphdb" % "hgdb" % "1.2"
  libraryDependencies += "org.hypergraphdb" % "hgbdbje" % "1.2"
  
  mainClass in (Compile, run) := Some("core_interpreter")
