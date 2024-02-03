package typings.std.global

import typings.std.TouchInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Touch")
@js.native
open class Touch protected ()
  extends StObject
     with typings.std.Touch {
  /* standard dom */
  def this(touchInitDict: TouchInit) = this()
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/clientX) */
  /* standard dom */
  /* CompleteClass */
  override val clientX: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/clientY) */
  /* standard dom */
  /* CompleteClass */
  override val clientY: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/force) */
  /* standard dom */
  /* CompleteClass */
  override val force: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/identifier) */
  /* standard dom */
  /* CompleteClass */
  override val identifier: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/pageX) */
  /* standard dom */
  /* CompleteClass */
  override val pageX: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/pageY) */
  /* standard dom */
  /* CompleteClass */
  override val pageY: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/radiusX) */
  /* standard dom */
  /* CompleteClass */
  override val radiusX: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/radiusY) */
  /* standard dom */
  /* CompleteClass */
  override val radiusY: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/rotationAngle) */
  /* standard dom */
  /* CompleteClass */
  override val rotationAngle: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/screenX) */
  /* standard dom */
  /* CompleteClass */
  override val screenX: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/screenY) */
  /* standard dom */
  /* CompleteClass */
  override val screenY: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/target) */
  /* standard dom */
  /* CompleteClass */
  override val target: org.scalajs.dom.EventTarget = js.native
}
