val scalaVer = "2.13.6"

val zioVersion = "1.0.9"

val munitVersion = "0.7.26"

val munitZIOVersion = "0.0.1"

lazy val compileDependencies = Seq(
  "dev.zio" %% "zio" % zioVersion
) map (_ % Compile)

lazy val settings = Seq(
  name := "zio-hangman",
  version := "1.0.0",
  scalaVersion := scalaVer,
  libraryDependencies ++= compileDependencies
)

lazy val root = (project in file("."))
  .settings(settings)

libraryDependencies += "org.scalameta" %% "munit" % munitVersion % Test
libraryDependencies += "com.github.poslegm" %% "munit-zio" % munitZIOVersion % Test