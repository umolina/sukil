package sukil
package snippet

import net.liftweb.util.Props
import net.liftweb.util.Helpers._
import scala.xml.NodeSeq

class Welcome{
  def hello = <span>Welcome to my new site at {new _root_.java.util.Date}. Mode is {Props.mode}</span>

  def status(xhtml: NodeSeq) = {
    bind("mystatus",xhtml, "name" -> "excited")
  }
}
