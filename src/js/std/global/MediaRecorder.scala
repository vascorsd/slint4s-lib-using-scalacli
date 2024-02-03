package typings.std.global

import typings.std.MediaRecorderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MediaRecorder")
@js.native
open class MediaRecorder protected ()
  extends StObject
     with typings.std.MediaRecorder {
  /* standard dom */
  def this(stream: org.scalajs.dom.MediaStream) = this()
  def this(stream: org.scalajs.dom.MediaStream, options: MediaRecorderOptions) = this()
}
object MediaRecorder {
  
  @JSGlobal("MediaRecorder")
  @js.native
  val ^ : js.Any = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder/isTypeSupported_static) */
  /* standard dom */
  inline def isTypeSupported(`type`: java.lang.String): scala.Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeSupported")(`type`.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
}
