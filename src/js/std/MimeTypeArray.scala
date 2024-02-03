package typings.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Returns an array of MimeType instances, each of which contains information about a supported browser plugins. This object is returned by NavigatorPlugins.mimeTypes.
  * @deprecated
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MimeTypeArray)
  */
@js.native
trait MimeTypeArray
  extends StObject
     with /* standard dom */
/* index */ NumberDictionary[MimeType] {
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MimeTypeArray/item)
    */
  /* standard dom */
  def item(index: Double): MimeType | Null = js.native
  
  /* standard dom.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[MimeType]] = js.native
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MimeTypeArray/length)
    */
  /* standard dom */
  val length: Double = js.native
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MimeTypeArray/namedItem)
    */
  /* standard dom */
  def namedItem(name: java.lang.String): MimeType | Null = js.native
}
