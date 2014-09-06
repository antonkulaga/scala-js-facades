package interfaces.examples

import org.scalajs.dom

/**
 * Example class that calls cusom logic
 */
trait Example extends Logged{

  def name:String

  def main():Unit



}

trait Logged {

  def error(errorText:String) = dom.console.error(errorText)

  def warning(warning:String) = dom.console.warn(warning)

  def info(message:String) = dom.console.info(message:String)

  def debug(message:String) = dom.console.log(message)
}
