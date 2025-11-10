
scalaVersion := "2.13.17"

libraryDependencies += "org.scalatestplus" %% "mockito-4-11" % "3.12.16.0"

// Using a shared variable
val junitVersion = "3.12.19.1"
libraryDependencies += "org.scalatestplus" %% "junit-4-13" % junitVersion

// A regular update without replacement
libraryDependencies += "org.scalatest" %% "scalatest-core" % "3.2.18"

// Both a replacement and a regular upgrade
libraryDependencies += "org.scalatestplus" %% "testng-6-7" % "3.2.9.0"
