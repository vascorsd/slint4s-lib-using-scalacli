package typings.std.global

import typings.std.DOMHighResTimeStamp
import typings.std.PerformanceMarkOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("PerformanceMark")
@js.native
open class PerformanceMark protected ()
  extends StObject
     with typings.std.PerformanceMark {
  /* standard dom */
  def this(markName: java.lang.String) = this()
  def this(markName: java.lang.String, markOptions: PerformanceMarkOptions) = this()
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceMark/detail) */
  /* standard dom */
  /* CompleteClass */
  override val detail: Any = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceEntry/duration) */
  /* standard dom */
  /* CompleteClass */
  override val duration: DOMHighResTimeStamp = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceEntry/entryType) */
  /* standard dom */
  /* CompleteClass */
  override val entryType: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceEntry/name) */
  /* standard dom */
  /* CompleteClass */
  override val name: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceEntry/startTime) */
  /* standard dom */
  /* CompleteClass */
  override val startTime: DOMHighResTimeStamp = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceEntry/toJSON) */
  /* standard dom */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
