package typings.std.global

import typings.std.FileSystemHandleKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("FileSystemHandle")
@js.native
/* standard dom */
open class FileSystemHandle ()
  extends StObject
     with typings.std.FileSystemHandle {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemHandle/isSameEntry) */
  /* standard dom */
  /* CompleteClass */
  override def isSameEntry(other: typings.std.FileSystemHandle): js.Promise[scala.Boolean] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemHandle/kind) */
  /* standard dom */
  /* CompleteClass */
  override val kind: FileSystemHandleKind = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemHandle/name) */
  /* standard dom */
  /* CompleteClass */
  override val name: java.lang.String = js.native
}
