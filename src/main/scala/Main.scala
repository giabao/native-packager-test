import java.io.File
import java.net.URLEncoder

object Main extends App {
  val path = System.getProperty("my.file")

  println(URLEncoder.encode(path, "utf-8"))
  println("path.last == '\\r'? " + (path.last == '\r'))

  println("file exists?" + new File(path).exists())
  println("file exists if we strip last char from path?" + new File(path.substring(0, path.length - 1)).exists())
}
