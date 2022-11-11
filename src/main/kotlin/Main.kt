 import java.awt.event.MouseEvent
import java.awt.event.MouseListener
import javax.swing.JFrame

object mySingleton{

}

class MyClass {
    companion object{
        const val  MY_INT = 10
    }
}
fun main(args: Array<String>) {

    val jFrame = JFrame()
//    dodanie nasłuchiwania na zdarzenia myszki
    jFrame.addMouseListener(object: MouseListener{
        override fun mouseClicked(e: MouseEvent?) {
            println("Click")
        }

        override fun mousePressed(e: MouseEvent?) {
            TODO("Not yet implemented")
        }

        override fun mouseReleased(e: MouseEvent?) {
            TODO("Not yet implemented")
        }

        override fun mouseEntered(e: MouseEvent?) {
            TODO("Not yet implemented")
        }

        override fun mouseExited(e: MouseEvent?) {
            TODO("Not yet implemented")
        }

    })

    jFrame.isVisible = true
}