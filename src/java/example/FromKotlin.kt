package example

import java.util.concurrent.Callable

class FromKotlin() {
    fun callClj(): String {
        val fn = Main.callClojure("example.impl", "create-hello-fn") as Callable<String>
        return fn.call()
    }
}
