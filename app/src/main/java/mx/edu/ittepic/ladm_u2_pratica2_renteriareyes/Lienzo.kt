package mx.edu.ittepic.ladm_u2_pratica2_renteriareyes

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View

class Lienzo  (p:MainActivity) : View(p) {

    var puntero = p
    var circulo = FiguraGeometrica(150, 150, 120)
    var circulo2 = FiguraGeometrica(500, 1400, 50)
    var circulo3 = FiguraGeometrica(240, 750, 30)
    var circulo4 = FiguraGeometrica(900, 1250, 70)
    var circulo5 = FiguraGeometrica(700, 100, 60)
    var circulo6 = FiguraGeometrica(300, 1250, 85)
    var circulo7 = FiguraGeometrica(5, 5, 110)
    var circulo8 = FiguraGeometrica(40, 900, 45)
    var circulo9 = FiguraGeometrica(10, 10, 68)
    var punteroFiguraGeometrica: FiguraGeometrica? = null

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        var paint = Paint()

        //Color de fondo:
        canvas.drawColor(Color.WHITE)

        //--------------------- DIBUAR LOS CIRCULOS -----------------------//
        paint.color = Color.rgb(255,85,137)
        circulo2.pintar(canvas, paint)


        paint.color = Color.rgb(188,182,215)
        paint.style = Paint.Style.FILL
        circulo.pintar(canvas, paint)


        paint.color = Color.rgb(139,218,252)
        paint.style = Paint.Style.FILL
        circulo3.pintar(canvas, paint)


        paint.color = Color.rgb(248,211,231)
        paint.style = Paint.Style.FILL
        circulo4.pintar(canvas, paint)


        paint.color = Color.rgb(210,128,240)
        paint.style = Paint.Style.FILL
        circulo5.pintar(canvas, paint)


        paint.color = Color.rgb(1,200,233)
        paint.style = Paint.Style.FILL
        circulo6.pintar(canvas, paint)


        paint.color = Color.rgb(156,211,145)
        paint.style = Paint.Style.FILL
        circulo7.pintar(canvas, paint)


        paint.color = Color.rgb(248,163,179)
        paint.style = Paint.Style.FILL
        circulo8.pintar(canvas, paint)


        paint.color = Color.rgb(243,219,131)
        paint.style = Paint.Style.FILL
        circulo9.pintar(canvas, paint)




    }

    // ------------- FUNCION PARA ANIMAR LOS CIRCULO ------------//
    fun animarCirculo() {
        circulo2.rebote(width, height)
        circulo.rebote(width,height)
        circulo3.rebote(width,height)
        circulo4.rebote(width,height)
        circulo5.rebote(width,height)
        circulo6.rebote(width,height)
        circulo7.rebote(width,height)
        circulo8.rebote(width,height)
        circulo9.rebote(width,height)

        invalidate()
    }



}//class