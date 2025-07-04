package com.example.translationpistol

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    private val REQUEST_PERMISSIONS = 1001
    private lateinit var txtResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtResult = findViewById(R.id.txtResult)
        val btnCapture = findViewById<Button>(R.id.btnCapture)
        val btnTranslate = findViewById<Button>(R.id.btnTranslate)

        // 请求相机权限
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.CAMERA), REQUEST_PERMISSIONS)
        }

        // 拍照功能暂未实现
        btnCapture.setOnClickListener { /* 实现拍照逻辑 */ }

        // 翻译功能暂未实现
        btnTranslate.setOnClickListener { /* 实现翻译逻辑 */ }
    }
}