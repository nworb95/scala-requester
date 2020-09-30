
@throws(classOf[java.io.IOException])
def get(url: String) = scala.io.Source.fromURL(url).mkString

