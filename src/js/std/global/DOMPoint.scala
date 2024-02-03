package typings.std.global

import typings.std.DOMPointInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("DOMPoint")
@js.native
/* standard dom */
open class DOMPoint ()
  extends StObject
     with typings.std.DOMPoint {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Unit, y: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  def this(x: Double, y: Unit, z: Double) = this()
  def this(x: Unit, y: Double, z: Double) = this()
  def this(x: Unit, y: Unit, z: Double) = this()
  def this(x: Double, y: Double, z: Double, w: Double) = this()
  def this(x: Double, y: Double, z: Unit, w: Double) = this()
  def this(x: Double, y: Unit, z: Double, w: Double) = this()
  def this(x: Double, y: Unit, z: Unit, w: Double) = this()
  def this(x: Unit, y: Double, z: Double, w: Double) = this()
  def this(x: Unit, y: Double, z: Unit, w: Double) = this()
  def this(x: Unit, y: Unit, z: Double, w: Double) = this()
  def this(x: Unit, y: Unit, z: Unit, w: Double) = this()
}
object DOMPoint {
  
  @JSGlobal("DOMPoint")
  @js.native
  val ^ : js.Any = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPoint/fromPoint_static) */
  /* standard dom */
  inline def fromPoint(): typings.std.DOMPoint = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPoint")().asInstanceOf[typings.std.DOMPoint]
  inline def fromPoint(other: DOMPointInit): typings.std.DOMPoint = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPoint")(other.asInstanceOf[js.Any]).asInstanceOf[typings.std.DOMPoint]
}
