package typings.std

import typings.std.stdStrings.setter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Context provided to a class setter decorator.
  * @template This The type on which the class element will be defined. For a static class element, this will be
  * the type of the constructor. For a non-static class element, this will be the type of the instance.
  * @template Value The type of the decorated class setter.
  */
trait ClassSetterDecoratorContext[This, Value] extends StObject {
  
  /** An object that can be used to access the current value of the class element at runtime. */
  /* standard decorators */
  val access: typings.std.anon.Set[This, Value]
  
  /**
    * Adds a callback to be invoked either before static initializers are run (when
    * decorating a `static` element), or before instance initializers are run (when
    * decorating a non-`static` element).
    */
  /* standard decorators */
  def addInitializer(initializer: js.ThisFunction0[/* this */ This, Unit]): Unit
  
  /** The kind of class element that was decorated. */
  /* standard decorators */
  val kind: setter
  
  /* standard decorators */
  val metadata: DecoratorMetadata
  
  /** The name of the decorated class element. */
  /* standard decorators */
  val name: java.lang.String | js.Symbol
  
  /** A value indicating whether the class element has a private name. */
  /* standard decorators */
  val `private`: scala.Boolean
  
  /** A value indicating whether the class element is a static (`true`) or instance (`false`) element. */
  /* standard decorators */
  val static: scala.Boolean
}
object ClassSetterDecoratorContext {
  
  inline def apply[This, Value](
    access: typings.std.anon.Set[This, Value],
    addInitializer: js.ThisFunction0[/* this */ This, Unit] => Unit,
    metadata: DecoratorMetadata,
    name: java.lang.String | js.Symbol,
    `private`: scala.Boolean,
    static: scala.Boolean
  ): ClassSetterDecoratorContext[This, Value] = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], addInitializer = js.Any.fromFunction1(addInitializer), kind = "setter", metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassSetterDecoratorContext[This, Value]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClassSetterDecoratorContext[?, ?], This, Value] (val x: Self & (ClassSetterDecoratorContext[This, Value])) extends AnyVal {
    
    inline def setAccess(value: typings.std.anon.Set[This, Value]): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
    
    inline def setAddInitializer(value: js.ThisFunction0[/* this */ This, Unit] => Unit): Self = StObject.set(x, "addInitializer", js.Any.fromFunction1(value))
    
    inline def setKind(value: setter): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: DecoratorMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setName(value: java.lang.String | js.Symbol): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPrivate(value: scala.Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
    
    inline def setStatic(value: scala.Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
  }
}
