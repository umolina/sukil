package sukil
package snippet

import net.liftweb.util.Props

class Welcome{
  def hello = <span>Welcome to this site at {new _root_.java.util.Date}. Mode is {Props.mode}</span>
}
