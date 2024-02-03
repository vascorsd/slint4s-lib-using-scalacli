//> using target.platform js

package typings.slintUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DictK[T]
    extends StObject
       with /* K */ StringDictionary[T] {
    
    @JSName("")
    val _empty: js.Symbol
  }
  object DictK {
    
    inline def apply[T](_empty: js.Symbol): DictK[T] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("")(_empty.asInstanceOf[js.Any])
      __obj.asInstanceOf[DictK[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DictK[?], T] (val x: Self & DictK[T]) extends AnyVal {
      
      inline def set_empty(value: js.Symbol): Self = StObject.set(x, "", value.asInstanceOf[js.Any])
    }
  }
  
  trait QuitOnLastWindowClosed extends StObject {
    
    var quitOnLastWindowClosed: js.UndefOr[Boolean] = js.undefined
    
    var runningCallback: js.UndefOr[js.Function] = js.undefined
  }
  object QuitOnLastWindowClosed {
    
    inline def apply(): QuitOnLastWindowClosed = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QuitOnLastWindowClosed]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QuitOnLastWindowClosed] (val x: Self) extends AnyVal {
      
      inline def setQuitOnLastWindowClosed(value: Boolean): Self = StObject.set(x, "quitOnLastWindowClosed", value.asInstanceOf[js.Any])
      
      inline def setQuitOnLastWindowClosedUndefined: Self = StObject.set(x, "quitOnLastWindowClosed", js.undefined)
      
      inline def setRunningCallback(value: js.Function): Self = StObject.set(x, "runningCallback", value.asInstanceOf[js.Any])
      
      inline def setRunningCallbackUndefined: Self = StObject.set(x, "runningCallback", js.undefined)
    }
  }
}
