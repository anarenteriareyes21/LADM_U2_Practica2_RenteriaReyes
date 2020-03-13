package mx.edu.ittepic.ladm_u2_pratica2_renteriareyes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    var miLienzo  : Lienzo ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        miLienzo = Lienzo(this)
        setContentView(miLienzo!!)
        HiloAnimacion(this).start()
    }
}
