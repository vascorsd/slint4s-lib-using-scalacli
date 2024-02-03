package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This Fetch API interface represents the response to a request.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response)
  */
trait Response
  extends StObject
     with Body {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/headers) */
  /* standard dom */
  val headers: org.scalajs.dom.Headers
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/ok) */
  /* standard dom */
  val ok: scala.Boolean
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/redirected) */
  /* standard dom */
  val redirected: scala.Boolean
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/status) */
  /* standard dom */
  val status: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/statusText) */
  /* standard dom */
  val statusText: java.lang.String
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/type) */
  /* standard dom */
  val `type`: org.scalajs.dom.ResponseType
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/url) */
  /* standard dom */
  val url: java.lang.String
}
object Response {
  
  inline def apply(
    arrayBuffer: () => js.Promise[js.typedarray.ArrayBuffer],
    blob: () => js.Promise[org.scalajs.dom.Blob],
    bodyUsed: scala.Boolean,
    formData: () => js.Promise[org.scalajs.dom.FormData],
    headers: org.scalajs.dom.Headers,
    json: () => js.Promise[Any],
    ok: scala.Boolean,
    redirected: scala.Boolean,
    status: Double,
    statusText: java.lang.String,
    text: () => js.Promise[java.lang.String],
    `type`: org.scalajs.dom.ResponseType,
    url: java.lang.String
  ): Response = {
    val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], formData = js.Any.fromFunction0(formData), headers = headers.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), ok = ok.asInstanceOf[js.Any], redirected = redirected.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], text = js.Any.fromFunction0(text), url = url.asInstanceOf[js.Any], body = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Response] (val x: Self) extends AnyVal {
    
    inline def setHeaders(value: org.scalajs.dom.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setOk(value: scala.Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
    
    inline def setRedirected(value: scala.Boolean): Self = StObject.set(x, "redirected", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusText(value: java.lang.String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
    
    inline def setType(value: org.scalajs.dom.ResponseType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: java.lang.String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
