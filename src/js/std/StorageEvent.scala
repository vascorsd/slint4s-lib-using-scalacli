package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A StorageEvent is sent to a window when a storage area it has access to is changed within the context of another document.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageEvent)
  */
@js.native
trait StorageEvent
  extends StObject
     with Event {
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageEvent/initStorageEvent)
    */
  /* standard dom */
  def initStorageEvent(
    `type`: java.lang.String,
    bubbles: js.UndefOr[scala.Boolean],
    cancelable: js.UndefOr[scala.Boolean],
    key: js.UndefOr[java.lang.String | Null],
    oldValue: js.UndefOr[java.lang.String | Null],
    newValue: js.UndefOr[java.lang.String | Null],
    url: js.UndefOr[java.lang.String | org.scalajs.dom.URL],
    storageArea: js.UndefOr[org.scalajs.dom.Storage | Null]
  ): Unit = js.native
  
  /**
    * Returns the key of the storage item being changed.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageEvent/key)
    */
  /* standard dom */
  val key: java.lang.String | Null = js.native
  
  /**
    * Returns the new value of the key of the storage item whose value is being changed.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageEvent/newValue)
    */
  /* standard dom */
  val newValue: java.lang.String | Null = js.native
  
  /**
    * Returns the old value of the key of the storage item whose value is being changed.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageEvent/oldValue)
    */
  /* standard dom */
  val oldValue: java.lang.String | Null = js.native
  
  /**
    * Returns the Storage object that was affected.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageEvent/storageArea)
    */
  /* standard dom */
  val storageArea: org.scalajs.dom.Storage | Null = js.native
  
  /**
    * Returns the URL of the document whose storage item changed.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageEvent/url)
    */
  /* standard dom */
  val url: java.lang.String = js.native
}
