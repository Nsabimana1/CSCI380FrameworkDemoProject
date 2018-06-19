
name := "damy_project"
 
version := "1.0" 
      
lazy val `damy_project` = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"
      
scalaVersion := "2.11.11"

libraryDependencies ++= Seq( javaJdbc , cache , javaWs )

libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.41"

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )  

      