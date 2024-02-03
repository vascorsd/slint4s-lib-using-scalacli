package typings.std.global

import typings.std.CSSNumberish
import typings.std.CSSNumericType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("CSSUnitValue")
@js.native
open class CSSUnitValue protected ()
  extends StObject
     with typings.std.CSSUnitValue {
  /* standard dom */
  def this(value: Double, unit: java.lang.String) = this()
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericValue/add) */
  /* standard dom */
  /* CompleteClass */
  override def add(values: CSSNumberish*): typings.std.CSSNumericValue = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericValue/div) */
  /* standard dom */
  /* CompleteClass */
  override def div(values: CSSNumberish*): typings.std.CSSNumericValue = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericValue/equals) */
  /* standard dom */
  /* CompleteClass */
  override def equals(value: CSSNumberish*): scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericValue/max) */
  /* standard dom */
  /* CompleteClass */
  override def max(values: CSSNumberish*): typings.std.CSSNumericValue = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericValue/min) */
  /* standard dom */
  /* CompleteClass */
  override def min(values: CSSNumberish*): typings.std.CSSNumericValue = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericValue/mul) */
  /* standard dom */
  /* CompleteClass */
  override def mul(values: CSSNumberish*): typings.std.CSSNumericValue = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericValue/sub) */
  /* standard dom */
  /* CompleteClass */
  override def sub(values: CSSNumberish*): typings.std.CSSNumericValue = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericValue/to) */
  /* standard dom */
  /* CompleteClass */
  override def to(unit: java.lang.String): typings.std.CSSUnitValue = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericValue/toSum) */
  /* standard dom */
  /* CompleteClass */
  override def toSum(units: java.lang.String*): typings.std.CSSMathSum = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericValue/type) */
  /* standard dom */
  /* CompleteClass */
  override def `type`(): CSSNumericType = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSUnitValue/unit) */
  /* standard dom */
  /* CompleteClass */
  override val unit: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSUnitValue/value) */
  /* standard dom */
  /* CompleteClass */
  var value: Double = js.native
}
