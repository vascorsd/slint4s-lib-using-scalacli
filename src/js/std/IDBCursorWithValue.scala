package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This IndexedDB API interface represents a cursor for traversing or iterating over multiple records in a database. It is the same as the IDBCursor, except that it includes the value property.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBCursorWithValue)
  */
@js.native
trait IDBCursorWithValue
  extends StObject
     with IDBCursor {
  
  /**
    * Returns the cursor's current value.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBCursorWithValue/value)
    */
  /* standard dom */
  val value: Any = js.native
}
