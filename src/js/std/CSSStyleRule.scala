package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CSSStyleRule represents a single CSS style rule. It implements the CSSRule interface with a type value of 1 (CSSRule.STYLE_RULE).
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleRule)
  */
@js.native
trait CSSStyleRule
  extends StObject
     with CSSRule {
  
  /* standard dom */
  val cssRules: org.scalajs.dom.CSSRuleList = js.native
  
  /* standard dom */
  def deleteRule(index: Double): Unit = js.native
  
  /* standard dom */
  def insertRule(rule: java.lang.String): Double = js.native
  def insertRule(rule: java.lang.String, index: Double): Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleRule/selectorText) */
  /* standard dom */
  var selectorText: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleRule/style) */
  /* standard dom */
  val style: org.scalajs.dom.CSSStyleDeclaration = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleRule/styleMap) */
  /* standard dom */
  val styleMap: StylePropertyMap = js.native
}
