package typings.std.global

import typings.std.CSSStyleSheetInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("CSSStyleSheet")
@js.native
/* standard dom */
open class CSSStyleSheet ()
  extends StObject
     with typings.std.CSSStyleSheet {
  def this(options: CSSStyleSheetInit) = this()
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/disabled) */
  /* standard dom */
  /* CompleteClass */
  var disabled: scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/href) */
  /* standard dom */
  /* CompleteClass */
  override val href: java.lang.String | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/media) */
  /* standard dom */
  /* CompleteClass */
  override val media: org.scalajs.dom.MediaList = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/ownerNode) */
  /* standard dom */
  /* CompleteClass */
  override val ownerNode: org.scalajs.dom.Element | org.scalajs.dom.ProcessingInstruction | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/parentStyleSheet) */
  /* standard dom */
  /* CompleteClass */
  override val parentStyleSheet: org.scalajs.dom.CSSStyleSheet | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/title) */
  /* standard dom */
  /* CompleteClass */
  override val title: java.lang.String | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/type) */
  /* standard dom */
  /* CompleteClass */
  override val `type`: java.lang.String = js.native
}
