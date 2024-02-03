package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The nodes of a document subtree and a position within them.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker)
  */
trait TreeWalker extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/currentNode) */
  /* standard dom */
  var currentNode: org.scalajs.dom.Node
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/filter) */
  /* standard dom */
  val filter: org.scalajs.dom.NodeFilter | Null
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/firstChild) */
  /* standard dom */
  def firstChild(): org.scalajs.dom.Node | Null
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/lastChild) */
  /* standard dom */
  def lastChild(): org.scalajs.dom.Node | Null
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/nextNode) */
  /* standard dom */
  def nextNode(): org.scalajs.dom.Node | Null
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/nextSibling) */
  /* standard dom */
  def nextSibling(): org.scalajs.dom.Node | Null
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/parentNode) */
  /* standard dom */
  def parentNode(): org.scalajs.dom.Node | Null
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/previousNode) */
  /* standard dom */
  def previousNode(): org.scalajs.dom.Node | Null
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/previousSibling) */
  /* standard dom */
  def previousSibling(): org.scalajs.dom.Node | Null
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/root) */
  /* standard dom */
  val root: org.scalajs.dom.Node
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/whatToShow) */
  /* standard dom */
  val whatToShow: Double
}
object TreeWalker {
  
  inline def apply(
    currentNode: org.scalajs.dom.Node,
    firstChild: () => org.scalajs.dom.Node | Null,
    lastChild: () => org.scalajs.dom.Node | Null,
    nextNode: () => org.scalajs.dom.Node | Null,
    nextSibling: () => org.scalajs.dom.Node | Null,
    parentNode: () => org.scalajs.dom.Node | Null,
    previousNode: () => org.scalajs.dom.Node | Null,
    previousSibling: () => org.scalajs.dom.Node | Null,
    root: org.scalajs.dom.Node,
    whatToShow: Double
  ): TreeWalker = {
    val __obj = js.Dynamic.literal(currentNode = currentNode.asInstanceOf[js.Any], firstChild = js.Any.fromFunction0(firstChild), lastChild = js.Any.fromFunction0(lastChild), nextNode = js.Any.fromFunction0(nextNode), nextSibling = js.Any.fromFunction0(nextSibling), parentNode = js.Any.fromFunction0(parentNode), previousNode = js.Any.fromFunction0(previousNode), previousSibling = js.Any.fromFunction0(previousSibling), root = root.asInstanceOf[js.Any], whatToShow = whatToShow.asInstanceOf[js.Any], filter = null)
    __obj.asInstanceOf[TreeWalker]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TreeWalker] (val x: Self) extends AnyVal {
    
    inline def setCurrentNode(value: org.scalajs.dom.Node): Self = StObject.set(x, "currentNode", value.asInstanceOf[js.Any])
    
    inline def setFilter(value: org.scalajs.dom.NodeFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterNull: Self = StObject.set(x, "filter", null)
    
    inline def setFirstChild(value: () => org.scalajs.dom.Node | Null): Self = StObject.set(x, "firstChild", js.Any.fromFunction0(value))
    
    inline def setLastChild(value: () => org.scalajs.dom.Node | Null): Self = StObject.set(x, "lastChild", js.Any.fromFunction0(value))
    
    inline def setNextNode(value: () => org.scalajs.dom.Node | Null): Self = StObject.set(x, "nextNode", js.Any.fromFunction0(value))
    
    inline def setNextSibling(value: () => org.scalajs.dom.Node | Null): Self = StObject.set(x, "nextSibling", js.Any.fromFunction0(value))
    
    inline def setParentNode(value: () => org.scalajs.dom.Node | Null): Self = StObject.set(x, "parentNode", js.Any.fromFunction0(value))
    
    inline def setPreviousNode(value: () => org.scalajs.dom.Node | Null): Self = StObject.set(x, "previousNode", js.Any.fromFunction0(value))
    
    inline def setPreviousSibling(value: () => org.scalajs.dom.Node | Null): Self = StObject.set(x, "previousSibling", js.Any.fromFunction0(value))
    
    inline def setRoot(value: org.scalajs.dom.Node): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setWhatToShow(value: Double): Self = StObject.set(x, "whatToShow", value.asInstanceOf[js.Any])
  }
}
