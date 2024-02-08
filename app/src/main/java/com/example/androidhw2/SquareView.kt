package com.example.androidhw2

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class SquareView(
    context: Context,
    attributeSet: AttributeSet
) : View(context, attributeSet){
    private val paint = Paint()

    init {
        paint.style = Paint.Style.FILL // закрашивает фигуру
        paint.color = Color.BLACK
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        canvas.drawRect(0f, 0f, width.toFloat(), height.toFloat(), paint)
    }
}