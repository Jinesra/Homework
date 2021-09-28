package com.example.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var flag = 0
        val star: ImageView = findViewById(R.id.star_image)
        star.setOnClickListener {
            val animation: Animation =
                AnimationUtils.loadAnimation(applicationContext, R.anim.rotate)
            val animation2: Animation =
                AnimationUtils.loadAnimation(applicationContext, R.anim.alpha)
            val animation3: Animation =
                AnimationUtils.loadAnimation(applicationContext, R.anim.scale)
            val animation4: Animation =
                AnimationUtils.loadAnimation(applicationContext, R.anim.translate)
            if (flag==0) {
                it.startAnimation(animation)
                flag = 1;
            } else if (flag==1)
            {
                it.startAnimation(animation2)
                flag = 2;
            } else if (flag==2)
            {
                it.startAnimation(animation3)
                flag = 3;
            }
            else if (flag==3)
            {
                it.startAnimation(animation4)
                flag = 0;
            }
        }
    }

    fun toastMe(view: android.view.View) {
        Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT).show()
    }



}