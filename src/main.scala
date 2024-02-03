import typings.slintUi.mod as slint
import scala.scalajs.js

@main
def main = {
    println(" ^^ slint4s ^^")
    
    val ui: js.Object = slint.loadFile("about.slint")
    
    // HOW DA FUCK DO I GO FROM a OBJECT TO BE ABLE TO 
    // call on it a "new Demo()" component that is comming from the
    // slint file ???

    //val x = typings.std.global.Reflect.getPrototypeOf(ui)
    //println(x)

    //val window = new ui.Demo()
    
    //val x = demo.run().toFuture
//    Await.result(x, Duration(5, TimeUnit.SECONDS)

}

