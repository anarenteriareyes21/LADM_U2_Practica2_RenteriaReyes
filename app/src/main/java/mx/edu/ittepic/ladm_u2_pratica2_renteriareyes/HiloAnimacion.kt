package mx.edu.ittepic.ladm_u2_pratica2_renteriareyes

class HiloAnimacion (p:MainActivity):Thread(){
    var puntero = p

    override fun run() {
        super.run()

        while(true){
            sleep(10)
            puntero.runOnUiThread {
                puntero.miLienzo!!.animarCirculo()
            }
        }
    }
}