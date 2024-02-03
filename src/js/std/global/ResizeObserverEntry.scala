package typings.std.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("ResizeObserverEntry")
@js.native
/* standard dom */
open class ResizeObserverEntry ()
  extends StObject
     with typings.std.ResizeObserverEntry {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ResizeObserverEntry/borderBoxSize) */
  /* standard dom */
  /* CompleteClass */
  override val borderBoxSize: js.Array[typings.std.ResizeObserverSize] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ResizeObserverEntry/contentBoxSize) */
  /* standard dom */
  /* CompleteClass */
  override val contentBoxSize: js.Array[typings.std.ResizeObserverSize] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ResizeObserverEntry/contentRect) */
  /* standard dom */
  /* CompleteClass */
  override val contentRect: typings.std.DOMRectReadOnly = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val devicePixelContentBoxSize: js.Array[typings.std.ResizeObserverSize] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ResizeObserverEntry/target) */
  /* standard dom */
  /* CompleteClass */
  override val target: org.scalajs.dom.Element = js.native
}
