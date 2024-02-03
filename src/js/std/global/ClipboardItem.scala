package typings.std.global

import typings.std.ClipboardItemOptions
import typings.std.PromiseLike
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("ClipboardItem")
@js.native
open class ClipboardItem protected ()
  extends StObject
     with typings.std.ClipboardItem {
  /* standard dom */
  def this(items: Record[
        java.lang.String, 
        java.lang.String | org.scalajs.dom.Blob | (PromiseLike[java.lang.String | org.scalajs.dom.Blob])
      ]) = this()
  def this(
    items: Record[
        java.lang.String, 
        java.lang.String | org.scalajs.dom.Blob | (PromiseLike[java.lang.String | org.scalajs.dom.Blob])
      ],
    options: ClipboardItemOptions
  ) = this()
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ClipboardItem/getType) */
  /* standard dom */
  /* CompleteClass */
  override def getType(`type`: java.lang.String): js.Promise[org.scalajs.dom.Blob] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ClipboardItem/types) */
  /* standard dom */
  /* CompleteClass */
  override val types: js.Array[java.lang.String] = js.native
}
