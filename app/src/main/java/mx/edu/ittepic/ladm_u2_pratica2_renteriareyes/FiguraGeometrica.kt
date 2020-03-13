package mx.edu.ittepic.ladm_u2_pratica2_renteriareyes

import android.graphics.Canvas
import android.graphics.Paint
import android.view.MotionEvent

class FiguraGeometrica (){
    var x = 0f
    var y = 0f
    var radio = 0f
    var ancho = 0f
    var alto = 0f
    var incX = 5
    var incY = 5

    constructor(x:Int, y:Int, radio:Int) : this(){
        this.x = x.toFloat()
        this.y = y.toFloat()
        this.radio = radio.toFloat()
        // ------------- MODIFICAR VELOCIDAD DEPENDIENDO TAMAÑO ------------//
        if((this.radio).toInt() == 30){
            incY = 8
            incX = 6
        }
        if((this.radio).toInt() == 60){
            incY = 6
        }
        if((this.radio).toInt() == 50){
            incY = 4
            incX = 7
        }

        if((this.radio).toInt() == 50){
            incY = 6
        }

        if((this.radio).toInt() == 120){
            incY = 2
        }
        if((this.radio).toInt() == 110){
            incY = 3
        }
    }



    fun pintar(c: Canvas, p: Paint){
        c.drawCircle(x,y,radio,p)
    }


    fun rebote(ancho:Int, alto:Int){
        x+= incX
        if(x<=-50 || x>=ancho){
            incX *= -1
        }
        y+= incY
        if(y<=-50 || y>=alto){
            incY *= -1
        }

    }


}//class