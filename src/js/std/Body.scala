package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Body extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/arrayBuffer) */
  /* standard dom */
  def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer]
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/blob) */
  /* standard dom */
  def blob(): js.Promise[org.scalajs.dom.Blob]
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/body) */
  /* standard dom */
  val body: org.scalajs.dom.ReadableStream[js.typedarray.Uint8Array] | Null
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/bodyUsed) */
  /* standard dom */
  val bodyUsed: scala.Boolean
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/formData) */
  /* standard dom */
  def formData(): js.Promise[org.scalajs.dom.FormData]
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/json) */
  /* standard dom */
  def json(): js.Promise[Any]
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/text) */
  /* standard dom */
  def text(): js.Promise[java.lang.String]
}
object Body {
  
  inline def apply(
    arrayBuffer: () => js.Promise[js.typedarray.ArrayBuffer],
    blob: () => js.Promise[org.scalajs.dom.Blob],
    bodyUsed: scala.Boolean,
    formData: () => js.Promise[org.scalajs.dom.FormData],
    json: () => js.Promise[Any],
    text: () => js.Promise[java.lang.String]
  ): Body = {
    val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], formData = js.Any.fromFunction0(formData), json = js.Any.fromFunction0(json), text = js.Any.fromFunction0(text), body = null)
    __obj.asInstanceOf[Body]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Body] (val x: Self) extends AnyVal {
    
    inline def setArrayBuffer(value: () => js.Promise[js.typedarray.ArrayBuffer]): Self = StObject.set(x, "arrayBuffer", js.Any.fromFunction0(value))
    
    inline def setBlob(value: () => js.Promise[org.scalajs.dom.Blob]): Self = StObject.set(x, "blob", js.Any.fromFunction0(value))
    
    inline def setBody(value: org.scalajs.dom.ReadableStream[js.typedarray.Uint8Array]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyNull: Self = StObject.set(x, "body", null)
    
    inline def setBodyUsed(value: scala.Boolean): Self = StObject.set(x, "bodyUsed", value.asInstanceOf[js.Any])
    
    inline def setFormData(value: () => js.Promise[org.scalajs.dom.FormData]): Self = StObject.set(x, "formData", js.Any.fromFunction0(value))
    
    inline def setJson(value: () => js.Promise[Any]): Self = StObject.set(x, "json", js.Any.fromFunction0(value))
    
    inline def setText(value: () => js.Promise[java.lang.String]): Self = StObject.set(x, "text", js.Any.fromFunction0(value))
  }
}
