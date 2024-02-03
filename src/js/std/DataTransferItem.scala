package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * One drag data item. During a drag operation, each drag event has a dataTransfer property which contains a list of drag data items. Each item in the list is a DataTransferItem object.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransferItem)
  */
@js.native
trait DataTransferItem extends StObject {
  
  /**
    * Returns a File object, if the drag data item kind is File.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransferItem/getAsFile)
    */
  /* standard dom */
  def getAsFile(): org.scalajs.dom.File | Null = js.native
  
  /**
    * Invokes the callback with the string data as the argument, if the drag data item kind is text.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransferItem/getAsString)
    */
  /* standard dom */
  def getAsString(): Unit = js.native
  def getAsString(callback: FunctionStringCallback): Unit = js.native
  
  /**
    * Returns the drag data item kind, one of: "string", "file".
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransferItem/kind)
    */
  /* standard dom */
  val kind: java.lang.String = js.native
  
  /**
    * Returns the drag data item type string.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransferItem/type)
    */
  /* standard dom */
  val `type`: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransferItem/webkitGetAsEntry) */
  /* standard dom */
  def webkitGetAsEntry(): FileSystemEntry | Null = js.native
}
